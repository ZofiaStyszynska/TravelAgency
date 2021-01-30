package com.example.TravelAgency.domain.trips.country;

import com.example.TravelAgency.domain.trips.Continent;
import com.example.TravelAgency.domain.trips.city.City;
import com.example.TravelAgency.domain.trips.city.CityDTO;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class CountryService {

    private final CountryRepository countryRepository;

    public CountryService(CountryRepository cityRepository) {
        this.countryRepository = cityRepository;
    }

    public Optional<CountryDTO> getCountryById (Long id) {
        return countryRepository.findById(id)
                .map(CountryDTO::formCountry);
    }

    public List<CountryDTO> getCountryByContinent (Continent continent) {
        return countryRepository.findByContinent(continent).stream()
                .map(CountryDTO::formCountry)
                .collect(Collectors.toList());
    }

    public Long addCountry (CountryDTO countryDTO) {
        final Country country = countryRepository.save(new Country(countryDTO.getCountryName(),countryDTO.getContinent()));
        return country.getId();
    }

    public Long deleteCountry (Long id){
        final Optional<Country> optionalCountry = countryRepository.findById(id);
        optionalCountry.ifPresent(country -> country.setDeleted(true));
        return optionalCountry.get().getId();
    }
}
