

public class WordsDifference {
	String s1 = "Something";
	String s2 = "else";
	String res = "";
	String st1=s1.toLowerCase();
	String st2=s2.toLowerCase();
	StringBuilder sb = new StringBuilder(st1);
	StringBuilder sb1 = new StringBuilder(st2);
	int j = 0;

	public void words() {
		
		for (int i = 0; i < st1.length(); i++)
		{
			while (j < st2.length()) {
				if (st1.charAt(i) == st2.charAt(j))
				{
					sb.deleteCharAt(i);
					System.out.println(sb);//s
					break;
				}
				j++;
			}
			j=0;
		}
	//	System.out.println(sb);
	}

	public static void main(String[] args) {
		WordsDifference wd = new WordsDifference();

		wd.words();

	}

}
