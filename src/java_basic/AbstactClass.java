package java_basic;

public abstract class AbstactClass {
	
	int i,p,l;
	
	public abstract int multiplication();
		
		

	
	
}
class Adding extends  AbstactClass {
	
	
	public int multiplication(int i,int p) {
		
		
		int l=p*i;
	System.out.println(l) ;
	return l;                    
	
	}
	
	public static void main (String[] agrs) {
		
		Adding add =new Adding();
	

	System.out.println (add.multiplication(10,20));
		
	}

	@Override
	public int multiplication() {
		// TODO Auto-generated method stub
		return 0;
	}
}