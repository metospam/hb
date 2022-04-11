package models;

import javax.persistence.*;

@Entity
@Table(name = "details")
public class BillingDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "account")
    private String account;

    private String bankname;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;

    public BillingDetails() {
    }

    public BillingDetails(String account, String bankname) {
        this.account = account;

        this.bankname = bankname;
    }

    public int getId() {
        return id;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getBankName() {
        return bankname;
    }

    public void setBankName(String bankName) {
        this.bankname = bankName;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public User getUser() {
        return user;
    }

    @Override
    public String toString() {
        return bankname + " " + account;
    }
}