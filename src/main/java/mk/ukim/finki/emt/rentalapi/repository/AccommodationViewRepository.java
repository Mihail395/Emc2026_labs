package mk.ukim.finki.emt.rentalapi.repository;

import mk.ukim.finki.emt.rentalapi.model.views.AccommodationView;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccommodationViewRepository extends JpaRepository<AccommodationView, Long> {
}