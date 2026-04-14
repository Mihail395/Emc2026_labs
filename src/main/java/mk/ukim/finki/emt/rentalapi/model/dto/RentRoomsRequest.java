package mk.ukim.finki.emt.rentalapi.model.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;

public record RentRoomsRequest(

        @NotNull(message = "Number of rooms must not be null")
        @Min(value = 1, message = "Number of rooms to rent must be at least 1")
        Integer numRooms
) {}