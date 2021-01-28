
public class Q5 {

	public static void main(String[] args) {
		byte a = 10;
		byte b = 20;
		byte c = 30;
		char ch = 'A';
		ch = 'C';
		float f = 1.5f;
		long l = 27000000000l;
		float f2 = 0.1f;
		double d = 0.1;
		boolean result = (float)d == 0.1f;
		
		/* 문제) 변수 선언이 아래와 같이 되어 있을 때 실행 결과와 같이 출력 될 수 있도록 프로그램 하시오.
				c=30
				ch=C
				f=1.5
				l = 27000000000
				result=true			*/
		
		System.out.println("c="+c);
		System.out.println("ch="+ch);
		System.out.println("f="+f);
		System.out.println("l="+l);
		System.out.println("result="+result);
	}
}
