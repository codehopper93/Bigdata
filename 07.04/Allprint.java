import java.util.ArrayList;

public class Allprint extends CustomerManager3{
	
	
	public static void printAllCustomer(ArrayList<CustomerVIP> custList) {
		int i=0;
		while(i != count) {
			printCustomer.printCustomerData(custList, i);
			i++;
		}
	}

}
