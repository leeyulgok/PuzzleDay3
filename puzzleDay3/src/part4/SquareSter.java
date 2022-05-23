package part4;

import java.util.Scanner;

// *표시 정방형 표시.
public class SquareSter {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("정수 : ");
		int x = scan.nextInt();
		for(int i = 0; i < x; i++) {
			for(int j = 0; j < x; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		scan.close();
	}

}
