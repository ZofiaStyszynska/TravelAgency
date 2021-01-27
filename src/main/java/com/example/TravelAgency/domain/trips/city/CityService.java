package com.example.TravelAgency.domain.trips.city;

import com.example.TravelAgency.domain.trips.Continent;
import com.example.TravelAgency.domain.trips.country.Country;
import com.example.TravelAgency.domain.trips.country.CountryDTO;
import com.example.TravelAgency.domain.trips.country.CountryRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class CityService {

    private final CityRepository cityRepository;

    public CityService(CityRepository cityRepository) {
        this.cityRepository = cityRepository;
    }

    public Optional<CityDTO> getCityById (Long id) {
        return cityRepository.findById(id)
                .map(CityDTO::fromCity);
    }

    public List<CityDTO> getCityByCountry (Country country) {
        return cityRepository.findByCountry(country).stream()
                .map(CityDTO::fromCity)
                .collect(Collectors.toList());
    }

    public Long addCity (CityDTO cityDTO) {
        final City city = cityRepository.save(new City(cityDTO.getCityName(),cityDTO.getCountry()));
        return city.getId();
    }

    public Long deleteCity (Long id){
        final Optional<City> optionalCity = cityRepository.findById(id);
        optionalCity.ifPresent(city -> city.setDeleted(true));
        return optionalCity.get().getId();
    }
}

