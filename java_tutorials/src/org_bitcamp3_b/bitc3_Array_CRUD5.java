package org_bitcamp3_b;

public class bitc3_Array_CRUD5 {

    public static void main(String args[]) {
        //�迭 ���� : ����, �����
        int[] ar = new int [10]; //�ִ� 10¥�� �迭�� ����Ŵ�
        System.out.println (ar);
        // Create Read Update Delete (SW���� ���� �⺻���� ��/CRUD)
        int loop = 15;
        int idx = 0;        // �Ź� ���� ������ ����?
        //������ : ������ ���� ����? �Ź� ���� ����?
        while( loop > 0 ){ //start while, true���� ���� ����
            loop -= 1;
        {
            //�߰��ϱ� (�迭����) : ��ȣ?, ������ �� -> �ߺ� ����?
            if (idx < ar.length ) {
            int value = 100;
            ar[ idx ] = value; 
            idx += 1;
            }else{
                System.out.println ("array full");
            }
        }   
        {
            //�����ϱ� : ��ȣ?, V�� ��� ó��? ���� ���� (���� ���¸� �Ҳ���)
            int delete = 0;  //������ ��ȣ
            //������ҷ� ��� ä���...
            for (int i = delete; i < ar.length-1; i += 1) { //i ������ 8���� ���� ��������
                ar[i] = ar[i+1]; // i + 1�� 10�̻��� �Ǹ� �ȵ�. �ִ밪�� 8 �ִ� 9�� �ʰ��ϸ� �ȵ�
            }
            //������ �پ��� - ������ ��ĭ�� ���.
            idx -= 1;        
        }   
        {
            //�����ϱ� : ��ȣ?, �б�� ���� �ؾ��� (�ƴϸ� ����Ⱑ �ȴ�)
            int insert = 0;      //���Ե� ���   
            int value = 100;
            ar[ insert ] = value;   
            idx += 1;                
        }    
        {
            //�����ϱ� : ��ȣ?, ������ ��(��� ��) -> ���� �����Ͱ� �־�� �Ѵ�
            int edit = 1;
            int value = 200;        
            ar [edit] = value;
        }    
        {
            //�˻��ϱ� -1 : ���� �ְ� ��ҹ�ȣ�� ã�´�.
            //���� Ž��,�˻�  & ?
        int key = 100;  //ã�� ��
        for (int i = 0; i < idx; i+=1){  
            if( key == ar[i] ){
                System.out.print(i+"�� ���");
                // �ߺ����ο� ���� ó���� �ٸ���. (�ߺ����� : 1���� ã���� �ȴ� -> �˻��� ����)
                // �迭�ȿ� �ߺ����� �ϳ����� ������ �ȴ� ������, �˻� �ʿ� ����
                break ;
                }
            }    
            System.out.print("\n");
        }
        
        {
            //�˻��ϱ� -2 : ��� ��ȣ �ְ� ���� ������.
        int no = 2; 
        int result = ar[no];
            System.out.print(result + "\n");               
        }        
        {
            //��� ���� : ����� ���� ���
            for (int i=0; i < ar.length; i+=1){
                System.out.print(ar[i]+" ");
                }
                System.out.print("\n");
        }           
    } //end while   
            
    } //main �Լ� �߰�ȣ

    
}   //class �߰�ȣ
