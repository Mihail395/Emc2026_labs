package mk.ukim.finki.emt.rentalapi.event;

import lombok.Getter;
import mk.ukim.finki.emt.rentalapi.model.domain.Accommodation;
import org.springframework.context.ApplicationEvent;

@Getter
public class AccommodationFullyBookedEvent extends ApplicationEvent {

    private final Accommodation accommodation;

    public AccommodationFullyBookedEvent(Object source, Accommodation accommodation) {
        super(source);
        this.accommodation = accommodation;
    }
}