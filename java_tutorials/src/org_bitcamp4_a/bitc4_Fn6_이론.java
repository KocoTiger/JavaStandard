//<�߰��� ���� ��ȭ�� 30�� ������ �ڵ�>

public class MyClass {
    // �۰� ���� �� ���� �����Ѵ�. --> ���α׷���.
    public static void main(String args[]) {
        
        for(int i=0; i<3; i++) {
            printMatrics(5, 8); // (�ళ��, ������) <- ������ == ���� ����
            System.out.println("------");
        }//end for
        
    }//main
    
    // ~��~�� 2������ ���
    public static void printMatrics(int row, int col) {
        for(int i=0; i < row; i++) {
            printLine(col);
        }//end for
        
    }//printMatrics()
    
    // 1���� ����ϴ� �Լ�
    public static void printLine(int length) {
        for (int i=0; i < length; i++) {
            System.out.print('O'); // char '', String ""
        }//end for
        System.out.println();
    }//printLine()
    
}//class
