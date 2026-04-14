package mk.ukim.finki.emt.rentalapi.model.exception;

public class InvalidAccommodationStateException extends RuntimeException {
    public InvalidAccommodationStateException(String message) {
        super(message);
    }
}
