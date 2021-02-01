import java.util.StringTokenizer;

public class Q13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String mesg = " 홍길동/이순신/유관순 ";

		System.out.println("문자열 길이(공백포함): " + mesg.length());
		System.out.println("공백제거: " + mesg.trim());
		System.out.println("공백제거된 문자열 길이: " + mesg.trim().length());
		System.out.println("부분열: " + mesg.substring(1, 8));
		System.out.println("홍길동 출력 : " + mesg.substring(1, 4));
		System.out.println("홍길동 출력 : " + mesg.substring(9, 13));
	}

}
