package mk.ukim.finki.emt.rentalapi.model.projection;

import mk.ukim.finki.emt.rentalapi.model.enums.AccommodationCategory;

public interface AccommodationShortProjection {

    Long getId();
    String getName();
    AccommodationCategory getCategory();
    Integer getNumRooms();
    Integer getRentedRooms();
}