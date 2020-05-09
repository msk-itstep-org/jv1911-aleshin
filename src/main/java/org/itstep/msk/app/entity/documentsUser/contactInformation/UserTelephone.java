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
    private int number;

    @ManyToOne(targetEntity = ContactInformation.class)
    @JoinColumn(name = "contact_information_id", referencedColumnName = "id")
    private ContactInformation contactInformation;

    public Integer getId() {
        return id;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public ContactInformation getContactInformation() {
        return contactInformation;
    }

    public void setContactInformation(ContactInformation contactInformation) {
        this.contactInformation = contactInformation;
    }
}
