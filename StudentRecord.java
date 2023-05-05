package Inheritance;
//inheritance - reusing existing code
// we use extends keyword to inherit a class
//one class can extend only one class i.e. single inheritance 
//no multiple inheritance is support in java directly
//child class can access all propertie of parents except private fields or methods 
//person - super |parent class |base class 
class Person
{   private int code;
	String name;
	int age ;
	String qualification;
	String address;
	
}


//child class |derived class| sub class
class PgDacStudent  extends  Person  
{
		
	 int rollno,marks;

	 void input()
	 {
		 //code=2324;
		 name="kamal";
		 age=22;
		 qualification="btech";
		 address="noida";
		 rollno=1;
		 marks=33;
	 }
	
	 void display()
	 {
		 System.out.println(name +"   "+ age+"   "+ qualification+" "+address+"  "+ rollno+"  "+marks);
		 
		 
	 }
}
 

public class StudentRecord {

	public static void main(String[] args) {
		 
PgDacStudent p= new PgDacStudent();
p.input();
p.display();
	}

}
