import java.util.ArrayList;

public class updateData extends CustomerManager3 {

	
	//index 위치의 고객 정보를 수정합니다.
	public static void updateCustomerData(ArrayList<CustomerVIP> custList,int index) {
		System.out.println("VIP입니까? (Y/N)");
		String input = scan.next();
		//VIP 이다
		if(IsVIP.IsVIP_check(input)) {
			
			CustomerVIP CustVIP_data = updateList(index);
			updateListVIP(CustVIP_data,index);
		}
		//VIP 아니다
		else {
			updateList(index);
		}
		
	}
	
	public static CustomerVIP updateList(int index) {

		CustomerVIP cust = custList.get(index);
		System.out.println("---------UPDATE CUSTOMER INFO----------");
		System.out.print("이름(" + cust.getName() + ") :");
		cust.setName(scan.next());

		System.out.print("성별(" + cust.getGender() + ") :");
		cust.setGender(scan.next());

		System.out.print("이메일(" + cust.getEmail() + ") :");
		cust.setEmail(scan.next());

		System.out.print("출생년도(" + cust.getBirthYear() + ") :");
		cust.setBirthYear(scan.next());
		return cust;
	}
	public static void updateListVIP(CustomerVIP cust,int index) {
		
		System.out.print("직업(" + cust.getJob() + ") :");
		cust.setJob(scan.next());
		System.out.print("도시(" + cust.getCountry()+ ") :");
		cust.setCountry(scan.next());		
		System.out.print("연봉(" + cust.getSalary() + ") :");
		cust.setSalary(scan.next());		
	}
}