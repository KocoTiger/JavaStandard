package org_bitcamp4_a;
//*������ ����
public class MyClass {

    public static void main(String args[]) { 
        //������, ����, ��ȯ
        //  int fn_v = 10;
        //  int rs = fn(); // <----20���� ����
        //  fun( main_v );     //�ؿ� int fn_v ������ ������ ���� �ʴ´�.
        //  System.out.println( main_v ); //�ؿ� int fn_v ������ ������ ���� �ʴ´�.
         
         int[] a = new int[]{12, 23, 34};
         System.out.println( a ); //(�迭��)
         edit( a ); //�迭�� �����Ѵ�. / call by value : a[0] �̶�� �ߴٸ� ���� �����Ѵٴ� �ǹ�
         System.out.println( a );       //�迭��
         System.out.println( a[0] );    //�迭��
         System.out.println( a[1] );    //�迭��
         System.out.println( a[2] );    //�迭��
    }
    
    //������, ������ -> �̸��� �˼� ����.

    //Call by Reference(�޸��� �ּ�, ����) : ȣ������ ������ �ش�......
    //������ : Can not find symbole : �̸��̶�� ������. �޸𸮻� ��ġ�� �˸� ������ ��.
    public static void edit(int[] b){  //b��� �Ű������� ����
        //�迭�� ���޹޾Ƽ� �� ��ҵ��� �����Ѵ�. => ��ġ�� �ȴٸ�! main�� ������ �ټ��ִ�!
         b[0] = 10;
         b[1] = 20;
         b[2] = 30;
        
    }
    
    //Call by Value ���� ���� �Ѵ� : ȣ����(main)�� ��ȭ�� ����......
    public static void fun(int param){ // = main_v
        // main_v == param �̼������� ���� ���� ����
        param +=90;
        System.out.println(param);
    }
    
    public static int fn(){
        //������ ��
        int fn_v = 20;
        
        return fn_v; //���� �� ���� -> ��������
 
    }

}


//���� �߸� : 0��, ����� �ȳ����� ����
