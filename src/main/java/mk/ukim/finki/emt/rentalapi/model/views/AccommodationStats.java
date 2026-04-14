package mk.ukim.finki.emt.rentalapi.model.views;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import mk.ukim.finki.emt.rentalapi.model.enums.AccommodationCategory;
import org.hibernate.annotations.Immutable;

import java.math.BigDecimal;

@Entity
@Immutable
@Table(name = "accommodation_stats")
@Getter
@NoArgsConstructor
public class AccommodationStats {

    @Id
    @Enumerated(EnumType.STRING)
    // The category column is our primary key here since each category appears only once
    @Column(name = "category")
    private AccommodationCategory category;

    @Column(name = "total_accommodations")
    private Long totalAccommodations;

    @Column(name = "total_rooms")
    private Long totalRooms;

    @Column(name = "total_rented_rooms")
    private Long totalRentedRooms;

    @Column(name = "avg_rooms_per_accommodation")
    private BigDecimal avgRoomsPerAccommodation;
}