package com.hibernate.service;


import com.hibernate.entity.Blood;

public interface BloodService {
    void addBlood(Blood blood);
    void updateBlood(Blood blood);
    void deleteBlood(int bloodId);
    Blood getBloodById(int bloodId);
}