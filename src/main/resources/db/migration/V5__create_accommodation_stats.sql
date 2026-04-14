CREATE MATERIALIZED VIEW accommodation_stats AS
SELECT
    CAST(a.category AS VARCHAR)     AS category,
    COUNT(a.id)                     AS total_accommodations,
    SUM(a.num_rooms)                AS total_rooms,
    SUM(a.rented_rooms)             AS total_rented_rooms,
    AVG(a.num_rooms)                AS avg_rooms_per_accommodation
FROM accommodation a
GROUP BY a.category;