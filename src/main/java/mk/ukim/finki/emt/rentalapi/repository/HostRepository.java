package mk.ukim.finki.emt.rentalapi.repository;

import mk.ukim.finki.emt.rentalapi.model.domain.Host;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HostRepository extends JpaRepository<Host, Long> {
}