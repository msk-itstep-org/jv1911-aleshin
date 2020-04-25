package org.itstep.msk.app.entity;


import org.itstep.msk.app.entity.numberСard.NumberCart;

import javax.persistence.*;


/**
 * карта, привязывается к счету
 */
@Entity
@Table(name = "carts")
public class Cart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private int id;

    /**
     * номнр карты
     */
    @OneToOne(targetEntity = NumberCart.class)
    @JoinColumn(name = "number_cart_id", referencedColumnName = "id")
    private NumberCart numberCart;

    /**
     * родитель карты
     */
    @ManyToOne(targetEntity = Account.class)
    @JoinColumn(name = "owner_id", referencedColumnName = "numbers")
    private Account owner;

    public int getId() {
        return id;
    }

    public NumberCart getNumberCart() {
        return numberCart;
    }

    public void setNumberCart(NumberCart numberCart) {
        this.numberCart = numberCart;
    }

    public Account getOwner() {
        return owner;
    }

    public void setOwner(Account owner) {
        this.owner = owner;
    }

}
