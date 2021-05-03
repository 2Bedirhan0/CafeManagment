import abstracts.BaseCustomerManager;
import adapters.MernisServiceAdapter;
import concrete.CustomerCheckManager;
import concrete.NeroCustomerManager;
import concrete.StarbucksCustomerManager;
import entities.Customer;

public class Main {

	public static void main(String[] args) {
		Customer fake = new Customer(1, "Engin", "Demiro�", "123456", 1990);
		Customer real = new Customer(2,"Bedirhan","G�rler","Buraya ger�ek TCKN Yaz�lmas� Gereklidir.", 2001);
		
		BaseCustomerManager nero = new NeroCustomerManager();
		nero.save(fake);
		
		BaseCustomerManager starbucks = new StarbucksCustomerManager(new MernisServiceAdapter());
		starbucks.save(real);

	}

}
