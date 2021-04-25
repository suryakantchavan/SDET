package com.j;

import java.util.StringTokenizer;

public class US {
	
	
	public static void main(String[] args) {
		
		String path="analytics-data-subscriber/sources/IXCC_localhost_1.0.0/producers/AgentByChannel_itd_1.0.0/subscriptions";
		
		StringTokenizer st = new StringTokenizer(path);
		String producerId = "";
		while (st.hasMoreTokens()) {

			if (st.nextToken("/").equals("producers")) {
				producerId = st.nextToken();
				break;
			}

		}

		System.out.println(producerId);
		String temp[] = producerId.split("_");

		String producer = temp[0];
		System.out.println(producer);
	}

}
