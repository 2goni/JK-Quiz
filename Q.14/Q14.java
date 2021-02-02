
public class Q14 {

	public static void main(String[] args) {

		String mesg = "100/200";
		int[] num = {Integer.parseInt(mesg.substring(0,3)),Integer.parseInt(mesg.substring(4,7))};
		/* 문제) mesg 변수에 저장된 문자열을 사용하여 실행결과와 같이 처리하도록 구현하시오.
		  		
		  		정수값 합계: 300 
		  		정수값 평균: 150 
		 */
		System.out.println(num[0]+num[1]);
		System.out.println((num[0]+num[1])/num.length);
		
	}

}
