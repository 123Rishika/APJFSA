package com.hibernate.service;


import com.hibernate.entity.Doctor;

public interface DoctorService {
    void addDoctor(Doctor doctor);
    void updateDoctor(Doctor doctor);
    void deleteDoctor(int doctorId);
    Doctor getDoctorById(int doctorId);
}