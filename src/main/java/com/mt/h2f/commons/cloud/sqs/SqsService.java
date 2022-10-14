package com.mt.h2f.commons.cloud.sqs;

import org.springframework.stereotype.Service;

import software.amazon.awssdk.regions.Region;
import software.amazon.awssdk.services.sqs.SqsClient;
import software.amazon.awssdk.services.sqs.model.SendMessageRequest;

@Service
public class SqsService {

	
	private static final SqsClient SQS_CLIENT = SqsClient.builder().region(Region.AP_SOUTH_1).build();
	String queueUrl="https://sqs.ap-south-1.amazonaws.com/429930180564/mcc-car-pool-queue";
	
	
	public void sendMessage(String text) {
		
	    SendMessageRequest messageRequest = SendMessageRequest.builder()
	            .queueUrl(queueUrl)
	            .messageBody(text)
	            .build();
	    SQS_CLIENT.sendMessage(messageRequest);
	}

}
