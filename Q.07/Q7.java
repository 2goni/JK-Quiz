import java.util.Scanner;

public class Q7 {

	public static void main(String[] args) {
		int age = 0;
		String name = "";
		Scanner sc = new Scanner(System.in);
		/* 문제) Scanner 이용하여 다음결과를 구현
			1.이름을 입력하세요.
			홍길동 <<입력
			2.나이를 입력하세요.
			20 << 입력
			이름은 홍길동, 나이는 20 입니다 */
		
		System.out.println("1.이름을 입력하세요.");
		name = sc.nextLine();
		System.out.println("2.나이를 입력하세요.");
		age = sc.nextInt();
		System.out.println("이름은 " + name + ", 나이는 " + age + " 입니다");
	}

}
