package com.hibernate.serviceImpl;


import com.hibernate.entity.Doctor;
import com.hibernate.service.DoctorService;
import com.hibernate.utility.HibernateUtility;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class DoctorServiceImpl implements DoctorService {
    
    @Override
    public void addDoctor(Doctor doctor) {
        Session session = HibernateUtility.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.save(doctor);
        transaction.commit();
        session.close();
    }

    @Override
    public void updateDoctor(Doctor doctor) {
        Session session = HibernateUtility.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.update(doctor);
        transaction.commit();
        session.close();
    }

    @Override
    public void deleteDoctor(int doctorId) {
        Session session = HibernateUtility.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        Doctor doctor = session.get(Doctor.class, doctorId);
        if (doctor != null) {
            session.delete(doctor);
        }
        transaction.commit();
        session.close();
    }

    @Override
    public Doctor getDoctorById(int doctorId) {
        Session session = HibernateUtility.getSessionFactory().openSession();
        Doctor doctor = session.get(Doctor.class, doctorId);
        session.close();
        return doctor;
    }
}