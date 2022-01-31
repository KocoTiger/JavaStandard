package org_bitcamp2;

public class bitc2_Switch1 {

	public static void main(String[] args) {
		// 스위치의 개념!
		//어느 지점부터 시작할것인지를 지정해서
		//쭉 내려가다 마지막 하나 값으로 나옴
		//그래서 멈출려면 break가 필요
		//변환표, 매핑(mapping)할대 많이 씀. 보통은 많이 안씀
	    // 입력값 -> 변환(mapping) -> 변환값 출력
	    // 컴퓨터는 정수의 세계 / 사람의 세계는 
	    int num = 6;
	    int day = 0; // from computer 요일값은 정수
	    String wday=""; //빈 문자열, 문자열로 바꿔서 말해주겠다 -> 화면 출력
	    switch(day) {
	        //값에 따라 실행할 부분 선택 - 시작 시점
	        case 0: // day의 값이 0인 경우 실행
	            wday = "일요일";
	        case 1: // day의 값이 0인 경우 실행
	            wday = "월요일";
	        case 2: // day의 값이 0인 경우 실행
	            wday = "화요일";
	        case 3: // day의 값이 0인 경우 실행
	            wday = "수요일";    
	        case 4: // day의 값이 0인 경우 실행
	            wday = "목요일";
	        case 5: // day의 값이 0인 경우 실행
	            wday = "금요일";
	        case 6: // day의 값이 0인 경우 실행/ case옆에는 값만 쓸수있다 (변수, 수식도 쓰면안돼!/literal 표현만)
	            wday = "토요일";
	        
	        
	    System.out.println( wday );

	    	}
		}
	}
// 값 : 토요일