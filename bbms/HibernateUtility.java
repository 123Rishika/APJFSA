package com.hibernate.utility;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.entity.Blood;
import com.hibernate.entity.BloodBank;
import com.hibernate.entity.Doctor;
import com.hibernate.entity.Donor;
import com.hibernate.entity.Patient;

public class HibernateUtility {

    private static SessionFactory sessionFactory;

    static {
        try {
            // Create the SessionFactory from hibernate.cfg.xml
            sessionFactory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Doctor.class)
                    .addAnnotatedClass(Donor.class).addAnnotatedClass(Blood.class).addAnnotatedClass(BloodBank.class)
                    .addAnnotatedClass(Patient.class).buildSessionFactory();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public static void shutdown() {
        getSessionFactory().close();
    }
}