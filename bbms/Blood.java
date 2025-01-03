package com.hibernate.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.ManyToMany;
import java.util.Set;

@Entity
public class Blood {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int blood_id;
    private String blood_type;
    private String status;  // Available or Unavailable

    @ManyToOne
    private BloodBank bloodBank; // Many blood units belong to one blood bank

    @ManyToOne
    private Donor donor; // Each blood unit is donated by one donor

    @ManyToMany
    private Set<Patient> patients; // Many patients can require this blood

    // Getters and Setters
    public int getBlood_id() {
        return blood_id;
    }

    public void setBlood_id(int blood_id) {
        this.blood_id = blood_id;
    }

    public String getBlood_type() {
        return blood_type;
    }

    public void setBlood_type(String blood_type) {
        this.blood_type = blood_type;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public BloodBank getBloodBank() {
        return bloodBank;
    }

    public void setBloodBank(BloodBank bloodBank) {
        this.bloodBank = bloodBank;
    }

    public Donor getDonor() {
        return donor;
    }

    public void setDonor(Donor donor) {
        this.donor = donor;
    }

    public Set<Patient> getPatients() {
        return patients;
    }

    public void setPatients(Set<Patient> patients) {
        this.patients = patients;
    }
}