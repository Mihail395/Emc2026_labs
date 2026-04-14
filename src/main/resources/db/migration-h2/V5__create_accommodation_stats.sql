-- H2 does not support MATERIALIZED VIEW
-- Using a regular VIEW as a fallback
CREATE VIEW accommodation_stats AS
SELECT
    a.category                          AS category,
    COUNT(a.id)                         AS total_accommodations,
    SUM(a.num_rooms)                    AS total_rooms,
    SUM(a.rented_rooms)                 AS total_rented_rooms,
    AVG(CAST(a.num_rooms AS NUMERIC))   AS avg_rooms_per_accommodation
FROM accommodation a
GROUP BY a.category;