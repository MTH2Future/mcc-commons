package com.mt.h2f.commons.cloud.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mt.h2f.commons.cloud.dto.EmailNotification;
import com.mt.h2f.commons.cloud.external.EmailNotificationClient;

//@Service
public class EmailNotificationService {
	
	//@Autowired
	//EmailNotificationClient emailNotificationClient;
	
	public void sendOtpEmail(EmailNotification emailNotification) {
		//emailNotificationClient.sendOtpEmail(emailNotification);
	}
	
	public void sendEnrollGreenInitEmail(EmailNotification emailNotification) {
		//emailNotificationClient.sendEnrollGreenInitEmail(emailNotification);
	}

}
