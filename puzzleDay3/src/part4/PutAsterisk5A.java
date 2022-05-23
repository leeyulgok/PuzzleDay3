package part4;

import java.util.Scanner;

// 읽은 개수만큼 *를 표시 (5개 단위로)
public class PutAsterisk5A {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("정숫값 : ");
		int n = scan.nextInt();
		
		for(int i = 1; i <= n; i++) {
			System.out.print("*");
			if(i%5==0) {
				System.out.println();
			}
		}
		
		scan.close();
	}

}
