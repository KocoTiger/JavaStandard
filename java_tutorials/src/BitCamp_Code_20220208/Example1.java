
//[4] : 숫자를 입력 받아(1~100)90이상 수, 80점이상 우, 70점이상 미, 60점 이상 양
//	  그 이하는 가를 출력하기
//	  (입력한 값이 0~100상이 이어야한다. 그이상 그이하일 경우 어떻게 처리할 것인가)
//	  
//
//	  //if 문
//	  FileName : Example1.java
//	  
//	  실행예> java Example 1 95
//	  ==> 실행결과 (출력결과...)
//	  입력하신 값 95점은 수입니다.


class Example1 
{
	public static void main(String[] args) 
	{
		//[FileName :Example1]					
			int a = Integer.parseInt(args[0]);
			
//[1버전 if]
//			if(90<=a && a<=100){
//					System.out.println("입력하신 값은"+a+"점은 수입니다.");
//			}else if(a >= 80){
//					System.out.println("입력하신 값은"+a+"점은 우입니다.");
//			}else if(a >= 70){
//					System.out.println("입력하신 값은"+a+"점은 미입니다.");
//			}else if(a >= 60){
//					System.out.println("입력하신 값은"+a+"점은 양입니다.");
//			}else if(a < 60){
//					System.out.println("입력하신 값은"+a+"점은 가입니다.");
//			}
//[pass]

//[2버전 switch]
			
			switch(a/10){
			case 10:
			case 9:
					System.out.println("입력하신 값"+a+"점은 수 입니다.");	
					break;
			case 8:
					System.out.println("입력하신 값"+a+"점은 우 입니다.");	
					break;
			case 7:
					System.out.println("입력하신 값"+a+"점은 미 입니다.");	
					break;
			case 6:
					System.out.println("입력하신 값"+a+"점은 양 입니다.");	
					break;
			default:
					System.out.println("입력하신 값"+a+"점은 가 입니다.");	
					break;
//			}
//[pass]
	}
}
