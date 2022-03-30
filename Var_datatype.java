package net.practice;

public class Var_datatype {
	  int x=6;
	  static String b="hii";
	  String a="hii";
	void varType()
	{
		
		System.out.println(a+  " "+b);
		int y=6;
		System.out.println(y*x);
	    String a="hii";
	     b="kiii";
		System.out.println(a+  " "+b);
		if(this.a==a)
		{
			System.out.println("same");
		}
		else
		{
			System.out.println("true");
		}

	}
	public static void main(String[]args)
	{
		Var_datatype obj=new Var_datatype();
		obj.varType();
		   
	}

}
