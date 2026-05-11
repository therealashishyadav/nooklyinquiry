package com.Inquiry.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Version;

@Entity
public class InquiryModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private long inquiryId;
	private String fullName;
	private String phone;
	private String email;
	private String message;
	private String inquiryType;
	private String location;

	public long getInquiryId() {
		return inquiryId;
	}

	public void setInquiryId(long inquiryId) {
		this.inquiryId = inquiryId;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getInquiryType() {
		return inquiryType;
	}

	public void setInquiryType(String inquiryType) {
		this.inquiryType = inquiryType;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "InquiryModel [inquiryId=" + inquiryId + ", fullName=" + fullName + ", phone=" + phone + ", email="
				+ email + ", message=" + message + ", inquiryType=" + inquiryType + ", location=" + location + "]";
	}

	public InquiryModel(long inquiryId, String fullName, String phone, String email, String message, String inquiryType,
			String location) {
		super();
		this.inquiryId = inquiryId;
		this.fullName = fullName;
		this.phone = phone;
		this.email = email;
		this.message = message;
		this.inquiryType = inquiryType;
		this.location = location;
	}

	public InquiryModel() {
		super();
		// TODO Auto-generated constructor stub
	}

}