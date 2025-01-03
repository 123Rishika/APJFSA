package com.hibernate.serviceImpl;



import com.hibernate.entity.Donor;
import com.hibernate.service.DonorService;
import com.hibernate.utility.HibernateUtility;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class DonorServiceImpl implements DonorService {
    
    @Override
    public void addDonor(Donor donor) {
        Session session = HibernateUtility.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.save(donor);
        transaction.commit();
        session.close();
    }

    @Override
    public void updateDonor(Donor donor) {
        Session session = HibernateUtility.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.update(donor);
        transaction.commit();
        session.close();
    }

    @Override
    public void deleteDonor(int donorId) {
        Session session = HibernateUtility.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        Donor donor = session.get(Donor.class, donorId);
        if (donor != null) {
            session.delete(donor);
        }
        transaction.commit();
        session.close();
    }

    @Override
    public Donor getDonorById(int donorId) {
        Session session = HibernateUtility.getSessionFactory().openSession();
        Donor donor = session.get(Donor.class, donorId);
        session.close();
        return donor;
    }
}