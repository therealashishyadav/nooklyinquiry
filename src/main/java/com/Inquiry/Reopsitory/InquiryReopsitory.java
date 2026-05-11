package com.Inquiry.Reopsitory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.Inquiry.Model.InquiryModel;

public interface InquiryReopsitory extends JpaRepository<InquiryModel, Long>, JpaSpecificationExecutor<InquiryModel>{

}
