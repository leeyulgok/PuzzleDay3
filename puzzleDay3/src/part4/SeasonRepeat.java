package part4;

import java.util.Scanner;

// 입력한 달의 계절 찾기.
public class SeasonRepeat {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int retry = 0;
		System.out.println("계절을 찾습니다.");
		do {
			int x;
			do {
				System.out.print("몇 월입니까? : ");
				x = scan.nextInt();				
			} while(x < 1 || x > 12);
			
			switch(x){
			case 12:
			case 1: 
			case 2: 
				System.out.println("겨울입니다.");
				break;
			case 3:
			case 4:
			case 5:
				System.out.println("봄입니다.");
				break;
			case 6:
			case 7: 
			case 8:
				System.out.println("여름입니다.");
				break;
			case 9:
			case 10: 
			case 11:
				System.out.println("가을입니다.");
				break;
			}
			System.out.print("다시 하시겠습니까? 1-Yes/0-No : ");
			retry = scan.nextInt();
		} while(retry == 1);
		scan.close();
	}

}
