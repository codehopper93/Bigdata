import java.util.ArrayList;
public class CustomerInsert extends CustomerManager3 {
	
	public static void CustomerInsertData(ArrayList<CustomerVIP> custList, String input) {
		// TODO Auto-generated method stub
		
		//VIP 아닐때
		if(!IsVIP.IsVIP_check(input)) {
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
			//입력받은 데이터로 고객 객체를 생성
			CustomerVIP cust = new CustomerVIP(name, gender, email, birthYear, "없음", "없음", "0");

			//고객 객체를 ArrayList에 저장
			custList.add(cust);
		}
		
		//VIP일때
		else {
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
			
			//비어있으면 추가하는 기능
			while(email.isEmpty()) {
				System.out.println("다시 입력해주세요.");
				email = scan.next();
			}
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
				System.out.println(birth_num);
				while(birth_num > 1e6-1 || birth_num< 1e5) {
					System.out.println("6자리의 생년월일을 입력해주세요.");
					birthYear = scan.next();
					birth_num = Integer.parseInt(birthYear);

				
				
			}
			System.out.print("직업 : ");
			String job = scan.next();
			System.out.print("지역 : ");
			String country = scan.next();
			System.out.print("연봉 : ");
			String salary  = scan.next();
			while(!IsNumber(salary)) {

				System.out.println("숫자만 입력해주세요.");
				salary = scan.next();

				if(!IsNumber(salary)) {
					continue;
				}
			}
			//입력받은 데이터로 고객 객체를 생성
			CustomerVIP cust = new CustomerVIP(name, gender, email, birthYear,job,country,salary);

			//고객 객체를 ArrayList에 저장
			custList.add(cust);
		}
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

