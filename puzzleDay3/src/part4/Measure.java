package part4;

import java.util.Scanner;

//입력한 정수의 모든 약수 구하기.
public class Measure {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("정수 : ");
		int x = scan.nextInt();
		int sum = 0;
		
		for(int i = 1; i <= x; i++) {
			if(x % i == 0) {
				System.out.println(x + "의 약수는 : " + i);
				sum += 1;
			}
		}
		System.out.println("총 약수의 개수는 : " + sum + "개 입니다.");
		scan.close();
	}

}
