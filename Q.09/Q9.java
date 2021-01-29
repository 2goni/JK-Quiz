import java.util.Scanner;

public class Q9 {

	public static void main(String[] args) {
		int num1 = 0;
		int num2 = 0;
		Scanner sc = new Scanner(System.in);
		
		/* 문제) Scanner 클래스를 사용하여 키보드로 두 개의 정수값을 입력 받아서 최대값을 구하는 코드 작업. 
		   단, 3항 연산자만 사용할 것
		   1.정수 입력하세요. 
		   10 << 입력
		   2.정수 입력하세요. 
		   50 << 입력
		   정수 10 과 정수 50 중에서 최대값: 50
		 */
		
		System.out.println("1.정수 입력하세요");
		num1 = sc.nextInt();
		System.out.println("2.정수 입력하세요");
		num2 = sc.nextInt();
		
		int result = num1>num2 ? num1 : num2;
		
		System.out.println("정수 " + num1 + " 과 정수 " + num2 + " 중에서 최대값:" + result);
		
	}

}
