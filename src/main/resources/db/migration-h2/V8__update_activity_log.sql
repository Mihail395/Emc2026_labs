ALTER TABLE activity_log
    ADD COLUMN accommodation_id BIGINT DEFAULT 0 NOT NULL;
ALTER TABLE activity_log
    ADD COLUMN host_id BIGINT DEFAULT 0 NOT NULL;
ALTER TABLE activity_log
    ADD COLUMN host_full_name VARCHAR(200) DEFAULT '' NOT NULL;