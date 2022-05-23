package part4;

import java.util.Scanner;

//두 정수 사이의 정수를 작은 것부터 순서대로 표시
public class EnumScope {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("정수 A : ");
		int a = scan.nextInt();
		System.out.print("정수 B : ");
		int b = scan.nextInt();
		
		if(a > b) {
			int x = 0;
			int i = a - b;
			for(int n = 1; n < i; n++) {
				x += 1;
				if(b+x == a-1) {
					System.out.print((b+x));
				} else {
					System.out.print((b+x) + ", ");
				}
			}
		} else if(b > a) {
			int t = a;
			a = b;
			b = t;
			int x = 0;
			int i = a - b;
			for(int n = 1; n < i; n++) {
				x += 1;
				if(b+x == a-1) {
					System.out.print((b+x));
				} else {
					System.out.print((b+x) + ", ");
				}
			}
		}
		scan.close();
	}

}
