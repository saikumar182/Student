package java_lang;

public class TestAccount {

	public static void main(String[] args) {

		Account ac = new Account(23432, "", 500);

		ac.deposit(2500);

		ac.withdra(600);

		ac.getbalance();

		System.out.println("the balance is :" + ac.getbalance());
	}

}
