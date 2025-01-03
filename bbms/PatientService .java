package com.hibernate.service;

import com.hibernate.entity.Patient;

public interface PatientService {
    void addPatient(Patient patient);
    void updatePatient(Patient patient);
    void deletePatient(int patientId);
    Patient getPatientById(int patientId);
}