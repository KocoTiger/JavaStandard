package org_bitcamp2;

public class bitc2_Switch3 {

	public static void main(String[] args) {
		//변환표, 매핑(mapping)할대 많이 씀. 보통은 많이 안씀
	    // 입력값 -> 변환(mapping) -> 변환값 출력
	    // 컴퓨터는 정수의 세계 / 사람의 세계는 
	    int num = 6;
	    int score = 36; // from computer 요일값은 정수
	    String wday=""; //빈 문자열, 문자열로 바꿔서 말해주겠다 -> 화면 출력
	    switch(score / 10) {
	        //값에 따라 실행할 부분 선택 - 시작 시점
	        case 0: // day의 값이 0인 경우 실행
	            wday = "일요일";
	            break; //여기까지만 해라, 반복문, switch문 사용 가능
	        case 1: // day의 값이 0인 경우 실행
	            wday = "월요일";
	            break; //여기까지만 해라, 반복문, switch문 사용 가능
	        case 2: // day의 값이 0인 경우 실행
	            wday = "화요일";
	            break; //여기까지만 해라, 반복문, switch문 사용 가능
	        case 3: // day의 값이 0인 경우 실행
	            wday = "수요일";
	            break; //여기까지만 해라, 반복문, switch문 사용 가능
	        case 4: // day의 값이 0인 경우 실행
	            wday = "목요일";
	            break; //여기까지만 해라, 반복문, switch문 사용 가능
	        case 5: // day의 값이 0인 경우 실행
	            wday = "금요일";
	            break; //여기까지만 해라, 반복문, switch문 사용 가능
	        case 6: // day의 값이 0인 경우 실행/ case옆에는 값만 쓸수있다 (변수, 수식도 쓰면안돼!/literal 표현만)
	            wday = "토요일";
	            break; //여기까지만 해라, 반복문, switch문 사용 가능
	    } //end of switch
	        
	        
	    System.out.println( wday );

	    }
	
	}

//값 : 수요일