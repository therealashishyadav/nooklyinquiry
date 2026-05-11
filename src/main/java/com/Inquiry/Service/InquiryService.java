package com.Inquiry.Service;

import java.util.List;

import com.Inquiry.Model.InquiryModel;

public interface InquiryService {

	InquiryModel sendMessage(InquiryModel inquiryModel);

	List<InquiryModel> getAllInquiry();

	List<InquiryModel> searchInquiries(String fullName, String email, String phone, String location,
			String inquiryType);

//	List<InquiryModel> findInquiries(String name, String email, String phone, String location, String inquiryType);

}
