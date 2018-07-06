/************************************************************
 * 시스템 명 : 
 * 업무명 :
 * 프로그램명(ID) :
 * 프로그램 설명 :
 * 
 * 작성일 : 2018. 7. 5.
 * 작성자 : "Baniota"
 *
 * 수정자     수정일자     수정내역
 * ------    ----------    ---------------------------------
 * "Baniota"    2018. 7. 5.    최초 생성
 *
 ************************************************************/
package com.first.aaa.dao;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * CustomerInputData.java
 * @author "Baniota"
 */
public class CustomerInputData {
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public void  insertCustomerData(Scanner scan) {
		
		//IsVIP vip = new IsVIP();
		//String input = scan.next();
		//System.out.println("VIP입니까?(y/n) :");
		
		System.out.print("이름 : ");	
		String name = scan.next();
		System.out.print("성별(M/F) : ");
		String gender = scan.next();
		while((!(gender.equals("m"))) && (!(gender.equals("f")))) {
			System.out.println("한글자만 입력해주세요. 성별이 제대로 확인되지 않았습니다.");
			System.out.println("성별(M/F) :");
			gender = scan.next();
		}
		System.out.print("이메일 : ");
		String email = scan.next();
		
		//입력에서 @와 .이 없으면
		while((!email.contains("@")) || (!email.contains("."))) {
			System.out.println("형식에 맞춰 입력해주세요.");
			email = scan.next();
		}
		
		System.out.print("출생년도 : ");	
		String birthYear = scan.next();

		//only 숫자 , 6자리이상 X
		while(!IsNumber(birthYear)) {

			System.out.println("숫자만 입력해주세요.");
			birthYear = scan.next();

			if(!IsNumber(birthYear)) {
				continue;
			}
		}

		int birth_num = Integer.parseInt(birthYear);

		while(birth_num > 1e6-1 || birth_num< 1e5) {

				System.out.println("6자리의 생년월일을 입력해주세요.");
				birthYear = scan.next();
				birth_num = Integer.parseInt(birthYear);

				System.out.println(birth_num);

		}
		String sql = "insert into customer (name, gender, "
				+ "email, birthYear)"
				+ "values ('"+ name+ "','"+gender +"','" +email+"','"+birthYear+"')";
		jdbcTemplate.update(sql);
		//jdbcTemplate.toString();
		
		
	}
		
	
public static boolean IsNumber(String strNumber) {
		
		boolean result = true;
		try {
			for(char ch : strNumber.toCharArray()) {
				if(!Character.isDigit(ch)) {
					result = false;
					break;
				}
			}
		}catch(Exception ex) {
			
			System.out.println("숫자만 입력하세요.");
			
		}
		return result;
	}

}

