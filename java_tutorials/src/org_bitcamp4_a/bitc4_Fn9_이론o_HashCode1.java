package org_bitcamp4_a;
public class MyClass {
    public static void main(String args[]) { 
        Integer num = 10;   //java���� �ҹ��� �⺻��, �빮�� class��
        int n = 20;
  
        System.out.println (num.hashCode() ); //�ĺ���
        String str = "James";                 //���ڿ� ��ɾ�
        System.out.println (str.hashCode() ); //Hashcode�� �⺻������ ������ ����, �ĺ���
        str = "Dean";
        System.out.println (str.hashCode() ); //�ĺ��� (���ڿ� ���� �ٲ�� Hasecode�� �ٲ�)
        // �Һ��� -> "Dean"  -> new "DEan" -> �׷��� �ؽ��ڵ尡 �ٸ��� ���´�
  
    }

}


//���� �߸� : 0��, ����� �ȳ����� ����
