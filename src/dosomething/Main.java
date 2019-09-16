package dosomething;
/*
 * 과정지도 문제 중 첫번째
 */
import java.util.Scanner;
import java.util.Arrays;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
		String s=input.nextLine();
		solution(s);
	}

	private static void solution(String s) {
		// TODO Auto-generated method stub
		String[] a=s.split("");
		for(int i=s.length();i>0;i--) {
			if(s.length()%i==0&&i!=1) {
				int num=s.length()/i;
				String str1 = s.substring(0,num);
				String[] str2 = new String[s.length()/num];
				
			}
		}
		
	}

}
