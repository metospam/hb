package services;

import dao.UserDao;
import models.BillingDetails;
import models.User;

import java.util.List;

public class UserService {

    private UserDao usersDao = new UserDao();

    public UserService() {
    }

    public User findUserById(int id) {
        return usersDao.findUserById(id);
    }

    public void saveUser(User user) {
        usersDao.saveUser(user);
    }

    public void deleteUser(User user) {
        usersDao.deleteUser(user);
    }

    public void deleteBillingDetails(BillingDetails billingDetails) {
        usersDao.deleteBillingDetails(billingDetails);
    }

    public List<User> findAllUsers() {
        return usersDao.findAllUsers();
    }

    public List<BillingDetails> findAllAutos() {
        return usersDao.findAllBillings();
    }

    public BillingDetails findBillingById(int id) {
        return usersDao.findBillingById(id);
    }

}

