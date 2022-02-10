package jb03.part04;

/*
FileName : MethodSyntax.java
1.OOP  : Message
2.OOPL : Method

ㅇ 객체간의 행위를 정의 하는 Method문법
ㅇ OOP에서 객체간 Message(Method)란 객체간 data를 전달 또는 받을 수 있는 수단.
ㅇ OOP는 객체간 Message전송으로 필요한 데이터를 넘기거나 결과 데이타를 받을 수 있다.
ㅇ OOP는 객체와 객체간 통신은 method호출
*/



public class MethodSyntax{

	///Field
	String name = "홍길동";
	String add = "한양";
	
	///Method
	//=>브라우저를 켜는 행위정의
	public void browerOn(){
		System.out.println("browser를 켜다");
	}
	//==> 작업을 하고 작업유무를 boolean type으로 return 하는 행위
	public boolean documentWork(){
		System.out.println("document작업을 하고 작업완성 유무를 boolean return");
		return true;
	}
	//==>두개의 정수를 받아 합을 return하는 행위
	public int sum(int i, int j){
		System.out.println("<<"+i+">> 와 <<"+j+">>값을 받아 합 return");
		return (i+j);
	}
	//==> 이름을 return 하는 행위
	public String getName(){
		System.out.println("이름을 전달합니다.");
		return name;
	}
	//==> 주소를 return하는 행위
	public String getAdd(){
		System.out.println("주소를 전달합니다.");
		return add;
	}
	//==> 이름, 주소 두가지 정보(상태값)를 Array Data Type return하는 행위
	public String[] getAllInformation(){
		String[] str={ name, add };
		//String[] str={ "홍길동", "한양" };	
		return str;
	}


	}//end of class
