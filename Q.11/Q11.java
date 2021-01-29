import java.util.Scanner;
import java.util.StringTokenizer;

public class Q11 {

	public static void main(String[] args) {
		String str = "";
		Scanner sc = new Scanner(System.in);
		
		/* 문제) Scanner 클래스를 사용하여 키보드로 주소값을 입력 받아서 실행결과와 같이 출력하는 코드
		   경기도 용인시 수지구 << 입력
		   문자 갯수(공백포함): 11
		   단어 갯수: 3 				 */
		
		System.out.println("주소를 입력하시오.");
		str = sc.nextLine();
		StringTokenizer t = new StringTokenizer(str," ");
		System.out.println("문자 갯수(공백포함): " + str.length());
		System.out.println("단어 갯수: " + t.countTokens());
		
	}

}
