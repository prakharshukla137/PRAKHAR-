import java.util.Scanner;
class string_altrnate

{
	public static void main(String args[])
		{
 			
			String str,str1="";
			int i,j=0;
			char ch ;
			Scanner sc=new Scanner(System.in);
			System.out.println("string");
			str=sc.nextLine();
			//len=str.length();
			//System.out.println("string1");
			//str1=sc.nextLine();

			for(i=0;i<str.length();i+=2)
				
			{
			str1=str1+str.charAt(i);
		}
			System.out.println("string after altrnate print=" +str1);
		}
}