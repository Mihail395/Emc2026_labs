package mk.ukim.finki.emt.rentalapi.model.dto;

public record HostPopularityDto(
        Long hostId,
        String hostFullName,
        Long timesRented
) {}