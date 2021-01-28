import java.util.regex.Pattern;

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch = 'z';
		boolean b = Pattern.matches("^[a-zA-Z]*$", Character.toString(ch));

		/* 문제) 문자형 변수 ch가 영문자(대문자 또는 소문자)일 때만 
		 * 변수 b의 값이 true가 되도록 프로그램을 완성 하시오.
		 */
		System.out.println(b);
	}
}
