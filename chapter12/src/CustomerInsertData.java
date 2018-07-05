import java.util.ArrayList;

public class CustomerInsertData {
	
	public ArrayList<Customer> insertCustomerData(Customer cust, ArrayList<Customer>custList ) {
		//System.out.print("이름 : ");	
		String name = cust.getName();
		//System.out.print("성별(M/F) : ");	
		char gender = cust.getGender();
		//System.out.print("이메일 : ");	
		String email = cust.getEmail();
		//System.out.print("출생년도 : ");	
		int birthYear = cust.getBirthYear();

		//입력받은 데이터로 고객 객체를 생성
		Customer custNew = new Customer(name, gender, email, birthYear);

		//고객 객체를 ArrayList에 저장
		custList.add(custNew);
		return custList;
	}
}
