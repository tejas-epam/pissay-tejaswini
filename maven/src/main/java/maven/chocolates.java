package maven;

public class chocolates {
	public static void main(String args[])
	{
		Sweet1 obj=new Sweet1();
		Sweet2 objs=new Sweet2();
		obj.choco(1,2);
		obj.disp();
		objs.choco(10,20);
		objs.display();
		SweetA obj1=new SweetA();
		SweetA obj2=new SweetA();
		SweetB obj3=new SweetB();
		SweetB obj4=new SweetB();
		for(int i=0;i<2;i++)
		{
			obj1.disp1();
			obj3.disp2();
		}
		for(int i=0;i<2;i++)
		{
			obj2.disp1();
			obj4.disp2();
		}
		Weight obj5=new Weight();
		
		for(int i=0;i<5;i++)
		{
			obj5.disp3();
		}
		
	}
}
class Choco
{
	int a,b;
	void choco(int x,int y)
	{
		a=x;
		b=y;
	}
}
class Sweet1 extends Choco
{
	int add()
	{
		return (a+b);
	}
	void disp()
	{
		System.out.println("A="+a);
		System.out.println("B="+b);
		System.out.println("sum="+add());
	}
}
class Sweet2 extends Choco
{
	int mul()
	{
		return (a*b);
	}
	void display()
	{
		System.out.println("A="+a);
		System.out.println("B="+b);
		System.out.println("muliplication="+mul());
	}
}
class SweetA
{
	void disp1()
	{
		System.out.println("gulab jamun");
	}
}
class SweetB
{
	void disp2()
	{
		System.out.println("rasagulla");
	}
}
class Weight
{
	int weight=0;
	void disp3()
	{
		System.out.println("weight=weight+5");
	}
}
	
