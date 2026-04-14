package mk.ukim.finki.emt.rentalapi.model.projection;

import mk.ukim.finki.emt.rentalapi.model.enums.AccommodationCategory;
import mk.ukim.finki.emt.rentalapi.model.enums.AccommodationCondition;

public interface AccommodationExtendedProjection {

    Long getId();
    String getName();
    AccommodationCategory getCategory();
    AccommodationCondition getCondition();
    Integer getNumRooms();
    Integer getRentedRooms();

    HostInfo getHost();

    // Nested interface — maps to the Host entity fields
    interface HostInfo {
        String getName();
        String getSurname();

        // Another level of nesting — maps to the Country entity
        CountryInfo getCountry();

        interface CountryInfo {
            String getName();
            String getContinent();
        }
    }
}
