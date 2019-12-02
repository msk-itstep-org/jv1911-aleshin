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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private int number;

    /**
     * хозяин счёта
     */
    @ManyToOne(targetEntity = User.class)
    @JoinColumn(name = "owner_id", referencedColumnName = "id")
    private User owner;


    public int getNumber() {
        return number;
    }

    public User getOwner() {
        return owner;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }
}
