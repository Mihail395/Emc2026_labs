package mk.ukim.finki.emt.rentalapi.service.impl;

import lombok.RequiredArgsConstructor;
import mk.ukim.finki.emt.rentalapi.model.domain.Country;
import mk.ukim.finki.emt.rentalapi.repository.CountryRepository;
import mk.ukim.finki.emt.rentalapi.service.CountryService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor // Used for DI
public class CountryServiceImpl implements CountryService {

    private final CountryRepository countryRepository;
    //DI

    @Override
    public List<Country> findAll() {
        return countryRepository.findAll();
    }
}