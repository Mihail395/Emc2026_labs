INSERT INTO country (name, continent) VALUES
                                          ('Macedonia', 'Europe'),
                                          ('Germany',   'Europe'),
                                          ('Japan',     'Asia'),
                                          ('USA',       'North America'),
                                          ('Australia', 'Oceania');

INSERT INTO host (created_at, updated_at, name, surname, country_id) VALUES
                                                                         (NOW(), NOW(), 'Marko',   'Markovski', 1),
                                                                         (NOW(), NOW(), 'Hans',    'Müller',    2),
                                                                         (NOW(), NOW(), 'Yuki',    'Tanaka',    3),
                                                                         (NOW(), NOW(), 'John',    'Smith',     4),
                                                                         (NOW(), NOW(), 'Sarah',   'Johnson',   5);

INSERT INTO accommodation (created_at, updated_at, name, category, condition, host_id, num_rooms, rented_rooms) VALUES
                                                                                                                    (NOW(), NOW(), 'Skopje Center Flat',   'FLAT',      'GOOD', 1, 2, 0),
                                                                                                                    (NOW(), NOW(), 'Berlin Studio',        'ROOM',      'GOOD', 2, 1, 0),
                                                                                                                    (NOW(), NOW(), 'Tokyo Apartment',      'APARTMENT', 'GOOD', 3, 3, 0),
                                                                                                                    (NOW(), NOW(), 'NYC Hotel Suite',      'HOTEL',     'GOOD', 4, 5, 0),
                                                                                                                    (NOW(), NOW(), 'Sydney Beach House',   'HOUSE',     'BAD',  5, 4, 0),
                                                                                                                    (NOW(), NOW(), 'Ohrid Lake Motel',     'MOTEL',     'GOOD', 1, 2, 0);