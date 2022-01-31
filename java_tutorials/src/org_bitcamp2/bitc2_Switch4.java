package org_bitcamp2;

public class bitc2_Switch4 {

	public static void main(String[] args) {
		//변환표, 매핑(mapping)할대 많이 씀. 보통은 많이 안씀
	    // 입력값 -> 변환(mapping) -> 변환값 출력
	    // 컴퓨터는 정수의 세계 / 사람의 세계는 ?
	    int num = 6;
	    int score = 36; // 0~100까지라면
	    // 90 A, 70~89 B, 50~69 C, F
	    String wday=""; //빈 문자열, 문자열로 바꿔서 말해주겠다 -> 화면 출력
	    switch(score / 10) { 
	        			//값에 따라 실행할 부분 선택 - 시작 시점
	        case 10:
	        case 9:
	            wday = "A";
	            break; 	//여기까지만 해라, 반복문, switch문 사용 가능
	        case 8:
	        case 7:    
	            wday = "B";
	            break; 	//여기까지만 해라, 반복문, switch문 사용 가능
	        case 6:
	        case 5:   
	            wday = "C";
	            break; 	//여기까지만 해라, 반복문, switch문 사용 가능
	        default: 	//그 외에, 위에 적힌것을 제외한 나머지는
	            wday = "F";
	    } //end of switch
	        	        
	    System.out.println( wday );


	}
}
// 값 : F
// score의 값에따라