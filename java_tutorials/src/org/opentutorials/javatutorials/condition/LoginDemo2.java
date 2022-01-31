//조건문의 중첩
/*
 위의 예제에서 아이디와 비밀번호를 모두 검증해야 한다면 어떻게 하면 될까? 다음 예제를 보자.
 */


package org.opentutorials.javatutorials.condition;

public class LoginDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 String id = args[0];
	        String password = args[1];
	        if (id.equals("egoing")) {
	            if (password.equals("111111")) {
	                System.out.println("right");
	            } else {
	                System.out.println("wrong");
	            }
	 
	        } else {
	            System.out.println("wrong");
	        }
		
	        /*
	         이 예제는 입력 값을 두 개 받는다. 
	         id와 password를 프로그램 내부로 전달하려면 프로그램을 실행할 때 아래와 같이 차례대로 
	         아이디와 비밀번호를 입력하면 된다.
	         
	         java LoginDemo2 egoing 111111
	         
	         if문 안에 다시 if문이 등장했다. 
	         즉 사용자가 입력한 값과 아이디의 값이 일치하는지를 확인한 후에 일치한다면 
	         비밀번호가 일치하는지 확인한 것이다. 
	         이렇게 조건문은 조건문 안에 중첩적으로 사용될 수 있다.
	         
	         */
	        
	        //SwitchDemo로 이동
		
		
	}

}
