package com.example.TravelAgency.domain;

import com.example.TravelAgency.domain.trips.Continent;
import com.example.TravelAgency.domain.trips.city.City;
import com.example.TravelAgency.domain.trips.city.CityDTO;
import com.example.TravelAgency.domain.trips.city.CityRepository;
import com.example.TravelAgency.domain.trips.city.CityService;
import com.example.TravelAgency.domain.trips.country.Country;
import com.example.TravelAgency.domain.trips.country.CountryDTO;
import com.example.TravelAgency.domain.trips.country.CountryRepository;
import com.example.TravelAgency.domain.trips.country.CountryService;
import com.example.TravelAgency.domain.trips.trip.Trip;
import com.example.TravelAgency.domain.trips.trip.TripDTO;
import com.example.TravelAgency.domain.trips.trip.TripRepository;
import com.example.TravelAgency.domain.trips.trip.TripService;
import com.example.TravelAgency.domain.user.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.PostConstruct;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class MockData {

    @Autowired
    private CountryRepository countryRepository;
    @Autowired
    private CityRepository cityRepository;
    @Autowired
    private TripRepository tripRepository;
    @Autowired
    private UserRepository userRepository;

    @PostConstruct
    @Transactional
    public void generateMockData() {

        Country country1 = new Country("United Kingdom", Continent.EUROPE);
        Country country2 = new Country("Japan", Continent.ASIA);
        Country country3 = new Country("United States", Continent.NORTH_AMERICA);
        Country country4 = new Country("Tanzania", Continent.AFRICA);
        countryRepository.save(country1);
        countryRepository.save(country2);
        countryRepository.save(country3);
        countryRepository.save(country4);

        City city1 = new City("London", country1);
        City city2 = new City("Tokyo", country2);
        City city3 = new City("New York", country3);
        City city4 = new City("Zanzibar", country3);
        cityRepository.save(city1);
        cityRepository.save(city2);
        cityRepository.save(city3);
        cityRepository.save(city4);


        LocalDate trip1Start = LocalDate.of(2021, 7, 1);
        LocalDate trip1End = LocalDate.of(2021, 7, 10);
        LocalDate trip2Start = LocalDate.of(2021, 5, 7);
        LocalDate trip2End = LocalDate.of(2021, 5, 21);
        LocalDate trip3Start = LocalDate.of(2021, 8, 1);
        LocalDate trip3End = LocalDate.of(2021, 8, 21);


        Trip trip1 = new Trip("Tea Time", Continent.EUROPE, country1, city1, trip1Start, trip1End);
        Trip trip2 = new Trip("Kraj Kwitnącej Wiśni", Continent.ASIA, country2, city2, trip2Start, trip2End);
        Trip trip3 = new Trip("American Dream", Continent.NORTH_AMERICA, country3, city3, trip3Start, trip3End);
        Trip trip4 = new Trip("Feel the rythm", Continent.AFRICA,country4,city4,trip3Start, trip3End );
        tripRepository.save(trip1);
        tripRepository.save(trip2);
        tripRepository.save(trip3);


        Address address = new Address("Poznań", "Długa", "2", "61-858");
        List<Trip> purchasedTrips = new ArrayList<>();
        purchasedTrips.add(trip2);
        purchasedTrips.add(trip3);
        List<Trip> purchasedTrips1 = new ArrayList<>();
        purchasedTrips1.add(trip1);


        User user = new User("Adam", "Niezgódka", "a.niezgodka@wp.pl", address, "Kosmos1", Role.USER, purchasedTrips);
        userRepository.save(user);

        User user1 = new User("Ambroży", "Kleks", "a.kleks@wp.pl", address, "KaczkaDziwaczka", Role.USER,purchasedTrips1);
        userRepository.save(user1);
    }
}
