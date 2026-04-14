package mk.ukim.finki.emt.rentalapi.model.exception;

public class NotEnoughRoomsException extends RuntimeException {
    public NotEnoughRoomsException(Long id, int requested, int available) {
        super("Accommodation with id: " + id + " only has " + available
                + " available rooms but " + requested + " were requested");
    }
}
