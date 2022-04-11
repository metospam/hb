package models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BillingDetailsTest {

    @Test
    void getAccount() {
        BillingDetails billingDetails = new BillingDetails("Account", "NameBank");
        assertEquals("Account", billingDetails.getAccount());
    }

    @Test
    void setAccount() {
        BillingDetails billingDetails = new BillingDetails();
        billingDetails.setAccount("Account2");
        assertEquals("Account2", billingDetails.getAccount());
    }

    @Test
    void getBankName() {
        BillingDetails billingDetails = new BillingDetails("Account", "NameBank");
        assertEquals("NameBank", billingDetails.getBankName());
    }

    @Test
    void setBankName() {
        BillingDetails billingDetails = new BillingDetails();
        billingDetails.setBankName("Bank");
        assertEquals("Bank", billingDetails.getBankName());
    }

    @Test
    void setUser() {
        User user = new User("Name", "address");
        BillingDetails billingDetails = new BillingDetails();
        billingDetails.setBankName("Bank");
        billingDetails.setUser(user);
        assertEquals(user, billingDetails.getUser());
    }

    @Test
    void getUser(){
        User user = new User("Name", "address");
        BillingDetails billingDetails = new BillingDetails();
        user.addBillingDetails(billingDetails);
        billingDetails.setBankName("Bank");
        user.addBillingDetails(billingDetails);
        assertEquals(user, billingDetails.getUser());
    }

    @Test
    void testToString() {
        BillingDetails billingDetails = new BillingDetails("Account", "Bank");
        assertEquals(billingDetails.getBankName() + " " + billingDetails.getAccount(), billingDetails.toString());
    }
}