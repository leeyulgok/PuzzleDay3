package part4;

import java.util.Scanner;

// 양의 정숫값을 읽어 Factorial 구하기.
public class Factorial {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n;
		do {
			System.out.print("양의 정숫값 : ");
			n = scan.nextInt();
		} while(n <= 0);
		
		int x = 1; // 더한값
		int i = 1; // 증가값
		while(n > 0) {
			x *= ((n+i) - n);
			n--;
			i++;
		}
		System.out.println("정숫값의 Factorial은 : " + x + " 입니다.");
		scan.close();
	}
	

}
