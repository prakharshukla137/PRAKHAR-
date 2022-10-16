import java.util.Scanner;
class string_concat

{
	public static void main(String args[])
		{
 			
			String str,str1,str2;
			int i;
			char ch ;
			Scanner sc=new Scanner(System.in);
			System.out.println("string");
			str=sc.nextLine();
			System.out.println("string1");
			str1=sc.nextLine();
			
			
			str2=str.concat(str1);
			System.out.println("string after concatation=" +str2);
		}
}