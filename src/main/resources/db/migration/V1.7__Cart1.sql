CREATE TABLE payment_systems (
    id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    numbers INT NOT NULL,
    names VARCHAR (100) NOT NULL
);

CREATE TABLE product_numbers (
    id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    numbers INT NOT NULL,
    names VARCHAR(100) NOT NULL
);

CREATE TABLE number_carts (
    id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    payment_systems INT NOT NULL REFERENCES payment_systems(id),
    number_bank INT NOT NULL,
    card_product_number_id INT NOT NULL REFERENCES  product_numbers(id),
    numbers INT,
    checksums int NOT NULL,
    cart INT NOT NULL REFERENCES carts(id)
);



