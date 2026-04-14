package mk.ukim.finki.emt.rentalapi.model.exception;

public class HostNotFoundException extends RuntimeException {
    public HostNotFoundException(Long id) {
        super("Host not found with id: " + id);
    }
}