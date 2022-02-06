/*p.211 ~213
##2.4 커맨드 라인을 통해 입력 받기.
	: Scanner클래스의 nextLine() 이외에도 화면을 통해 사용자로부터 값을 입력받을 수 있는 간단한
	  방법이 있다.
	: 바로 커맨드 라인을 이용하는 방법
	: 프로그램을 실행할때 클래스의 이름 뒤에 공백문자로 구분하여 여러개의 문자열을 프로그램에 전달 할 수 있다.
	: 만일 실행할 프로그램의 main메서드가 담긴 클래스의 이름이 MainTest라고 가정하면 다음과 같이 실행 가능
		
		c:\jdk1.8\work\ch5>java MainTest abc 123
	
	: 커맨드 라인을 통해 입력된 두 문자열은 String배열에 담겨서 MainTest클래스의 main메서드의 
	  매개변수(args)에 전달. 그리고 main 메서드 내에서 args[0], args[1]과 같은 방식으로 커맨드라인으로 부터 전달 받은 문자열에 접근할 수 있다.
	: 여기서, args[0]은 "abc"이고 args[1]은 "123"이다 된다.
	[예제 5-16]   
	[예제 5-17]

 */





package org.JavaStandards_Ch5_Array;

public class Ch5_Array1_Array6_String3_커맨드라인 {

	public static void main(String[] args) {
//[예제 5-16]
//		System.out.println("매개변수의 개수:"+ args.length);
//		
//		for(int i=0; i<args.length; i++) {
//			System.out.println("args["+i+"] = \""+ args[i] + "\"");
//		}
/*
	: 커맨드라인에 입력된 매개뱐수를 공백문자로 구분하기 때문에 입력될 값에 공백이 있는 경우
	  ""로 감싸 주어야 한다.
	: 커맨드라인에서 숫자를 입력해도 숫자가 아닌 문자열로 처리된다는 것에 주의해야함.
	: 문자열"123"을 숫자 123으로 바꾸려면 다음과 같이 한다.
	
			int num = Integer.parseInt("123");	//변수num에 숫자 123이 저장된다.
	
	: 커맨드라인에 매개변수를 입력하지 않으면 크기가 0인 배열이 생성
	: args.length의 값은 0이된다. (이렇게 크기가 0인 배열을 생성하는 것도 가능)
	: 만일 입력된 매개변수가 없다고 해서 배열을 생성하지 않으면 참조변수 args의 값은 null이될 것
	: 배열 arg를 사용하는 모든 코드에서 에러가 발생할 것이다.
	: 이런 에러를 피하기 위해, 다음과 같이 main 메서드에 if문을 추가해줘야 한다.
			
			if(args!=null){	//args가 null이 아닐때만 괄호{}의 문장들을 수행
			System.out.println("매개변수의 개수:"+ args.length);
		
		for(int i=0; i<args.length; i++) {
			System.out.println("args["+i+"] = \""+ args[i] + "\"");
			}
	
	:그러나 JVM이 입력된 매개변수가 없을 뗴, null대신 크기가 0인 배열을 생성해서 args에
	  전달하도록 구현되어 우리는 이러한 수고를 덜게 되었다.
	
 */
//[예제 5-17]
		if (args.length != 3){
			System.out.println("usage: java ArrayEx17 NUM OP NUM2");
			System.exit(0);
		}
		
		int num1 = Integer.parseInt(args[0]);	//문자열을 숫자로 변환
		char op = args[1].charAt(0);			//문자열을 문자()char)로 변환
		int num2 = Integer.parseInt(args[2]);
		
		int result = 0;
		
		switch(op) {		//switch문의 수식으로 char타입의 변수도 가능
		case '+':
			result = num1 + num2;
			break;
		case '-':
			result = num1 - num2;
			break;
		case 'x':
			result = num1 * num2;
			break;
		case '/':
			result = num1 / num2;
			break;
		default:
			System.out.println("결과:" + result);
		
		}
/*
	: 화면으로 부터 사칙 연산을 수행하라는 수식을 입력받아서 계산
	: 그결과를 보여주는 예제.
	: 커맨드 라인으로부터 입력받은 데이터는 모두 문자열 이므로 숫자와 문자로 변환이 필요
	: Integer.parseInt()를 사용.
		
		
 */
		

	}//end main

}//end public
