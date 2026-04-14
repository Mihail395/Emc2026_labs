package mk.ukim.finki.emt.rentalapi.model.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ActivityLog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Accommodation ID for popularity
    @Column(nullable = false)
    private Long accommodationId;

    @Column(nullable = false)
    private String accommodationName;

    // Host ID and full name used for popularity endpoints
    @Column(nullable = false)
    private Long hostId;

    @Column(nullable = false)
    private String hostFullName;

    @Column(nullable = false)
    private LocalDateTime eventTime;

    @Column(nullable = false)
    private String eventType;
    // "ROOMS_RENTED" or "FULLY_BOOKED"
}