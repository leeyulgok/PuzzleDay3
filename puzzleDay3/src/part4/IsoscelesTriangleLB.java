package part4;

import java.util.Scanner;

//왼쪽 아래가 직각인 이등변 삼각형 (입력한 정수값에 따른)
public class IsoscelesTriangleLB {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("정수 : ");
		int x = scan.nextInt();
		
		for(int i = 0; i < x; i++) {
			for(int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		scan.close();
	}

}
