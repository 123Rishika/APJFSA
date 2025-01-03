package com.hibernate.service;


import com.hibernate.entity.Donor;

public interface DonorService {
    void addDonor(Donor donor);
    void updateDonor(Donor donor);
    void deleteDonor(int donorId);
    Donor getDonorById(int donorId);
}