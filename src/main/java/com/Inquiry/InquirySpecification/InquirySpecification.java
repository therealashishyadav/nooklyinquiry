package com.Inquiry.InquirySpecification;

import org.springframework.data.jpa.domain.Specification;

import com.Inquiry.Model.InquiryModel;

public class InquirySpecification {

    public static Specification<InquiryModel> hasFullName(String fullName) {
        return (root, query, criteriaBuilder) -> {
            if (fullName == null || fullName.isEmpty()) {
                return criteriaBuilder.conjunction(); // Always true
            }
            return criteriaBuilder.like(criteriaBuilder.lower(root.get("fullName")), "%" + fullName.toLowerCase() + "%");
        };
    }

    public static Specification<InquiryModel> hasEmail(String email) {
        return (root, query, criteriaBuilder) -> {
            if (email == null || email.isEmpty()) {
                return criteriaBuilder.conjunction();
            }
            return criteriaBuilder.like(criteriaBuilder.lower(root.get("email")), "%" + email.toLowerCase() + "%");
        };
    }

    public static Specification<InquiryModel> hasPhone(String phone) {
        return (root, query, criteriaBuilder) -> {
            if (phone == null || phone.isEmpty()) {
                return criteriaBuilder.conjunction();
            }
            return criteriaBuilder.like(root.get("phone"), "%" + phone + "%");
        };
    }

    public static Specification<InquiryModel> hasLocation(String location) {
        return (root, query, criteriaBuilder) -> {
            if (location == null || location.isEmpty()) {
                return criteriaBuilder.conjunction();
            }
            return criteriaBuilder.like(criteriaBuilder.lower(root.get("location")), "%" + location.toLowerCase() + "%");
        };
    }

    public static Specification<InquiryModel> hasInquiryType(String inquiryType) {
        return (root, query, criteriaBuilder) -> {
            if (inquiryType == null || inquiryType.isEmpty()) {
                return criteriaBuilder.conjunction();
            }
            return criteriaBuilder.equal(root.get("inquiryType"), inquiryType);
        };
    }
}
