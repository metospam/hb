package models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "userName")
    private String userName;

    private String address;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
    private List<BillingDetails> details;

    public User() {
    }

    public int getId() {
        return id;
    }

    public User(String userName, String address) {
        this.userName = userName;
        this.address = address;
        details = new ArrayList<>();
    }

    public void addBillingDetails(BillingDetails billingDetails) {
        billingDetails.setUser(this);
        details.add(billingDetails);
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<BillingDetails> getBillings() {
        return details;
    }

    @Override
    public String toString() {
        return "models.User{" +
                "id='" + id +
                ", username='" + userName + '\'' +
                ", address=" + address +
                '}';
    }
}
