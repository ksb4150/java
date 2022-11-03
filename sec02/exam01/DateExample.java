package sec02.exam01;

import java.text.*;
import java.util.*;

public class DateExample extends Thread {
	public static void main(String[] args) {
		Date now = new Date();
		//Date는 객체를 생성한다.
		String strNow1 = now.toString(); // 이 구문이 실행된 날짜와 시간을 저장
		System.out.println(strNow1);
		
		try {
			Thread.sleep(60000);
		} catch (Exception e) {
			
		}
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 mm월 dd일 hh시 mm분 ss초");
		String strNow2 = sdf.format(now);
		System.out.println(strNow2);
	}
}
