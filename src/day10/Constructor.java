package day10;

class Constructor{
	
	
	protected int height;
	protected int breight;
protected int area;
	public Constructor(int height, int breight) {
		
		this.height = height;
		this.breight = breight;
	
	}
	
	public Constructor() {
		super();
	}

	public int areaRectangle(int height ,int breight)	{
		
		area =2*height*breight;
		
		return area;
	}
	
	

	public static void main(String[]args) {

	
Constructor r =new Constructor();

		//r.areaRectangle(10,20);
	System.out.println(r.areaRectangle(10, 20));
	}
		
	}

	


