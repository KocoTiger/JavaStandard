package org_bitcamp4_a;
public class MyClass {
    
    public static void main(String args[]){
        int[] a = new int[]{1,2,3,5,4}; //�迭���� �޶����̷��� ���ϴ°͵�
        int[] b = new int[]{1,2,3,4,5}; //�迭���� �޶���
        
        //���� : ���ڿ��� �Է¹޾Ƽ� �Ųٷ� ����Ͻÿ�
        // reverse string?
        // ��κ�, 123, 345, 567 -> 567, 345, 123
        // ������ ��Ʈ���� 345�� -> 543 �̷������� �ٲٴ� ��
        
        
        // �� �迭�� ��� ��ҵ��� ������ Ȯ�� �ϼ���
        //new�� ���̸� ���� �ϳ��� ������ٰ� ������, �迭�� �ΰ��ٶ�� ������
        if( a == b ){
            System.out.println(a + "==" + b); // ������� �������� ���� �ȳ����� ���ڳ׶�� ����
        }else {
            if ( a.length == b.length ){ //���� üũ!
                String rs = " == ";
                for(int i = 0; i < a.length; i+=1){
                    if(a[i] != b[i]){   //!=�̰ɷε� �� ���� : ������ �ϳ��� ������ �ι迭�� �ٸ���. (������ ==, �Ѵ� ���ٶ�� �����⶧����)
                                        // ���δ� ���ϴ� �� ���� �ϳ��� Ʋ���ٸ����� ã�°� �� ������.
                                        // �ι迭�� �� ���ƾ� �Ѵ�.
                        rs = " != ";
                        break;
                    }                    
                }
                System.out.println (a + rs + b); 
            }else{
                System.out.println (a + " != "+ b);
            }
        }
        
    }
    
    public static void main2(String args[]){
        String s1 = new String("James"); //new �� heap������ ����, �ĺ� ���� ��ȯ
        String s2 = new String("James");
        System.out.println( s1 + ", " + s2 );
        
        int a = 10; 
        int b = 20;
        //int���� �׳� �񱳸� ���ָ� �� 
        // class���� ������, ���������� ���ؾ���
        
        if (s1.equals (s2) ){ //���ڿ��� ���Ϸ���
            //���ڿ� �ȿ� ���� ���ڵ��� ��� ���ƾ� ���ٶ�� �� �� �ִ�
            //.equals�� s1�� s2�� ������ ��(������)�� �������� ���ϴ� ��.
            System.out.println("equals");
        }
        //���ڿ��� ����, �ĺ���-��ġ �� �ٸ���.
        //������ ��������� �ĺ����� �޶�� �Ѵ�.
        // ����� ��� ������ �ٸ���!
        if( s1 == s2 ){// �ĺ����� ������ Ȯ�� �ϴ� �� // �ĺ����� �����Ŵ� ������ �ϳ��� ��� ��
            System.out.println("equal");
        }else{
            System.out.println("not equal");  //�̰� ��ٸ�, �ĺ����� ���� �ʴٶ�� ��/������ �ΰ� ��� ���� �˼� �̴�
        }
    }
    //1. �ĺ����� ������ Ȯ���Ѵ�
    //2. �ȿ��ִ� ���� ������
    
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

