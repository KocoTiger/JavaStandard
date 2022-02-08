
//[1] 1단 ~9단을 입력 받아 입력 받은 단수를 출력하는 프로그램
//	입력값이 0이하이거나 10이상인경우 1~9까지의 값을 입력할것을 출력할것.	()
//
//	실행예> java Example2 5
//	==> 실행결과(출력결과)
//		5단을 출력합니다.
//		1*5 = 5
//		2*5 = 10.....

//[2] 두수를 입력 받고 두사이의 값의 합을 구하기
//	 
//	실행예> java Example3 1 10
//	==> 실행결과(출력결과...)
//		1~10의 합은 55입니다.
//		
//	<<java Example3 10 1인경우도 위와 같이 출력>>
//	<<java Example3 10 10 으로 입력될경우>>
//	입력값이 같습니다. [usage]:: 어쩌구 저쩌구


//[3] for문을 이용하여 1단~9단을 출력하는 프로그램  (밑에꺼는 3번)
//
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





class Exercise022 
{
	public static void main(String[] args) 
	{

//[1]	
		int j=5;
			System.out.println(j+"단을 출력합니다.");
		
		for(int i=1; i<10; i++){
			System.out.println(j+"*"+i+"="+j*i);
			}

//[2-1. 1~10인경우]
//		int i = 1;
//		int sum = 0;
//		
//		while (true){
//			i++;
//			sum += i;
//				if(i==10){
//					break;
//				}
//			}
//		System.out.println("0~" + i + "까지의 합은 :"+ sum +"입니다.");


//[2-1. 10~1인경우]
//		int i = 10;
//		int sum = 0;
//		
//		while (true){
//			i--;
//			sum += i;
//				if(i==1){
//					break;
//				}
//			}
//
//		System.out.println("10~" + i + "까지의 합은 :"+ sum +"입니다.");

//[2-1. 10~10인경우]			//뻑남....
//		int i = 10;
//		int sum = 0;
//		
//		while (true){
//			
//			sum += i;
//				if(i==11){
//					break;
//				}
//			}
//
//		System.out.println("10~" + i + "까지의 합은 :"+ sum +"입니다.");

//[3]
//		int j=0;
//
//		while(j<9){
//			j++;
//			System.out.println(j+"단을 출력합니다.");
//		
//		//for문은 while문과는 달리 초기화를 for문 내부에서 한다.
//		for(int i=1; i<10; i++){
//			System.out.println(j+"*"+i+"="+j*i);
//			}
//		}




	}
}