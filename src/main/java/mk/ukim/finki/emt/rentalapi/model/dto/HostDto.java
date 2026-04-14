package mk.ukim.finki.emt.rentalapi.model.dto;

import java.time.LocalDateTime;

public record HostDto(
        Long id,
        LocalDateTime createdAt,
        LocalDateTime updatedAt,
        String name,
        String surname,
        CountryDto country
) {}
