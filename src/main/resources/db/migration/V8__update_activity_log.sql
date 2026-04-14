-- Add columns as nullable first
ALTER TABLE activity_log
    ADD COLUMN accommodation_id  BIGINT       DEFAULT 0,
    ADD COLUMN host_id           BIGINT       DEFAULT 0,
    ADD COLUMN host_full_name    VARCHAR(200) DEFAULT '';

-- Update existing rows with default values
UPDATE activity_log SET
                        accommodation_id = 0,
                        host_id = 0,
                        host_full_name = 'Unknown';

-- Now add NOT NULL constraint after data is populated
ALTER TABLE activity_log
    ALTER COLUMN accommodation_id SET NOT NULL,
ALTER COLUMN host_id SET NOT NULL,
    ALTER COLUMN host_full_name SET NOT NULL;