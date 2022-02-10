//[1] : 이름과 전화번호를 입력받고 출력하는 예제
//	FileName : Test1.java
//	
//	실행예> java Test1홍길동 011-111-1111
//	==> 실행결과(출력결과...)
//	나의 이름은 "홍길동"입니다.
//	"홍길동"씨의 [hp]는 "011-111-1111"입니다.



class Test1 
{
public static void main(String[] args) 
	{
//[FileName :Test 1]
		System.out.println("나의 이름은 "+"\""+args[0]+"\""+"입니다.");
		System.out.println("\""+args[0]+"\""+"씨의 [hp]는 "+"\""+args[1]+"\""+"입니다.");

//[Pass!]

	}
}

