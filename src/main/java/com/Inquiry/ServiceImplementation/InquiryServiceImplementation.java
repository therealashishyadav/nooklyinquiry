package com.Inquiry.ServiceImplementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import com.Inquiry.InquirySpecification.InquirySpecification;
import com.Inquiry.Model.InquiryModel;
import com.Inquiry.Reopsitory.InquiryReopsitory;
import com.Inquiry.Service.InquiryService;


@Service
public class InquiryServiceImplementation implements InquiryService {

	@Autowired
	private InquiryReopsitory inquiryReopsitory;
	
	@Override
	public InquiryModel sendMessage(InquiryModel inquiryModel) {
		return inquiryReopsitory.save(inquiryModel);
	}

	@Override
	public List<InquiryModel> getAllInquiry() {
		return this.inquiryReopsitory.findAll();
	}

	@Override
	public List<InquiryModel> searchInquiries(String fullName, String email, String phone, String location,
			String inquiryType) { return inquiryReopsitory.findAll(
	                Specification.where(InquirySpecification.hasFullName(fullName))
                    .and(InquirySpecification.hasEmail(email))
                    .and(InquirySpecification.hasPhone(phone))
                    .and(InquirySpecification.hasLocation(location))
                    .and(InquirySpecification.hasInquiryType(inquiryType))
    );

	}

//	@Override
//	public List<InquiryModel> findInquiries(String name, String email, String phone, String location, String inquiryType) {
//	    return inquiryReopsitory.findAll((root, query, cb) -> {
//	        List<Predicate> predicates = new ArrayList<>();
//
//	        if (name != null && !name.isEmpty()) {
//	            predicates.add(cb.like(cb.lower(root.get("name")), "%" + name.toLowerCase() + "%"));
//	        }
//	        if (email != null && !email.isEmpty()) {
//	            predicates.add(cb.equal(cb.lower(root.get("email")), email.toLowerCase()));
//	        }
//	        if (phone != null && !phone.isEmpty()) {
//	            predicates.add(cb.equal(root.get("phone"), phone));
//	        }
//	        if (location != null && !location.isEmpty()) {
//	            predicates.add(cb.like(cb.lower(root.get("location")), "%" + location.toLowerCase() + "%"));
//	        }
//	        if (inquiryType != null && !inquiryType.isEmpty()) {
//	            predicates.add(cb.equal(cb.lower(root.get("inquiryType")), inquiryType.toLowerCase()));
//	        }
//
//	        return cb.and(predicates.toArray(new Predicate[0]));
//	    });
//	}

}
