package org.itstep.msk.app.entity;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "user")
public class User {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    /**
     * логин
     */
    @Column(length = 100, unique = true)
    private String username;
    /**
     * пароль
     */
    @Column(length = 100)
    private String password;

    /**
     * счета
     */
    @OneToMany(targetEntity = Account.class, mappedBy = "parent")
    private Set<Account> accounts;

    public void setAccounts(Set<Account> accounts) {
        this.accounts = accounts;
    }

    public Set<Account> getAccounts() {
        return accounts;
    }

    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
