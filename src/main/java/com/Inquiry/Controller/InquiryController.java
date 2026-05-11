package com.Inquiry.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Inquiry.Model.InquiryModel;
import com.Inquiry.Service.InquiryService;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/inquiry")
public class InquiryController {

    @Autowired
    private InquiryService inquiryService;
//
//    @PostMapping("/sendMessage")
//    public ResponseEntity<InquiryModel> sendInquiry(
//            @RequestBody InquiryModel inquiryModel) {
//
//        InquiryModel saved =
//                inquiryService.sendMessage(inquiryModel);
//
//        return new ResponseEntity<>(saved, HttpStatus.OK);
//    }
    
    @PostMapping("/sendMessage")
    public ResponseEntity<?> sendInquiry(
            @RequestBody InquiryModel inquiryModel) {

        try {

            System.out.println("REQUEST = " + inquiryModel);

            InquiryModel saved =
                    inquiryService.sendMessage(inquiryModel);

            System.out.println("SAVED = " + saved);

            return ResponseEntity.ok(saved);

        } catch (Exception e) {

            e.printStackTrace();

            return ResponseEntity.internalServerError()
                    .body(e.getMessage());
        }
    }

	@GetMapping("/get_all_message")
	public List<InquiryModel> getAllInquiry() {
		List<InquiryModel> inquiryModels = this.inquiryService.getAllInquiry();
		return inquiryModels;
	}

// Get all inquires by name, email, phone, location, inquirytype.

	@GetMapping("/search")
    public List<InquiryModel> searchInquiries(
            @RequestParam(required = false) String fullName,
            @RequestParam(required = false) String email,
            @RequestParam(required = false) String phone,
            @RequestParam(required = false) String location,
            @RequestParam(required = false) String inquiryType) {

        return inquiryService.searchInquiries(fullName, email, phone, location, inquiryType);
    }
}
