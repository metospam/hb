import models.BillingDetails;
import models.User;
import services.UserService;

import java.sql.SQLException;

public class Main {

    public static void main(String[] args) throws SQLException {

        UserService userService = new UserService();

        User user = new User("Karl", "Moscow");

        BillingDetails billingDetails1 = new BillingDetails("FirstAccount", "MoscowBank");
        BillingDetails billingDetails2 = new BillingDetails("SecondAccount", "SberBank");

        user.addBillingDetails(billingDetails1);
        user.addBillingDetails(billingDetails2);

        userService.saveUser(user);
    }
}