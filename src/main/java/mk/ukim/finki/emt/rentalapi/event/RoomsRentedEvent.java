package mk.ukim.finki.emt.rentalapi.event;

import lombok.Getter;
import mk.ukim.finki.emt.rentalapi.model.domain.Accommodation;
import org.springframework.context.ApplicationEvent;

@Getter
public class RoomsRentedEvent extends ApplicationEvent {

    private final Accommodation accommodation;
    private final int roomsRented;

    public RoomsRentedEvent(Object source, Accommodation accommodation, int roomsRented) {
        super(source);
        this.accommodation = accommodation;
        this.roomsRented = roomsRented;
    }
}