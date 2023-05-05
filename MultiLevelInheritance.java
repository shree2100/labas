package Inheritance;
//example for Multi level inheritance 
class Test1
{
	int a=10;
	void show()
	{
	 
		System.out.println("test1="+ a);
	}
}

class Test2 extends Test1
{
	int b=90;
	void show()
	{
		 
		System.out.println("test2="+ a + b);
	}
}
class Test3 extends Test2
{
	int c=119;
	void show()
	{
		 
		System.out.println("test2="+ a +"  "+ b +"  "+ c);
	}
}


public class MultiLevelInheritance {

	public static void main(String[] args) {
		Test3 r= new Test3();
		r.show();

	}

}
