package org.itstep.msk.app.entity.numberСard;

import javax.persistence.*;
import java.util.Set;

/**
 * платежная система
 * 4 - viza
 * 5 - vastercart
 */
@Entity
@Table(name = "payment_systems")
public class PaymentSystem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    /**
     * номер платежной системы в номере карты от 1 до 9
     */
    @Column(name = "numbers")
    private int number;

    /**
     *название платежной системы
     */
    @Column(name = "names")
    private String name;

    @OneToMany(targetEntity = NumberCart.class, mappedBy = "paymentSystem")
    @Column(name = "numbers_cart")
    private Set<NumberCart> numbersCart;

    public int getId() {
        return id;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<NumberCart> getNumbersCart() {
        return numbersCart;
    }

    public void setNumbersCart(Set<NumberCart> numbersCart) {
        this.numbersCart = numbersCart;
    }
}
