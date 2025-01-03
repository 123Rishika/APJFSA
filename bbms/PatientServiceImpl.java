package com.hibernate.serviceImpl;


import com.hibernate.entity.Patient;
import com.hibernate.service.PatientService;
import com.hibernate.utility.HibernateUtility;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class PatientServiceImpl implements PatientService {
    
    @Override
    public void addPatient(Patient patient) {
        Session session = HibernateUtility.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.save(patient);
        transaction.commit();
        session.close();
    }

    @Override
    public void updatePatient(Patient patient) {
        Session session = HibernateUtility.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.update(patient);
        transaction.commit();
        session.close();
    }

    @Override
    public void deletePatient(int patientId) {
        Session session = HibernateUtility.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        Patient patient = session.get(Patient.class, patientId);
        if (patient != null) {
            session.delete(patient);
        }
        transaction.commit();
        session.close();
    }

    @Override
    public Patient getPatientById(int patientId) {
        Session session = HibernateUtility.getSessionFactory().openSession();
        Patient patient = session.get(Patient.class, patientId);
        session.close();
        return patient;
    }
}