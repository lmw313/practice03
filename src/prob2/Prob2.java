package prob2;

import java.util.Scanner;

public class Prob2 {
	public static void main(String[] args) {
		/* 구현코드 */
		Scanner scanner = new Scanner(System.in);
		System.out.println("정수로 된 돈의 액수를 입력해주세요.");
		int a = scanner.nextInt();
		int fiveman = 0;
		int oneman = 0;
		int fivechun = 0;
		int onechun = 0;
		int fivebak = 0;
		int onebak = 0;
		int fivesip = 0;
		int onesip = 0;
		int five = 0;
		int one = 0;

		if (a > 50000) {
			fiveman = a / 50000;
			a = a - (fiveman * 50000);

			oneman = a / 10000;
			a = a - (oneman * 10000);

			fivechun = a / 5000;
			a = a - (fivechun * 5000);

			onechun = a / 1000;
			a = a - (onechun * 1000);

			fivebak = a / 500;
			a = a - (fivebak * 500);

			onebak = a / 100;
			a = a - (onebak * 100);

			fivesip = a / 50;
			a = a - (fivesip * 50);

			onesip = a / 10;
			a = a - (onesip * 10);

			five = a / 5;
			a = a - (five * 5);

			one = a;
			a = a - one;
		}
		System.out.println("50000원 : " + fiveman + "개");
		System.out.println("10000원 : " + oneman + "개");
		System.out.println("5000원 : " + fivechun + "개");
		System.out.println("1000원 : " + onechun + "개");
		System.out.println("500원 : " + fivebak + "개");
		System.out.println("100원 : " + onebak + "개");
		System.out.println("50원 : " + fivesip + "개");
		System.out.println("10원 : " + onesip + "개");
		System.out.println("5원 : " + five + "개");
		System.out.println("1원 : " + one + "개");

	}
}
