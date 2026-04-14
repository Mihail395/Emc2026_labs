package mk.ukim.finki.emt.rentalapi.model.dto;

import mk.ukim.finki.emt.rentalapi.model.enums.AccommodationCategory;
import mk.ukim.finki.emt.rentalapi.model.enums.AccommodationCondition;

public record AccommodationSummaryDto(
        Long id,
        String name,
        AccommodationCategory category,
        AccommodationCondition condition,
        Integer numRooms,
        Integer rentedRooms,
        Integer availableRooms,
        String hostFullName,
        String hostCountry
) {}