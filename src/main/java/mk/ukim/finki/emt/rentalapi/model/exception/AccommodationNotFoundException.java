package mk.ukim.finki.emt.rentalapi.model.exception;

public class AccommodationNotFoundException extends RuntimeException {
    public AccommodationNotFoundException(Long id) {
        super("Accommodation not found with id: " + id);
    }
}