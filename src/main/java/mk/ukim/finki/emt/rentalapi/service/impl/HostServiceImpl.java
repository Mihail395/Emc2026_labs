package mk.ukim.finki.emt.rentalapi.service.impl;

import lombok.RequiredArgsConstructor;
import mk.ukim.finki.emt.rentalapi.model.domain.Host;
import mk.ukim.finki.emt.rentalapi.repository.HostRepository;
import mk.ukim.finki.emt.rentalapi.service.HostService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class HostServiceImpl implements HostService {

    private final HostRepository hostRepository;

    @Override
    public List<Host> findAll() {
        return hostRepository.findAll();
    }
}