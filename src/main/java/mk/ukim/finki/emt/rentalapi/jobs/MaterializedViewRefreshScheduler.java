package mk.ukim.finki.emt.rentalapi.jobs;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Slf4j
@Component
public class MaterializedViewRefreshScheduler {

    @PersistenceContext
    private EntityManager entityManager;

    @Scheduled(cron = "0 * * * * *")
    @Transactional
    public void refreshAccommodationStats() {
        try {
            log.info("Refreshing accommodation_stats materialized view...");
            entityManager
                    .createNativeQuery("REFRESH MATERIALIZED VIEW accommodation_stats")
                    .executeUpdate();
            log.info("accommodation_stats materialized view successfully refreshed.");
        } catch (Exception e) {
            log.warn("Could not refresh materialized view: {}", e.getMessage());
        }
    }
}