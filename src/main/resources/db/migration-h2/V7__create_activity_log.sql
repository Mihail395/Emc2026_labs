CREATE TABLE activity_log (
                              id                  BIGINT AUTO_INCREMENT PRIMARY KEY,
                              accommodation_name  VARCHAR(100) NOT NULL,
                              event_time          TIMESTAMP    NOT NULL,
                              event_type          VARCHAR(50)  NOT NULL
);