package part4;

import java.util.Scanner;

// 1부터 n까지 각각의 값의 제곱.
public class Square {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("정수 : ");
		int x = scan.nextInt();
		
		for(int i = 1; i <= x; i++) {
			System.out.println(i + "의 제곱 : " + i*i);
		}
		
		scan.close();
	}

}
