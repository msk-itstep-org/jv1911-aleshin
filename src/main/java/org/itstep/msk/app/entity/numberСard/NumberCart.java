package org.itstep.msk.app.entity.numberСard;

import org.itstep.msk.app.entity.Cart;

import javax.persistence.*;


/**
 * состовляющая карты номер
 */
@Entity
@Table(name = "number_carts")
public class NumberCart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    /**
     * тип платежной системы
     * состоит из 1 цифры
     */
    @ManyToOne(targetEntity = PaymentSystem.class)
    @JoinColumn(name = "payment_systems", referencedColumnName = "id")
    private PaymentSystem paymentSystem;

    /**
     * номер от банка,
     * выдает ц/б постоянная
     * состоит из 5 цифр
     */
    @Column(name = "number_bank")
    private int numberBank;

    /**
     * номер карты состоит из 9 цифр
     */
    @Column(name = "numbers")
    private int number;

    /**
     * чексумма всех цыфор, состоит из 1 цифры
     */
    @Column(name = "checksums")
    private int checksum;

    /**
     * id карты каторой пренадлежит номер
     */
    @OneToOne(targetEntity = Cart.class, mappedBy = "numberCart")
    private Cart cart;

    public int getId() {
        return id;
    }

    public PaymentSystem getPaymentSystem() {
        return paymentSystem;
    }

    public void setPaymentSystem(PaymentSystem paymentSystem) {
        this.paymentSystem = paymentSystem;
    }

    public int getNumberBank() {
        return numberBank;
    }

    public void setNumberBank(int numberBank) {
        this.numberBank = numberBank;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getChecksum() {
        return checksum;
    }

    public void setChecksum(int checksum) {
        this.checksum = checksum;
    }

    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }
}
