package com.hibernate.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Set;

@Entity
public class BloodBank {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int blood_bank_id;
    private String name;
    private String location;
    private String contact_number;

    // One Blood Bank can have many doctors and blood units
    private Set<Doctor> doctors;
    private Set<Blood> bloods;

    // Getters and Setters
    public int getBlood_bank_id() {
        return blood_bank_id;
    }

    public void setBlood_bank_id(int blood_bank_id) {
        this.blood_bank_id = blood_bank_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getContact_number() {
        return contact_number;
    }

    public void setContact_number(String contact_number) {
        this.contact_number = contact_number;
    }

    public Set<Doctor> getDoctors() {
        return doctors;
    }

    public void setDoctors(Set<Doctor> doctors) {
        this.doctors = doctors;
    }

    public Set<Blood> getBloods() {
        return bloods;
    }

    public void setBloods(Set<Blood> bloods) {
        this.bloods = bloods;
    }
}