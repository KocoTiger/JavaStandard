package org_bitcamp3_a;

public class bitc3_Array6 {

    public static void main(String args[]) {
    //�迭 ���� : ����, �����
    int[] ar = new int [10]; //���ʰ� �������� ������ ���°� ���ƾ���
    System.out.println (ar); //�� :[I@1c655221 : Arry�迭�� �ĺ���, �迭��
                             // ar = 100; //������� �迭���ٰ� �̷��� �ϸ� �ȵ�
    //�߰��ϱ�
    ar[0] = 10;  // �߰��Ѱ�, �ؿ� ��ar[0] = 20 �̶�� ���� �ȵ�. -> �ٸ��� �� �߰����� ��� ��ȣ�� �ٲ㼭 �����Ѵ�
    ar[1] = 20;            // ar[1] = 20 �̷������� ��Һ�ȣ ��ȭ    
    
    for(int i=0; i < ar.length; i+=1){   //ar.length�� ���� ���� new int [����] �ٲ��� �˾Ƽ� �ٲ� 
    System.out.println (ar [i]); //int ������ , �� : 0
       }
    }
}
