//Switch��


/*
 ���ǹ��� ��ǥ���� ������ if���̴�. 
 ���󵵴� ������ ������ ���ٸ� switch���� ������ ���� ����ϰ� ������ �� �ִ�. 
 �Ʒ��� �ڵ带 ����.
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
		
        //����� �Ʒ��� ����.
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
        
        //�� switch ���� ��ȣ�� ���ڷ� 1�� �־����� case 1�� �ش��ϴ� ���� ������ ��� case���� ����ȴ�.
        //�Ʒ��� ���� �ڵ带 �ٲ㺸��.

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
 
 ����� ������ ����.
 
switch(1)
one
switch(2)
two
switch(3)
three
 
break�� ������ switch ���� ������ ��� �����ȴ�. ���� ���� �ڵ�� �Ʒ��� ���� if������ ���� �� �� �ִ�. 
-> SwitchDemo2����

-> SwitchDemo2���� �ٽ� ���ƿͼ�

-Default

 �� if���� switch���� ���� ��ü ������ �����. �̹����� default�� �˾ƺ���.


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

���� �ڵ�� �� switch ���� default:�� �̲��� ������ �߰��ߴ�. �� ����� �Ʒ��� ����
switch(1)
one
switch(2)
two
switch(3)
three
switch(4)
default

���� �������� default�� ������. �� �־��� ���̽��� ���� ��� default ���� ����ȴٴ� ���� �� �� �ִ�. 

switch ���� ����� �� �Ѱ��� ���� �� ���� switch�� �������δ� ��� ���ѵ� ������ Ÿ�Ը��� ����� �� �ִ�.
byte, short, char, int, enum, String, Character, Byte, Short, Integer


 */


        
		
		
	}

}
