package com.example.TravelAgency.controllers;

import com.example.TravelAgency.domain.trips.Continent;
import com.example.TravelAgency.domain.trips.city.City;
import com.example.TravelAgency.domain.trips.country.Country;
import com.example.TravelAgency.domain.trips.trip.Trip;
import com.example.TravelAgency.domain.trips.trip.TripDTO;
import com.example.TravelAgency.domain.trips.trip.TripService;
import com.example.TravelAgency.domain.user.User;
import com.example.TravelAgency.domain.user.UserDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

@RestController
@RequestMapping("/trips")
@CrossOrigin(origins = "http://localhost:4200")
public class TripController {

    private final TripService tripService;

    public TripController(TripService tripService) {
        this.tripService = tripService;
    }

    @GetMapping
    public List<TripDTO> getAllTrips(){
        return tripService.getAllTrips();
    }

    @GetMapping("/{id}")
    public ResponseEntity<TripDTO> getTrip(@PathVariable Long id) {
        return tripService.getTripById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/name/{tripName}")
    public ResponseEntity<List<TripDTO>> getTripByName (@PathVariable String tripName) {
        List<TripDTO> tripDTOList = tripService.getTripByName(tripName);
        return new ResponseEntity<List<TripDTO>>(tripDTOList, HttpStatus.OK);
    }
    @GetMapping("/continent/{continent}")
    public ResponseEntity<List<TripDTO>> getTripByContinent (@PathVariable Continent continent) {
        List<TripDTO> tripDTOList = tripService.getTripByContinent(continent);
        return new ResponseEntity<List<TripDTO>>(tripDTOList, HttpStatus.OK);
    }

    @GetMapping("/country/{country}")
    public ResponseEntity<List<TripDTO>> getTripByCountry (@PathVariable Country country) {
            List<TripDTO> tripDTOList = tripService.getTripByCountry(country);
            return new ResponseEntity<List<TripDTO>>(tripDTOList, HttpStatus.OK);
    }

    @GetMapping("/city/{city}")
    public ResponseEntity<List<TripDTO>> getTripByCity (@PathVariable City city) {
        List<TripDTO> tripDTOList = tripService.getTripByCity(city);
        return new ResponseEntity<List<TripDTO>>(tripDTOList, HttpStatus.OK);
    }
    @GetMapping("/usertrips/{user}")
    public ResponseEntity<List<TripDTO>> getTripsByUser(@PathVariable UserDTO user){
        List<TripDTO> tripDTOList = tripService.getTripsByUser(user);
        return new ResponseEntity<List<TripDTO>>(tripDTOList,HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Void> addTrip (@RequestBody TripDTO tripDTO) throws URISyntaxException {
        Long tripId = tripService.addTrip(tripDTO);
        return ResponseEntity
                .created(new URI("/trips/" + tripId))
                .build();
    }

    @DeleteMapping ("/{deleteId}")
    public ResponseEntity <Void> deleteTrip(@PathVariable Long deleteId){
        tripService.deleteTrip(deleteId);
        return ResponseEntity
                .noContent()
                .build();
    }


}
