package net.practice;

public class Operators {
	public static void main(String[]args)
	{
		int p=10;
		int q=15;
		
   // ARITHMETIC OPERATORS (+,-,*,/)
		int r=p+q;
		System.out.println("arithmetic ="+r);
	// UNARY OPERATORS(+,-,==,--,!)
		int l=-p;
		boolean b=true;
		System.out.println("unary ="+!b);
		System.out.println(l);
		
  //BITWISE OPERATORS(&,|,^,~)
		int z=p&q;    //00001010  00001111  =00001010
		int n=p|q;    //00001010  00001111  =00001111
		int w=~p;
		System.out.println("bitwise ="+z);
		System.out.println(n);
		System.out.println(w);

		
// LOGICAL OPERATORS
		boolean k=p<=10 || q>10;
		System.out.println("logical ="+k);
		boolean s=p<10 && q>10;
		System.out.println(s);
		
		
//TERNARY OPERATORS
	  int ter=(p<q)?p:q;	
		System.out.println("ternary ="+ter);
		
//SHIFT OPERATORS(<<,>>,>>>)
		int h=p<<2;
		int v=q>>1;
		System.out.println("shift ="+h);
		System.out.println(v);
		
		
// RELATIONAL OPERATORS(<,> ==,<=,>=,!=)
		if(p!=q)
		{
			System.out.println("relational ="+p);
		}
	}

}
