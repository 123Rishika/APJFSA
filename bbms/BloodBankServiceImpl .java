package com.hibernate.serviceImpl;


import com.hibernate.entity.BloodBank;
import com.hibernate.service.BloodBankService;
import com.hibernate.utility.HibernateUtility;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class BloodBankServiceImpl implements BloodBankService {
    
    @Override
    public void addBloodBank(BloodBank bloodBank) {
        Session session = HibernateUtility.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.save(bloodBank);
        transaction.commit();
        session.close();
    }

    @Override
    public void updateBloodBank(BloodBank bloodBank) {
        Session session = HibernateUtility.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.update(bloodBank);
        transaction.commit();
        session.close();
    }

    @Override
    public void deleteBloodBank(int bloodBankId) {
        Session session = HibernateUtility.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        BloodBank bloodBank = session.get(BloodBank.class, bloodBankId);
        if (bloodBank != null) {
            session.delete(bloodBank);
        }
        transaction.commit();
        session.close();
    }

    @Override
    public BloodBank getBloodBankById(int bloodBankId) {
        Session session = HibernateUtility.getSessionFactory().openSession();
        BloodBank bloodBank = session.get(BloodBank.class, bloodBankId);
        session.close();
        return bloodBank;
    }
}