package hw;
import java.util.Scanner;
public class hw03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int count = 0;
		int sum = 1;
		while (sum<=10000){
			count ++;
			sum = sum*n;
			
  }
		System.out.print("次方次數"+count);
	}
}
