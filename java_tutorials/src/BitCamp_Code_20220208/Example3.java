//[2] 두수를 입력 받고 두사이의 값의 합을 구하기
//	
//	실행예> java Example3 1 10
//	==> 실행결과(출력결과...)
//		1~10의 합은 55입니다.
//		
//	<<java Example3 10 1인경우도 위와 같이 출력>>
//	<<java Example3 10 10 으로 입력될경우>>
//	입력값이 같습니다. [usage]:: 어쩌구 저쩌구


class  Example3 {
	public static void main(String[] args) {

//[Examp3 1 10]			
			int sum = 0;

				for(int i=1; i <=10; i++ ){
					sum += i;
				}
					System.out.println("1에서 10의 합은 "+sum+"입니다.");

//[Examp3 10 1]	
//			int sum = 0;
//
//				for(int i=10; i >=1; i-- ){
//					sum += i;
//				}
//					System.out.println("10에서 1의 합은 "+sum+"입니다.");


//[Examp3 10 10]	
//			int sum = 0;
//
//				for(int i=10; i <=10 && i >=10; i++){
//					sum += i;
//				}
//					System.out.println("10에서 10의 합은 "+sum+"입니다.");





	}//end of main
}//end of class