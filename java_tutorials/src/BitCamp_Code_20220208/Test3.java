//[3] : 두수를 입력받고 입력받은 수가 짝수, 홀수,3의 배수를 판단하기
//		FileName : Test3.java
//		
//		//if문
//		실행예> java Test3 10 15
//		==> 실행결과(출력결과...)(알아서 출력할것)
//		입력하신 1번째 인자값 10은 짝수 이며 3의 배수가 아닙니다.
//		입력하신 2번째 인자값 15는 홀수 이며 3의 배수입니다.





class Test3 
{
	public static void main(String[] args) 
	{
//[FileName :Test 3]
			int a = Integer.parseInt(args[0]);
			int b = Integer.parseInt(args[1]);


////(1버전 if)
			if(a%2==0 && b%3==0)
				System.out.println("입력하신 1번째 인자값"+a+"는 짝수이며 3의 배수가 아닙니다.");
				System.out.println("입력하신 2번째 인자값은"+b+"는 홀수이며 3의 배수입니다." );
//[pass]			
			
//(2버전if, for, break)	
//			for(;;){
//			if(a%3==0){
//				System.out.println("입력하신 1번째 인자값"+a+"는 홀수이며 3의 배수입니다.");
//			}else if(a%2==0){
//				System.out.println("입력하신 1번째 인자값"+a+"는 짝수이며 3의 배수가 아닙니다.");
//			
//			}
//			if(b%2==0){
//				System.out.println("입력하신 2번째 인자값"+b+"는 짝수이며 3의 배수가 아닙니다.");
//			}else if(b%3==0){
//				System.out.println("입력하신 2번째 인자값"+b+"는 홀수이며 3의 배수입니다.");
//			
//			}
//			break;			
//			}//end of for
//[pass]
	}
}
