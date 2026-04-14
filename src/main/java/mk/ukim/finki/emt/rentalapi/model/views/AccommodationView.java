package mk.ukim.finki.emt.rentalapi.model.views;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import mk.ukim.finki.emt.rentalapi.model.enums.AccommodationCategory;
import org.hibernate.annotations.Immutable;

@Entity
@Immutable
@Table(name = "accommodation_view")
@Getter
@NoArgsConstructor
public class AccommodationView {

    @Id
    private Long id;

    @Column(name = "accommodation_name")
    private String accommodationName;

    @Enumerated(EnumType.STRING)
    @Column(name = "category")
    private AccommodationCategory category;

    @Column(name = "num_rooms")
    private Integer numRooms;

    @Column(name = "rented_rooms")
    private Integer rentedRooms;

    @Column(name = "available_rooms")
    private Integer availableRooms;

    @Column(name = "host_full_name")
    private String hostFullName;

    @Column(name = "country_name")
    private String countryName;
}
