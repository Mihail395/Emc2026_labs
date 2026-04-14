package mk.ukim.finki.emt.rentalapi.service;

import mk.ukim.finki.emt.rentalapi.model.domain.Host;

import java.util.List;

public interface HostService {

    // Returns all hosts from the database
    List<Host> findAll();
}