package mk.ukim.finki.emt.rentalapi.model.dto;

public record AccommodationPopularityDto(
        Long accommodationId,
        String accommodationName,
        Long timesRented
) {}