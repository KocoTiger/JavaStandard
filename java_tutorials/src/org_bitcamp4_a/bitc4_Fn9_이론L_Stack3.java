package org_bitcamp4_a;
//* ���� �Լ��� �Լ���  �ٽ� ���Ǵ� ��� (����)
//�迭(��ġ)�� �˰��


public class MyClass {

    public static void main(String args[]) { 
        //������, ����, ��ȯ
        //  int fn_v = 10;
        //  int rs = fn(); // <----20���� ����
        //  fun( main_v );     //�ؿ� int fn_v ������ ������ ���� �ʴ´�.
        //  System.out.println( main_v ); //�ؿ� int fn_v ������ ������ ���� �ʴ´�.
         
         int[] a = new int[]{12, 23, 34};
         System.out.println( a ); //(�迭��)
         int[] d = edit(a);
         System.out.println( d );       //�迭��
         System.out.println( d[0] );    //�迭��
         d[1] = 20;
         System.out.println( d[1] );    //�迭��
         System.out.println( d[2] );    //�迭��
    }
    
    //������, ������ -> �̸��� �˼� ����.

    //Call by Reference(�޸��� �ּ�, ����) : ȣ������ ������ �ش�......
    //������ : Can not find symbole : �̸��̶�� ������. �޸𸮻� ��ġ�� �˸� ������ ��.
    public static int[] edit(int[] b){  //b��� �Ű������� ����
        //�迭�� ���޹޾Ƽ� �� ��ҵ��� �����Ѵ�. => ��ġ�� �ȴٸ�! main�� ������ �ټ��ִ�!
        int[] c = new int[10];
        System.out.println( c );
         b[0] = 10;
         b[1] = 20;
         b[2] = 30;
        return c; //�迭�� ��ȯ�Ѵ�.....        
    }
    
    //Call by Value ���� ���� �Ѵ� : ȣ����(main)�� ��ȭ�� ����......(�迭�̶��, ��ġ�� �ȴٸ� ����)
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


//����� :
//[I@1c655221
//[I@ee7d9f1
//[I@ee7d9f1
//0
//20
//0
