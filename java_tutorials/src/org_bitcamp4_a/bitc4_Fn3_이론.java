//�Լ��� ���ް� ��ȯ�� ����
public class MyClass {
    // public static void main(String args[]) {// ex> <--�Ű� ���� args /void + �Լ� : �Լ��� ��ȯ�ϴ°��� ���ٶ� ��. 
     public static void main(String args[]) { //ȣ����(��)  
        // fn �Լ��� ȣ���Ѵ�.
        //// �����Ѵ�. ȣ���� -> �� ȣ���� �ش�.
        //(�ܿ�) ȣ���Ϸ��� �Լ��� �Ű������� �ִٸ�, ȣ�� �� �ݵ�� �����ؾ���.
        fn( 3 ); //��ȣ���� (��), //���޵Ǵ� �� fn(����)��� ��.
        // main�Լ��� fn�ڵ带 ���� ��Ų��
    } // end main
    
    public static void fn( int param, int args, float f ){ //�̷������� �迭 ����
        //// �Ű������� ���޵Ǵ� ���� �޴´�. ���� �޴´�.
        //�ܺη� ���� ���� ������ -> �Ű����� ���� �̶� ��.
        //�ܺζ�� ���� ���� �ϸ� �ȵȴ�.
        System.out.println("invoke fn ---");
        
    }

}

	
