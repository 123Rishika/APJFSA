package com.hibernate.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "Donor")
public class Donor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // Ensures auto-increment for the ID
    @Column(name = "donor_id")
    private int donorId;

    @Column(name = "blood_type")
    private String bloodType;

    @Column(name = "contact_number")
    private String contactNumber;

    @Column(name = "date_of_birth")
    private Date dateOfBirth;

    @Column(name = "donor_address")
    private String donorAddress;

    @Column(name = "donor_name")
    private String donorName;

    @Column(name = "gender")
    private String gender;

    @Column(name = "weight")
    private double weight;

	public int getDonorId() {
		return donorId;
	}

	public void setDonorId(int donorId) {
		this.donorId = donorId;
	}

	public String getBloodType() {
		return bloodType;
	}

	public void setBloodType(String bloodType) {
		this.bloodType = bloodType;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getDonorAddress() {
		return donorAddress;
	}

	public void setDonorAddress(String donorAddress) {
		this.donorAddress = donorAddress;
	}

	public String getDonorName() {
		return donorName;
	}

	public void setDonorName(String donorName) {
		this.donorName = donorName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getPhone() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getDonorId1() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getId() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getDonor_name() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getBlood_type() {
		// TODO Auto-generated method stub
		return null;
	}

    // Getters and Setters
    
}