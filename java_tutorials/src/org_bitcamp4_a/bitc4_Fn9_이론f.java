 public class MyClass {
     
    public static void main(String args[]) { 
    
        for (int i=0; i < 5; i+=1) { // for���� �ݺ� ȸ���� 5���ε�
            System.out.print( (i+0) + ", "); //print�� 2�� �Ǵϱ� �� 10���� �ȴ�
            System.out.print( (i+1) + ", "); // ���⼭�� ������� �ѹ��� 2���� �ȰŴ�
        }
    }
}

//���� �߸� : 0��, ����� �ȳ����� ����



 
 public class MyClass {
   
    public static void main(String args[]) { 
    //ȭ�� ��� 0 ~ 5���� ���Ӱ��� ��� <----1��
        for (int i=0; i < 5; i+=2) { // for���� �ݺ� ȸ���� 5���ε� / i + 2�϶� (0 2 4) 3�� �ݺ��ǰ� ����
            System.out.print( (i+0) + ", "); //print�� 2�� �Ǵϱ� �� 5 * 2 = 10���� �ȴ�
            System.out.print( (i+1) + ", "); 
        }
    }
}

//���� �߸� : 0��, ����� �ȳ����� ����

//����� : 0, 1, 2, 3, 4, 5, 
