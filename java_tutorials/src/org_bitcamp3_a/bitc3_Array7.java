package org_bitcamp3_a;

public class bitc3_Array7 {

    public static void main(String args[]) {
    //�迭 ���� : ����, �����
    int[] ar = new int [10]; //���ʰ� �������� ������ ���°� ���ƾ���
    System.out.println (ar); //�� :[I@1c655221 : Arry�迭�� �ĺ���, �迭��
                             // ar = 100; //������� �迭���ٰ� �̷��� �ϸ� �ȵ�
    
    int idx = 0;  //������ ��ȣ, ������ ����
    
    //�߰��ϱ�
    ar[idx] = 10; 
    idx += 1;
    ar[idx] = 20;
    idx += 1;           
    //���� ����� �͸� ����ϱ�           
    for(int i=0; i < idx; i+=1){   
    System.out.println (ar [i]);        //int ������
                                    // idx : ��� �ΰ���
                                    //1) ��Ҵ� 2) �ΰ��� �߰� �ߴٺ��� �ִ�
       }
    }
}
