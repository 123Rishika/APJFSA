package com.hibernate.serviceImpl;


import com.hibernate.entity.Blood;
import com.hibernate.service.BloodService;
import com.hibernate.utility.HibernateUtility;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class BloodServiceImpl implements BloodService {
    
    @Override
    public void addBlood(Blood blood) {
        Session session = HibernateUtility.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.save(blood);
        transaction.commit();
        session.close();
    }

    @Override
    public void updateBlood(Blood blood) {
        Session session = HibernateUtility.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.update(blood);
        transaction.commit();
        session.close();
    }

    @Override
    public void deleteBlood(int bloodId) {
        Session session = HibernateUtility.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        Blood blood = session.get(Blood.class, bloodId);
        if (blood != null) {
            session.delete(blood);
        }
        transaction.commit();
        session.close();
    }

    @Override
    public Blood getBloodById(int bloodId) {
        Session session = HibernateUtility.getSessionFactory().openSession();
        Blood blood = session.get(Blood.class, bloodId);
        session.close();
        return blood;
    }
}