package com.example.TravelAgency.controllers;

import com.example.TravelAgency.domain.trips.Continent;
import com.example.TravelAgency.domain.trips.country.CountryDTO;
import com.example.TravelAgency.domain.trips.country.CountryService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

@RestController
@RequestMapping("/countries")
public class CountryController {

    private final CountryService countryService;

    public CountryController(CountryService countryService) {
        this.countryService = countryService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<CountryDTO> getCountry(@PathVariable Long id) {
        return countryService.getCountryById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/{continent}")
    public ResponseEntity<List<CountryDTO>> getCountryByContinent(@PathVariable Continent continent) {
        List<CountryDTO> countryDTOList = countryService.getCountryByContinent(continent);

        return new ResponseEntity<List<CountryDTO>>(countryDTOList, HttpStatus.OK);

    }
    @PostMapping
    public ResponseEntity<Void> addCountry(@RequestBody CountryDTO countryDTO) throws URISyntaxException {
        Long countryId = countryService.addCountry(countryDTO);

        return ResponseEntity
                .created(new URI("/countries/" + countryId))
                .build();

    }

    @DeleteMapping ("/{deleteId}")
    public ResponseEntity <Void> deleteCountry(@PathVariable Long deleteId){
        countryService.deleteCountry(deleteId);
        return ResponseEntity
                .noContent()
                .build();
    }

}
