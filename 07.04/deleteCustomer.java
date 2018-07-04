import java.util.ArrayList;

public class deleteCustomer extends CustomerManager3{

	//index 위치의 고객정보를 삭제합니다.
	public static void deleteCustomerData(ArrayList<CustomerVIP> custList,int index) {
		custList.remove(index);
	}
}
