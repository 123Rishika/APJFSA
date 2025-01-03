package com.hibernate.service;

import com.hibernate.entity.BloodBank;

public interface BloodBankService {
    void addBloodBank(BloodBank bloodBank);
    void updateBloodBank(BloodBank bloodBank);
    void deleteBloodBank(int bloodBankId);
    BloodBank getBloodBankById(int bloodBankId);
}