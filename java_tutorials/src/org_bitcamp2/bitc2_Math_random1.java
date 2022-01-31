package org_bitcamp2;

public class bitc2_Math_random1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double ran = Math.random(); 	//오른쪽에 맞추어서 선언을 해준다, (범위는 양의 실수다 = 0.~ 이상이 나오겠네)
			System.out.println( ran ); 	//변수의 값을 출력한다.
										// 정수로 변환하기 ran변수를 변환
										//int num = ran; // 복사해라 (ran변수의 값을 num으로 복사해라) / 변수가 두개란걸 알아라/자료형이 다르다 ->자료형을 바꿔야겠다! 형변환!
		int num = (int)(ran*100); 		//소괄호안 -> 왼쪽이랑 형이 맞아야 한다. // 자동 형변환
										// 자동 형변환, 반올림, 반내림을 알아야한다. //자리수를 올리기 *를 해준다.
			System.out.println( num );
										//임의 정수 + 최소값 (전제조건을 설정해라)
	
	}

}


//최소0에서 부터 1미만의 실수값,  실수 값(floating number)
//기본 세팅 6자리 (0.000000)
////컴퓨터에서 임의의 실수를 반환받으면 임의의 값이 튀어나온다
////
//내가 원하는 범위는 10이상~45이하 가 되도록   받도록 만든다. 
