package part4;

import java.util.Scanner;

// 표준체중 구하기.
public class HeightWeight {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("몇 cm부터 : ");
		int heightMin = scan.nextInt();
		System.out.print("몇 cm까지 : ");
		int heightMax = scan.nextInt();
		System.out.print("증가값 : ");
		int step = scan.nextInt();
		
		System.out.println("======================");
		System.out.println("신장    표준체중");
		System.out.println("======================");
		for(int i = heightMin; i <= heightMax; i += step) {
			double Weight = (i - 100) * 0.9;
			System.out.println(i + " : " + Weight);
		}
		scan.close();
	}

}
