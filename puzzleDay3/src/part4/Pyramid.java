package part4;

import java.util.Scanner;

// * 모양 피라미드 표시
public class Pyramid {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("정수 : ");
		int x = scan.nextInt();
		
		for(int i = 1; i <= x; i++) {
			for(int j = 1; j <= x-i; j++) {
				System.out.print(" ");
			}
			for(int j = 1; j <= 2*i-1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		scan.close();
	}

}
