package models;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    @org.junit.jupiter.api.Test
    void addBillingDetails() {
    }

    @org.junit.jupiter.api.Test
    public void removeBillingDetails() {
    }

    @org.junit.jupiter.api.Test
    void getUsername() {
        User user = new User("Melon", "Moscow");
        assertEquals("Melon", user.getUserName());
    }

    @org.junit.jupiter.api.Test
    void setUsername() {
        User user = new User("name", "address");
        user.setUserName("Margo");
        assertEquals("Margo", user.getUserName());
    }

    @org.junit.jupiter.api.Test
    void getAddress() {
        User user = new User("Melon", "Moscow");
        assertEquals("Moscow", user.getAddress());
    }

    @org.junit.jupiter.api.Test
    void setAddress() {
        User user = new User();
        user.setAddress("Moscow");
        assertEquals("Moscow", user.getAddress());
    }

    @org.junit.jupiter.api.Test
    void getBillings() {
        User user = new User("Melon", "Moscow");
        BillingDetails billingDetails = new BillingDetails("FirstAcc", "Bank");
        user.addBillingDetails(billingDetails);
        List<BillingDetails> result = user.getBillings();
        assertEquals(result, user.getBillings());
    }

    @org.junit.jupiter.api.Test
    void testToString() {
        User user = new User("Melon", "Moscow");
        assertEquals("models.User{" +
                "id='" + user.getId() +
                ", username='" + user.getUserName() + '\'' +
                ", address=" + user.getAddress() +
                '}',    user.toString());
    }
}