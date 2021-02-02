import java.util.StringTokenizer;

public class Q13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String mesg = "     홍길동/이순신/유관순     ";
		
		/* 문제) mesg 변수에 저장된 문자열을 사용하여 실행결과와 같이 처리하도록 구현하시오.
		 		
		 		문자열 길이(공백포함): 21
				공백제거: 홍길동/이순신/유관순
				공백제거된 문자열 길이: 11
				부분열: 홍길동/이순신
				홍길동 출력 : 홍길동
				유관순 출력 : 유관순 
													 */

		System.out.println("문자열 길이(공백포함): " + mesg.length());
		System.out.println("공백제거: " + mesg.trim());
		System.out.println("공백제거된 문자열 길이: " + mesg.trim().length());
		System.out.println("부분열: " + mesg.substring(5, 12));
		System.out.println("홍길동 출력 : " + mesg.substring(5, 8));
		System.out.println("홍길동 출력 : " + mesg.substring(13, 18));
	}

}
