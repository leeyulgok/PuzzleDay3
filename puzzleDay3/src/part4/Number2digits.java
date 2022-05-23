package part4;

import java.util.Random;
import java.util.Scanner;

// 2자릿 수 숫자 맞추기 게임
public class Number2digits {

	public static void main(String[] args) {
		Random rand = new Random();
		Scanner scan = new Scanner(System.in);
		int x = 0;
		int num = 10 + rand.nextInt(99);
		
		System.out.println("숫자를 맞춰주세요.");
		do {
			System.out.println("숫자 : ");
			x = scan.nextInt();
			
			if(num > x) {
				System.out.println("더 큰 숫자입니다.");
			} else if(num < x) {
				System.out.println("더 작은 숫자입니다.");
			}
		} while(num != x);
		System.out.println("맞췄습니다. 정답은 : " + num + " 입니다.");
		scan.close();
	}

}
