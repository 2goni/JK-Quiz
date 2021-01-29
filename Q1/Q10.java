import java.util.Scanner;

public class Q10 {

	public static void main(String[] args) {
		String str1 = "";
		String str2 = "";
		String str3 = "";
		Scanner sc = new Scanner(System.in);
		/* 문제) Scanner 클래스를 사용하여 키보드로 주소값을 입력 받아서 도/시/구 이름을 출력하는 코드
				
				주소를 입력하시오. 
				경기도 용인시 수지구 << 입력
				도명: 경기도
				시명: 용인시
				구명: 수지구     		*/
		
		System.out.println("주소를 입력하시오.");
		System.out.println("도명: " + (str1 = sc.next()));
		System.out.println("시명: " + (str2 = sc.next()));
		System.out.println("구명: " + (str3 = sc.next()));
	}

}
