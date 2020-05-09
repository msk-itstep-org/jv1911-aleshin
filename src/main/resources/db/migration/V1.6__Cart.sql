CREATE TABLE carts (
    id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    number_cart_id INT NOT NULL REFERENCES number_carts(id),
    owner_id INT REFERENCES account (number)
);

