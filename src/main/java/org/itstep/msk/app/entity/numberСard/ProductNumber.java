package org.itstep.msk.app.entity.numberСard;

import javax.persistence.*;

@Entity
@Table(name = "product_numbers")
public class ProductNumber {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "numbers")
    private Integer number;

    @Column (name = "names")
    private String name;

    public Integer getId() {
        return id;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
