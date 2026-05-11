package com.Inquiry.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Version;
import jakarta.persistence.*;

@Entity
@Table(name = "inquiry_model")
public class InquiryModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "inquiry_id")
    private Long inquiryId;

    @Column(name = "full_name", nullable = false)
    private String fullName;

    @Column(name = "phone", nullable = false)
    private String phone;

    @Column(name = "email", nullable = false)
    private String email;

    @Column(name = "message", columnDefinition = "TEXT")
    private String message;

    @Column(name = "inquiry_type")
    private String inquiryType;

    @Column(name = "location")
    private String location;

    public InquiryModel() {
    }

    public Long getInquiryId() {
        return inquiryId;
    }

    public void setInquiryId(Long inquiryId) {
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

	public InquiryModel(Long inquiryId, String fullName, String phone, String email, String message, String inquiryType,
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

	@Override
	public String toString() {
		return "InquiryModel [inquiryId=" + inquiryId + ", fullName=" + fullName + ", phone=" + phone + ", email="
				+ email + ", message=" + message + ", inquiryType=" + inquiryType + ", location=" + location + "]";
	}
    
    
}