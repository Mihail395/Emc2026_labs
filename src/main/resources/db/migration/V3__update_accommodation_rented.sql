ALTER TABLE accommodation DROP COLUMN rented;
ALTER TABLE accommodation ADD COLUMN rented_rooms INTEGER NOT NULL DEFAULT 0;