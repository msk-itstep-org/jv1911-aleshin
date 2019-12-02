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
    @JoinColumn(name = "parent", referencedColumnName = "id")
    private User parent;


    public int getNumber() {
        return number;
    }

    public User getParent() {
        return parent;
    }

    public void setParent(User parent) {
        this.parent = parent;
    }
}
