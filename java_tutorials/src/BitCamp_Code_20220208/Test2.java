//[2] : 두수를 입력받고 두수를 비교하여 더하기/빼기 예제
//	  첫번째 인수가 크면 빼고 / 적으면 더하기
//	  FileName : test2.java
//	  
//	  //if문
//	  실행예 > java Test2 2 1
//	  ==> 실행결과(출력결과...)
//	  첫번째인수 : 2, 두번쨰인수:1, 2-1 = 1 입니다.
//	  
//	  실행예 > java Test2 1 2
//	  ==> 실행결과 (출력결과...)
//	  첫번째 인수:1, 두번째인수:2, 2+1=3 입니다.




class Test2
{
	public static void main(String[] args) 
	{
//[FileName :Test 2]

		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int c = a-b;
		int d = a+b;
			
		if(a > b){
			System.out.println("첫번째 인수:"+a+", 두번째 인수:"+b+", "+ a +"-"+ b +" = "+c);
		}else if(a < b){
			System.out.println("첫번째 인수:"+a+", 두번째 인수:"+b+", "+ a +"+"+ b +" = "+d);
		}
//else뒤에는 (조건식을 못쓴다.), 조건식을 쓰고 싶다면, else-if(조건)을 쓰면 된다. 
	}
}
