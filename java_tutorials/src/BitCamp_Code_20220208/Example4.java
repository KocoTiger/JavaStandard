//[3] for문을 이용하여 1단~9단을 출력하는 프로그램
//	실행예> java Example4
//	==>실행결과(출력결과....)
//		1단을 출력합니다.
//		1*1 = 1
//		2*1 = 2
//		..........
//		9단을 출력합니다.
//		1*9 = 9
//		2*9 = 18
//		..........


public class Example4 {

	public static void main(String[] args) {
		
		for(int i=1; i<10; i++){
				System.out.println(i+"단을 출력합니다.");
				System.out.println("------------------------------------------");
			for(int j=1; j<10; j++)
				System.out.println(i+"*"+j+"="+i*j);
		}//end of for i

	}
}
