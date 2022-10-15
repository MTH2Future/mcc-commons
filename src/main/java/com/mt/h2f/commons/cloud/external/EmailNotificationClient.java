package com.mt.h2f.commons.cloud.external;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

import com.mt.h2f.commons.cloud.dto.EmailNotification;

@Component
public class EmailNotificationClient {

	@Autowired
	private JavaMailSender javaMailSender;
	
	@Value("${email.subject.support}")
	String subjectSupport;
	
	@Value("${email.subject.greenInit}")
	String subjectGreenInit;

	public void sendOtpEmail(EmailNotification emailNotification) {
		SimpleMailMessage msg = new SimpleMailMessage();
		msg.setTo(emailNotification.getRecipientEmailId());
		msg.setSubject(subjectSupport);
		msg.setText("Dear User,\n\n" + "Your One Time Password (OTP) is " + emailNotification.getOtp()
				+ "\n\nPlease use above password to confirm your ride with My Charter Car"
				+ "\n\n\nRegards,\nMy Charter Car");
		javaMailSender.send(msg);
	}
	
	public void sendEnrollGreenInitEmail(EmailNotification emailNotification) {
		SimpleMailMessage msg = new SimpleMailMessage();
		msg.setTo(emailNotification.getRecipientEmailId());
		msg.setSubject(subjectGreenInit);
		msg.setText("Dear User,\n\n" + "Thank you for enrolling to Green Initiative Program"
				+ "\n\n\nRegards,\nMy Charter Car");
		javaMailSender.send(msg);
	}
}
