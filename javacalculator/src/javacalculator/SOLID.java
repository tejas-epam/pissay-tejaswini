package javacalculator;

public class SOLID {
	public static void main(String args[])
	{
		Fruit fruit=new Cherry();
		System.out.println(fruit.getcolor());
		fruit=new Banana();
		System.out.println(fruit.getcolor());
		
	}
	

}
class Person
{
	Long personid;
	String firstname;
	String lastname;
	String age;
}
class Account
{
	String  accountnumber;
	String accountname;
	
}
//In this two classes both have single responsibility to store information.
//If we want to modify one class there is no need to modify other.
//This is SINGE RESPONSIBILITY PRINCIPLE.
 abstract class Fruit
{
	abstract String getcolor();
	
}
class Cherry  extends Fruit
{
	String  getcolor() 
	{
		return ("red");
	}
	
}
class Banana extends Fruit
{
	String getcolor()
	{
		return ("yellow");
	}
}//LISKOV SUBSTITUTION PRINCIPLE-returning only the required one without changing functionalities.
