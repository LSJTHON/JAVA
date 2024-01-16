package ch15.sec06.exam02;

import java.util.*;

public class QueueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Message> mQ = new LinkedList<>();
		
		mQ.offer(new Message("sendMail","홍길동"));
		mQ.offer(new Message("sendSMS","신용권"));
		mQ.offer(new Message("sendKakaotalk","감자바"));
		
		
		while(!mQ.isEmpty()) {
			Message ms = mQ.poll();
			
			switch(ms.command) {
			case "sendMail":
				System.out.println(ms.to+"님에게 메일을 보냅니다");
				break;
			case "sendSMS":
				System.out.println(ms.to+"님에게 SMS을 보냅니다");
				break;
			case "sendKakaotalk":
				System.out.println(ms.to+"님에게 카톡을 보냅니다");
				break;
			}
		}
	}

}
