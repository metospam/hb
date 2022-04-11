package dao;

import models.BillingDetails;
import models.User;
import org.hibernate.Session;
import org.hibernate.Transaction;
import utils.HibernateSessionFactoryUtil;

import java.util.List;

public class UserDao {

    public User findUserById(int id) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        var value = session.get(User.class, id);
        session.close();
        return value;
    }

    public BillingDetails findBillingById(int id) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        var value = session.get(BillingDetails.class, id);
        session.close();
        return value;
    }

    public List<User> findAllUsers() {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        List<User> users = (List<User>) session.createQuery("From User").list();
        session.close();
        return users;
    }

    public List<BillingDetails> findAllBillings() {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        List<BillingDetails> details = (List<BillingDetails>) session.createQuery("From BillingDetails").list();
        session.close();
        return details;
    }

    public void saveUser(User user) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.save(user);
        tx1.commit();
        session.close();
    }

    public void deleteUser(User user) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.delete(user);
        tx1.commit();
        session.close();
    }

    public void deleteBillingDetails(BillingDetails billingDetails) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.delete(billingDetails);
        tx1.commit();
        session.close();
    }
}