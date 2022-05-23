package part4;

import java.util.Scanner;

//양의 정숫값을 읽어 자릿수를 표시.
public class DigitNo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n;
		do {			
			System.out.print("양의 정숫값 : ");
			n = scan.nextInt();
		} while(n <= 0);
		
		int digit = 0;
		while(n > 0) {
			digit++;
			n /= 10;
		}
		System.out.println("입력한 자릿수는 " + digit + "자릿수 입니다.");
		
		scan.close();
	}

}
