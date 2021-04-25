package com.j;

import java.util.StringTokenizer;

public class Headers {

	public static void main(String[] args) {

		String header = "avaya_kafka_writeOperation=CREATED   ;avaya_kafka_messageStatus=SUCCESS ;avaya_kafka_associationMessageType=ROLE_ASSOCIATION_ACK";
		StringTokenizer tokenizer = new StringTokenizer(header, ";");
		// List<Header> headersList = new ArrayList<>();
		while (tokenizer.hasMoreTokens()) {
			String token = tokenizer.nextToken();
			String[] header1 = token.split("=");
		System.out.println(header1[0]);
		System.out.println(header1[1].getBytes());
		
		byte hana[]=header1[1].getBytes();
		for(int i=0;i<hana.length;i++){  
			System.out.println(hana[i]);  
			}  

		}
		
		
		
	}
}

//[B@123772c4
//[B@123772c4
//[B@123772c4