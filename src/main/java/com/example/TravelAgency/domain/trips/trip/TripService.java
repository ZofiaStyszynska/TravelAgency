package com.example.TravelAgency.domain.trips.trip;

import com.example.TravelAgency.domain.trips.Continent;
import com.example.TravelAgency.domain.trips.city.City;
import com.example.TravelAgency.domain.trips.city.CityDTO;
import com.example.TravelAgency.domain.trips.country.Country;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class TripService {
    private final TripRepository tripRepository;

    public TripService(TripRepository tripRepository) {
        this.tripRepository = tripRepository;
    }

    public Optional<TripDTO> getTripById (Long id) {
        return tripRepository.findById(id)
                .map(TripDTO::fromTrip);
    }

    public List<TripDTO> getTripByName (String  tripName) {
        return tripRepository.findByTripName(tripName).stream()
                .map(TripDTO::fromTrip)
                .collect(Collectors.toList());
    }

    public List<TripDTO> getTripByContinent (Continent continent) {
        return tripRepository.findByContinent(continent).stream()
                .map(TripDTO::fromTrip)
                .collect(Collectors.toList());
    }

    public List<TripDTO> getTripByCountry (Country  country) {
        return tripRepository.findByCountry(country).stream()
                .map(TripDTO::fromTrip)
                .collect(Collectors.toList());
    }

    public List<TripDTO> getTripByCity (City  city) {
        return tripRepository.findByCity(city).stream()
                .map(TripDTO::fromTrip)
                .collect(Collectors.toList());
    }

    public List<TripDTO> getTripByTripStartDate (LocalDate tripStartDate) {
        return tripRepository.findByTripStartDate(tripStartDate).stream()
                .map(TripDTO::fromTrip)
                .collect(Collectors.toList());
    }

    public List<TripDTO> getTripByTripEndDate (LocalDate tripEndDate) {
        return tripRepository.findByTripEndDate(tripEndDate).stream()
                .map(TripDTO::fromTrip)
                .collect(Collectors.toList());
    }

    public Long addTrip (TripDTO tripDTO) {
        final Trip trip = tripRepository
                .save(new Trip(tripDTO.getTripName(),tripDTO.getContinent(),
                        tripDTO.getCountry(), tripDTO.getCity(), tripDTO.getTripStartDate(), tripDTO.getTripEndDate()));
        return trip.getId();
    }

    public Long deleteTrip (Long id){
        final Optional<Trip> optionalTrip = tripRepository.findById(id);
        optionalTrip.ifPresent(trip -> trip.setDeleted(true));
        return optionalTrip.get().getId();
    }
}
