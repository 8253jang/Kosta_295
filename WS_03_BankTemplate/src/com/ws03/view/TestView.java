package com.ws03.view;

import com.ws03.dto.AccountDto;
import com.ws03.dto.UserDto;
import com.ws03.service.BankService;

public class TestView {

	public static void main(String[] args) {
		System.out.println("***1. 고객seq에 해당하는 계좌정보 검색하기 *****");
		BankService service = new BankService();
		
		AccountDto[] accountList = service.getAccountList(100);
		
		if(accountList==null) {
			System.out.println("회원의 계좌정보가 없습니다. ");
		}else {
			System.out.println("회원계좌개수 : " + accountList.length);
			for(AccountDto dto : accountList) {
				//System.out.print(dto.accountSeq +" , " + dto.accountNumber+" , " + dto.userSeq+" , ");
				
			}
		}
		
		System.out.println("***2. userSeq에 해당하는 고객의 정보 *************");
		UserDto userDto = service.getUserDetail(200);
		if(userDto!= null) {
		  //System.out.print(userDto.userSeq +" , " + userDto.name+" , " + userDto.email+" , ");
		  //System.out.println(userDto.phone +" , " + userDto.isSleep);
			
		}else {
			System.out.println("회원의 정보가 없습니다.");
		}

	}//메인끝

}// 클래스 끝





