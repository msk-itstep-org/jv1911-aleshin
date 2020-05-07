package org.itstep.msk.app.entity.documentsUser.contactInformation;

import javax.persistence.*;

@Entity
@Table(name = "user_telephones")
public class UserTelephone {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * номер телефпна
     */
    @Column(name = "numbers")
    private int Number;

    @ManyToOne(targetEntity = ContactInformation.class)
    @JoinColumn(name = "contact_information_id", referencedColumnName = "id")
    private ContactInformation contactInformation;

    public Integer getId() {
        return id;
    }

    public int getNumber() {
        return Number;
    }

    public void setNumber(int number) {
        Number = number;
    }

    public ContactInformation getContactInformation() {
        return contactInformation;
    }

    public void setContactInformation(ContactInformation contactInformation) {
        this.contactInformation = contactInformation;
    }
}
