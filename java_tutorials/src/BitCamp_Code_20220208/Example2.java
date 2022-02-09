/*
<<<<<<<<<<<<<<<<<<실습과제>>>>>>>>>>>>>>>>>>>>
[1] 1단 ~9단을 입력 받아 입력 받은 단수를 출력하는 프로그램
	입력값이 0이하이거나 10이상인경우 1~9까지의 값을 입력할것을 출력할것.
	실행예> java Example2 5
	==> 실행결과(출력결과)
		5단을 출력합니다.
		1*5 = 5
		2*5 = 10.....

 */



class Example2{

	public static void main(String[] args) {
		
		int a = Integer.parseInt(args[0]);
		

		do{ 
		System.out.println("숫자를 입력하여 주세요(1~9)>");
		System.out.println("주의: 0이하, 10이상의 수를 넣을 시, 미작동");
		}
		while(0>=a && a>=10);
		
		if(a>=1 && 10>a){
				System.out.println(a+" 단을 출력합니다.");
		}

		if(a>=1 && 10>a){
					for(int j=1; j<10; j++)
					System.out.println(a+"*"+j+" = "+a*j);
		}

		
	}
}
