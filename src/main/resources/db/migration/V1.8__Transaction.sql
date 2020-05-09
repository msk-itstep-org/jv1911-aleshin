CREATE TABLE history_transaction (
    id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    user_id INT NOT NULL REFERENCES users(id),
    account_id INT NOT NULL REFERENCES account(numbers),
    amount_money INT NOT NULL,
    type_transaction VARCHAR(100) NOT NULL
);

