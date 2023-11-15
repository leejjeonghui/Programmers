import java.util.Scanner;

public class Solution {
  public static void main(String[] args) {
		
        int max = 1000000;
		String str;
		Scanner scan = new Scanner(System.in);
		str = scan.next();
		
		if ( str.length()>=1 && str.length()<=max)
		{
			System.out.println(str);	
		}
		else {
			System.out.println("");
		}		
	}
}