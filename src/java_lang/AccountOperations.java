package java_lang;

interface AccountOperations {

	void deposit(int amount);

	void withdra(int amount);

	double getbalance();

	public default int getamount() {
		return 1;
	}

}

class Account implements AccountOperations {

	protected int ac_no;

	protected String ach_name;

	protected int min_bal = 100;
	
	protected double balance;

	public Account(int ac_no, String ach_name, double balance) {

		this.ac_no = ac_no;
		this.ach_name = ach_name;
		this.balance = balance;

	}

	
	@Override
	public void deposit(int amount) {

		this.balance +=amount;

	}

	@Override
	public void withdra(int amount) {

	this.balance -= amount;

	}

	@Override
	public double   getbalance() {
		return  balance;

	}

}