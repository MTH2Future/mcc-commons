package com.mt.h2f.commons.cloud.dto;

public class EmailNotification {
	private String recipientEmailId;
	private String otp;
	
	public String getRecipientEmailId() {
		return recipientEmailId;
	}
	public void setRecipientEmailId(String recipientEmailId) {
		this.recipientEmailId = recipientEmailId;
	}
	public String getOtp() {
		return otp;
	}
	public void setOtp(String otp) {
		this.otp = otp;
	}
}
