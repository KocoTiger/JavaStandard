//�Լ��� ���ް� ��ȯ�� ����
public class MyClass {
    // public static void main(String args[]) {// ex> <--�Ű� ���� args /void + �Լ� : �Լ��� ��ȯ�ϴ°��� ���ٶ� ��. 
     public static void main(String args[]) { //ȣ����(��)  
        // fn �Լ��� ȣ���Ѵ�.
        //// �����Ѵ�. ȣ���� -> �� ȣ���� �ش�.
        //(�ܿ�) ȣ���Ϸ��� �Լ��� �Ű������� �ִٸ�, ȣ�� �� �ݵ�� �����ؾ���.
        fn( 3 ); //��ȣ���� (��), //���޵Ǵ� �� fn(����)��� ��.
        //ȣ����, ��ȣ���ڰ� ��ȯ�ϴ� ���� ���������� �޴´�.
        //�����Ÿ� Ÿ�Կ� �°� �޴´�
        String rs = fn (8);
        System.out.println (rs);

    } // end main
    
    public static String fn( int param){ 
        //// �Ű������� ���޵Ǵ� ���� �޴´�. ���� �޴´�.
        System.out.println("invoke fn ---");
        
        return "Hi"; //�Լ� ����, ������ ��ȯ�� ��
        //(�ܿ�) ������ �ʼ�, ��ȯ�� �������̴�!!!!!
        
    }

}
