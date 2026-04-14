package mk.ukim.finki.emt.rentalapi.service;

import mk.ukim.finki.emt.rentalapi.model.domain.Country;

import java.util.List;

public interface CountryService {

    // Returns all countries from the database
    List<Country> findAll();
}