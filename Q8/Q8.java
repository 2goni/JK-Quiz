import java.util.Scanner;

public class Q8 {

	public static void main(String[] args) {
		int num1 = 0;
		int num2 = 0;
		Scanner sc = new Scanner(System.in);
		
		/* 문제) Scanner 클래스를 사용하여 키보드로 두 개의 정수값을 입력 받아서 더하는 코드작업 */
		
		System.out.println("1.정수를 입력하세요.");
		num1 = sc.nextInt();
		System.out.println("2.정수를 입력하세요.");
		num2 = sc.nextInt();
		System.out.println("정수 " + num1 + " 과 정수 " + num2 + " 의 합계:" + (num1+num2));
		
	}

}
