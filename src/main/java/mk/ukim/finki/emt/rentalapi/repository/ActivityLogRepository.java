package mk.ukim.finki.emt.rentalapi.repository;

import mk.ukim.finki.emt.rentalapi.model.domain.ActivityLog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ActivityLogRepository extends JpaRepository<ActivityLog, Long> {

    Page<ActivityLog> findAllByOrderByEventTimeDesc(Pageable pageable);
}