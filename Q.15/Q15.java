import java.util.Scanner;

public class Q15 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] num = new int[3];
		/*
		 * 문제) Scanner 클래스를 사용하여 키보드로 세 개의 정수값을 입력 받아서 최대값을 구하는 코드 작업. 단, 한 번의 3항 연산자만
		 * 사용할 것
		 * 
		 * 1.정수 입력하세요. 77 2.정수 입력하세요. 66 3.정수 입력하세요. 78 정수 77 과 정수 66 , 정수 78 중에서 최대값:
		 * 78
		 */
		System.out.println("1.정수 입력하세요.");
		num[0] = sc.nextInt();
		System.out.println("2.정수 입력하세요.");
		num[1] = sc.nextInt();
		System.out.println("3.정수 입력하세요.");
		num[2] = sc.nextInt();
		int max = (Math.max(num[0], num[1]) == num[0]) ? Math.max(num[0], num[2]) : Math.max(num[1], num[2]);
		System.out.println("정수 " + num[0] + " 과 정수 " + num[1] + " , 정수 " + num[2] + " 중에서 최대값 :" + max);
	}

}
