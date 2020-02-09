package javacalculator;

public class KISS{
public String fruit2(int fruit) throws Exception
{
	if((fruit<1)||(fruit<6))throw new Exception("fruit must be in range 1 to 6");
	String [] fruits=
		{
				"Apple",
				"Mango",
				"Orange",
				"Grapes",
				"Banana",
				"Strawberry"
		};
	return fruits[fruit -1];
		}
}
//kiss principle.