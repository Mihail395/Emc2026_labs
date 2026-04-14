package mk.ukim.finki.emt.rentalapi.repository;

import mk.ukim.finki.emt.rentalapi.model.domain.ActivityLog;
import mk.ukim.finki.emt.rentalapi.model.dto.AccommodationPopularityDto;
import mk.ukim.finki.emt.rentalapi.model.dto.HostPopularityDto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ActivityLogRepository extends JpaRepository<ActivityLog, Long> {

    Page<ActivityLog> findAllByOrderByEventTimeDesc(Pageable pageable);

    @Query("""
        SELECT new mk.ukim.finki.emt.rentalapi.model.dto.AccommodationPopularityDto(
            a.accommodationId,
            a.accommodationName,
            COUNT(a.id)
        )
        FROM ActivityLog a
        WHERE a.eventType = 'ROOMS_RENTED'
        GROUP BY a.accommodationId, a.accommodationName
        ORDER BY COUNT(a.id) DESC
    """)
    List<AccommodationPopularityDto> findMostPopularAccommodations();


    @Query("""
        SELECT new mk.ukim.finki.emt.rentalapi.model.dto.HostPopularityDto(
            a.hostId,
            a.hostFullName,
            COUNT(a.id)
        )
        FROM ActivityLog a
        WHERE a.eventType = 'ROOMS_RENTED'
        GROUP BY a.hostId, a.hostFullName
        ORDER BY COUNT(a.id) DESC
    """)
    List<HostPopularityDto> findMostPopularHosts();
}