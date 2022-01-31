//Switch문


/*
 조건문의 대표적인 문법은 if문이다. 
 사용빈도는 적지만 조건이 많다면 switch문이 로직을 보다 명료하게 보여줄 수 있다. 
 아래의 코드를 보자.
 */



package org.opentutorials.javatutorials.condition;

public class SwitchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("switch(1)");
        switch(1){
        case 1:
            System.out.println("one");
        case 2:
            System.out.println("two");
        case 3:
            System.out.println("three");
        }
         
        System.out.println("switch(2)");
        switch(2){
        case 1:
            System.out.println("one");
        case 2:
            System.out.println("two");
        case 3:
            System.out.println("three");
        }
         
        System.out.println("switch(3)");
        switch(3){
        case 1:
            System.out.println("one");
        case 2:
            System.out.println("two");
        case 3:
            System.out.println("three");
        }
		
        //결과는 아래와 같다.
        /*
switch(1)
one
two
three
switch(2)
two
three
switch(3)
three       
         */
        
        //즉 switch 뒤의 괄호에 숫자로 1이 주어지면 case 1에 해당하는 로직 이후의 모든 case들이 실행된다.
        //아래와 같이 코드를 바꿔보자.

/*
  System.out.println("switch(1)");
        switch(1){
        case 1:
            System.out.println("one");
            break;
        case 2:
            System.out.println("two");
            break;
        case 3:
            System.out.println("three");
            break;
        }
         
        System.out.println("switch(2)");
        switch(2){
        case 1:
            System.out.println("one");
            break;
        case 2:
            System.out.println("two");
            break;
        case 3:
            System.out.println("three");
            break;
        }
         
        System.out.println("switch(3)");
        switch(3){
        case 1:
            System.out.println("one");
            break;
        case 2:
            System.out.println("two");
            break;
        case 3:
            System.out.println("three");
            break;
        }
     }
 
}
 
 결과는 다음과 같다.
 
switch(1)
one
switch(2)
two
switch(3)
three
 
break를 만나면 switch 문의 실행이 즉시 중지된다. 따라서 위의 코드는 아래와 같이 if문으로 변경 할 수 있다. 
-> SwitchDemo2참고

-> SwitchDemo2에서 다시 돌아와서

-Default

 즉 if문과 switch문은 서로 대체 가능한 관계다. 이번에는 default를 알아보자.


 System.out.println("switch(1)");
        switch(1){
        case 1:
            System.out.println("one");
            break;
        case 2:
            System.out.println("two");
            break;
        case 3:
            System.out.println("three");
            break;
        default:
            System.out.println("default");
            break;
        }
         
        System.out.println("switch(2)");
        switch(2){
        case 1:
            System.out.println("one");
            break;
        case 2:
            System.out.println("two");
            break;
        case 3:
            System.out.println("three");
            break;
        default:
            System.out.println("default");
            break;
        }
         
        System.out.println("switch(3)");
        switch(3){
        case 1:
            System.out.println("one");
            break;
        case 2:
            System.out.println("two");
            break;
        case 3:
            System.out.println("three");
            break;
        default:
            System.out.println("default");
            break;
        }
         
        System.out.println("switch(4)");
        switch(4){
        case 1:
            System.out.println("one");
            break;
        case 2:
            System.out.println("two");
            break;
        case 3:
            System.out.println("three");
            break;
        default:
            System.out.println("default");
            break;
        }

위의 코드는 각 switch 문에 default:가 이끄는 구문을 추가했다. 그 결과는 아래와 같다
switch(1)
one
switch(2)
two
switch(3)
three
switch(4)
default

가장 마지막은 default로 끝난다. 즉 주어진 케이스가 없는 경우 default 문이 실행된다는 것을 알 수 있다. 

switch 문을 사용할 때 한가지 주의 할 것은 switch의 조건으로는 몇가지 제한된 데이터 타입만을 사용할 수 있다.
byte, short, char, int, enum, String, Character, Byte, Short, Integer


 */


        
		
		
	}

}
