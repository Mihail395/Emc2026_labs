package mk.ukim.finki.emt.rentalapi.listener;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import mk.ukim.finki.emt.rentalapi.event.AccommodationFullyBookedEvent;
import mk.ukim.finki.emt.rentalapi.model.domain.Accommodation;
import mk.ukim.finki.emt.rentalapi.model.domain.ActivityLog;
import mk.ukim.finki.emt.rentalapi.repository.ActivityLogRepository;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Slf4j
@Component
@RequiredArgsConstructor
public class AccommodationFullyBookedListener {

    private final ActivityLogRepository activityLogRepository;

    @EventListener
    public void handleFullyBooked(AccommodationFullyBookedEvent event) {
        Accommodation accommodation = event.getAccommodation();

        log.warn("FULLY BOOKED - Accommodation: '{}' (id: {}) | Category: {} | Total rooms: {} | All rooms are now occupied.",
                accommodation.getName(),
                accommodation.getId(),
                accommodation.getCategory(),
                accommodation.getNumRooms());

        // Save to activity_log table
        ActivityLog activityLog = new ActivityLog();
        activityLog.setAccommodationName(accommodation.getName());
        activityLog.setEventTime(LocalDateTime.now());
        activityLog.setEventType("FULLY_BOOKED");
        activityLogRepository.save(activityLog);
    }
}