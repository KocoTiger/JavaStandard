package org_bitcamp4_a;
public class MyClass {
    
    public static void main(String args[]){
        String s1 = new String("James"); //new �� heap������ ����, �ĺ� ���� ��ȯ
        String s2 = new String("James"); 
        System.out.println( s1 + ", " + s2 );
        
        if( s1 == s2 ){
            // �ĺ����� ������ Ȯ�� �ϴ� ��
            System.out.println("equal");
        }else{
            System.out.println("not equal");  //�̰� ��ٸ�, �ĺ����� ���� �ʴٶ�� ��
        }
    }
    
    public static void main1(String args[]) { 
        //������ �ּҷ� ǥ���Ѵ�....
        Integer num = 10;   //java���� �ҹ��� �⺻��, �빮�� class��
        int n = 20;
        //OOP--> �⺻, �����
        System.out.println (num.hashCode() ); //�ĺ���
        String str = "James";                 //���ڿ� ��ɾ�
        System.out.println (str.hashCode() ); //Hashcode�� �⺻������ ������ ����, �ĺ���
        str = "Dean";
        System.out.println (str.hashCode() ); //�ĺ��� (���ڿ� ���� �ٲ�� Hasecode�� �ٲ�)
        // �Һ��� -> "Dean"  -> new "DEan" -> �׷��� �ؽ��ڵ尡 �ٸ��� ���´�
    }

}
//���� �߸� : 0��, ����� �ȳ����� ����
