package mk.ukim.finki.emt.rentalapi.model.dto;

import mk.ukim.finki.emt.rentalapi.model.enums.*;

import java.time.LocalDateTime;

public record AccommodationDto(
        Long id,
        LocalDateTime createdAt,
        LocalDateTime updatedAt,
        String name,
        AccommodationCategory category,
        AccommodationCondition condition,
        HostDto host,
        Integer numRooms,
        Boolean rented
) {}
