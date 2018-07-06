import java.util.ArrayList;

public class printCustomer extends CustomerManager3{

	public static void printCustomerData(ArrayList<CustomerVIP> custList, int index) {
		
		CustomerVIP cust = custList.get(index);
		System.out.println("==========CUSTOMER INFO================");
		System.out.println("이름 : " + cust.getName());
		System.out.println("성별 : " + cust.getGender());
		System.out.println("이메일 : " + cust.getEmail());
		System.out.println("출생년도 : " + cust.getBirthYear());
		System.out.println("직업 : " + cust.getJob());
		System.out.println("지역 : " + cust.getCountry());
		System.out.println("연봉 : " + cust.getSalary());
		System.out.println("=======================================");
	

	}
}

