package com.example.TravelAgency.controllers;

import com.example.TravelAgency.domain.trips.Continent;
import com.example.TravelAgency.domain.trips.city.CityDTO;
import com.example.TravelAgency.domain.trips.city.CityService;
import com.example.TravelAgency.domain.trips.country.Country;
import com.example.TravelAgency.domain.trips.country.CountryDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

@RestController
@RequestMapping ("/cities")
public class CityController {

    private final CityService cityService;

    public CityController(CityService cityService) {
        this.cityService = cityService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<CityDTO> getCity(@PathVariable Long id) {
        return cityService.getCityById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/{country}")
    public ResponseEntity<List<CityDTO>> getCityByCountry(@PathVariable Country country) {
        List<CityDTO> cityDTOList = cityService.getCityByCountry(country);
        return new ResponseEntity<List<CityDTO>>(cityDTOList, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Void> addCity(@RequestBody CityDTO cityDTO) throws URISyntaxException {
        Long cityId = cityService.addCity(cityDTO);
        return ResponseEntity
                .created(new URI("/cities/" + cityId))
                .build();

    }

    @DeleteMapping ("/{deleteId}")
    public ResponseEntity <Void> deleteCity(@PathVariable Long deleteId){
        cityService.deleteCity(deleteId);
        return ResponseEntity
                .noContent()
                .build();
    }
}
