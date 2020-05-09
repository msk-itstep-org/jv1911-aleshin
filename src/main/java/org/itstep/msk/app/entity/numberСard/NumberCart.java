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
    @Column
    private Integer id;

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
     * помер продукта у карты 2 знака
     */
    @ManyToOne(targetEntity = ProductNumber.class)
    @JoinColumn(name = "card_product_number_id", referencedColumnName = "id")
    private ProductNumber cardProductNumber;

    /**
     * номер карты user состоит из 7 цифр
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

    public Integer getId() {
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

    public ProductNumber getCardProductNumber() {
        return cardProductNumber;
    }

    public void setCardProductNumber(ProductNumber cardProductNumber) {
        this.cardProductNumber = cardProductNumber;
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
