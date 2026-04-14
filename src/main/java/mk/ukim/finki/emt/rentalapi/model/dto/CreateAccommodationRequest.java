package mk.ukim.finki.emt.rentalapi.model.dto;

import mk.ukim.finki.emt.rentalapi.model.enums.AccommodationCategory;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record CreateAccommodationRequest(

        @NotBlank(message = "Name must not be blank")
        String name,

        @NotNull(message = "Category must not be null")
        AccommodationCategory category,

        @NotNull(message = "Host ID must not be null")
        Long hostId,

        @NotNull(message = "Number of rooms must not be null")
        @Min(value = 1, message = "Number of rooms must be at least 1")
        Integer numRooms
) {}
