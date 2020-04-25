package org.itstep.msk.app.entity;

import org.itstep.msk.app.entity.enums.TypeTransaction;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "history_transaction")
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    /**
     * id юзера которому пренадлежит транзакция
     */
    @ManyToOne(targetEntity = User.class)
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private User user;

    /**
     * id счета с каторым совершается операция
     */
    @ManyToOne(targetEntity = Account.class)
    @JoinColumn(name = "account_id", referencedColumnName = "numbers")
    private Account account;


    /**
     * сумма денег
     */
    @Column(name = "amount_money")
    private int amountMoney;

    /**
     * тип операции
     */
    @Column(name = "type_transaction")
    @Enumerated(EnumType.STRING)
    private TypeTransaction typeTransaction;

    public int getId() {
        return id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public int getAmountMoney() {
        return amountMoney;
    }

    public void setAmountMoney(int amountMoney) {
        this.amountMoney = amountMoney;
    }

    public TypeTransaction getTypeTransaction() {
        return typeTransaction;
    }
}
