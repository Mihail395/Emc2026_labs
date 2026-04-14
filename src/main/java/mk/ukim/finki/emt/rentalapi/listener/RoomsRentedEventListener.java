package mk.ukim.finki.emt.rentalapi.listener;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import mk.ukim.finki.emt.rentalapi.event.RoomsRentedEvent;
import mk.ukim.finki.emt.rentalapi.model.domain.Accommodation;
import mk.ukim.finki.emt.rentalapi.model.domain.ActivityLog;
import mk.ukim.finki.emt.rentalapi.repository.ActivityLogRepository;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Slf4j
@Component
@RequiredArgsConstructor
public class RoomsRentedEventListener {

    private final ActivityLogRepository activityLogRepository;

    @EventListener
    public void handleRoomsRented(RoomsRentedEvent event) {
        Accommodation accommodation = event.getAccommodation();
        int availableRooms = accommodation.getNumRooms() - accommodation.getRentedRooms();

        // Log the rental
        log.info("Rooms rented - Accommodation: '{}', Rooms rented: {}, Available rooms remaining: {}",
                accommodation.getName(),
                event.getRoomsRented(),
                availableRooms);

        // Save to activity_log table
        ActivityLog log = new ActivityLog();
        log.setAccommodationId(accommodation.getId());
        log.setAccommodationName(accommodation.getName());
        log.setHostId(accommodation.getHost().getId());
        log.setHostFullName(
                accommodation.getHost().getName() + " " + accommodation.getHost().getSurname()
        );
        log.setEventTime(LocalDateTime.now());
        log.setEventType("ROOMS_RENTED");
        activityLogRepository.save(log);
    }
}