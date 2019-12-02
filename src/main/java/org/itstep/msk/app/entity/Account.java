package org.itstep.msk.app.entity;

import javax.persistence.*;

/**
 * счёт
 */
@Entity
@Table(name = "account")
public class Account {
    /**
     * номер счёта
     */
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column
    private int number;

    /**
     * количество денег
     * храняться без копеек при получении нужно будет делить на 100
     */
    @Column
    private int balance = 0;

    /**
     * хозяин счёта
     */
    @ManyToOne(targetEntity = User.class)
    @JoinColumn(name = "id", referencedColumnName = "id")
    private User user_id;

    public Account(User user_id) {
        this.user_id = user_id;
    }

    public int getNumber() {
        return number;
    }


    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public User getUser_id() {
        return user_id;
    }

    public void setUser_id(User user_id) {
        this.user_id = user_id;
    }
}
