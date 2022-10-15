package com.mt.h2f.commons.cloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mt.h2f.commons.cloud.dto.EmailNotification;
import com.mt.h2f.commons.cloud.service.EmailNotificationService;

@RestController
public class EmailNotificationController {
	
	@Autowired
	EmailNotificationService emailNotificationService;
	
	@PostMapping("/sendOtpEmail")
	public ResponseEntity<String> sendOtpMail(@RequestBody EmailNotification emailNotification) {
		emailNotificationService.sendOtpEmail(emailNotification);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	@PostMapping("/sendEnrollEmail")
	public ResponseEntity<String> sendGreenInitEnrollMail(@RequestBody EmailNotification emailNotification) {
		emailNotificationService.sendEnrollGreenInitEmail(emailNotification);
		return new ResponseEntity<>(HttpStatus.OK);
	}
}
