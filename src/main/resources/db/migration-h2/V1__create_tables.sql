CREATE TABLE country (
                         id        BIGINT AUTO_INCREMENT PRIMARY KEY,
                         name      VARCHAR(100) NOT NULL,
                         continent VARCHAR(100) NOT NULL
);

CREATE TABLE host (
                      id         BIGINT AUTO_INCREMENT PRIMARY KEY,
                      created_at TIMESTAMP    NOT NULL,
                      updated_at TIMESTAMP    NOT NULL,
                      name       VARCHAR(100) NOT NULL,
                      surname    VARCHAR(100) NOT NULL,
                      country_id BIGINT       NOT NULL REFERENCES country (id)
);

CREATE TABLE accommodation (
                               id          BIGINT AUTO_INCREMENT PRIMARY KEY,
                               created_at  TIMESTAMP    NOT NULL,
                               updated_at  TIMESTAMP    NOT NULL,
                               name        VARCHAR(100) NOT NULL,
                               category    VARCHAR(50)  NOT NULL,
                               condition   VARCHAR(50)  NOT NULL,
                               host_id     BIGINT       NOT NULL REFERENCES host (id),
                               num_rooms   INTEGER      NOT NULL,
                               rented_rooms INTEGER     NOT NULL DEFAULT 0
);