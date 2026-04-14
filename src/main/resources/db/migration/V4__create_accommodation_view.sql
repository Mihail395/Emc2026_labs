CREATE VIEW accommodation_view AS
SELECT
    a.id                            AS id,
    a.name                          AS accommodation_name,
    CAST(a.category AS VARCHAR)     AS category,
    a.num_rooms                     AS num_rooms,
    a.rented_rooms                  AS rented_rooms,
    (a.num_rooms - a.rented_rooms)  AS available_rooms,
    h.name || ' ' || h.surname      AS host_full_name,
    c.name                          AS country_name
FROM accommodation a
         JOIN host h ON a.host_id = h.id
         JOIN country c ON h.country_id = c.id;