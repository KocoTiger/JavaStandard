package org_bitcamp3_b;

public class bitc3_Array_CRUD3 {

	public class MyClass {
	    public static void main(String args[]) {
	        //�迭 ���� : ����, �����
	        int[] ar = new int [10]; 
	        System.out.println (ar);
	        // �迭�� ������� �κе��� �����غ�����
	        // Create Read Update Delete (SW���� ���� �⺻���� ��/CRUD)
	        int idx = 0;  //������ ���� ������ �߰�ȣ ��
	        {
	            //�߰��ϱ� (�迭����) : ��ȣ?, ������ �� -> �ߺ� ����?
	            int value = 100;
	            ar[ idx ] = value; //ar[ ? ] ��� ��ҿ� �����Ҳ���
	            idx += 1;          // �̷��� ���� 0�� ��ҵ� ���ڴ�. �� ��. �̰��� ���� �ö󰡸� 0�� ��Ҵ� �Ⱦ��ڴٶ� ��
	        }   
	        {
	            //�����ϱ� : ��ȣ?, �� ��� ó��?
	            int delete = 0;  //������ ����� ��ȣ, �����ҿ�Ҹ� ã�´�
	            ar[delete] = 0;  //delete�� ��Ҹ� �ʱ�ȭ, ����ٷ� ����
	            idx -= 1;        //�迭�� ���δ�
	        }	    
	        {
	            //�����ϱ� : ��ȣ?, �б�� ���� �ؾ��� (�ƴϸ� ����Ⱑ �ȴ�)
	            int insert = 0;         //���Ե� ���
	            int value = 100;
	            ar[ insert ] = value;   // ������ ������ �ٽ� ����� ������ �����Ѵ�
	            idx -= 1;               //   
	        }	    
	        {
	            //�����ϱ� : ��ȣ?, ������ ��(��� ��) -> ���� �����Ͱ� �־�� �Ѵ�
	            int edit = 1;
	            int value = 200;        // ���� �ٲ�
	            ar [edit] = value;
	            idx += 1;               //���� ����
	        }	    
	        {
	            //�˻��ϱ� -1 : ���� �ְ� ��ҹ�ȣ�� ã�´�.
	            //���� Ž��,�˻�  & ?
	        int key = 100;  //ã�� ��
	        for (int i = 0; i < idx; i+=1){   //���� ������ ������ �ݺ��ؼ� ã���� ��
	            if( key == ar[i] )
	                System.out.print(i+"�� ���,");
	                // �ߺ����ο� ���� ó���� �ٸ���. (�ߺ����� : 1���� ã���� �ȴ� -> �˻��� ����)
	                // �迭�ȿ� �ߺ����� �ϳ����� ������ �ȴ� ������, �˻� �ʿ� ����
	                break ;	            
	            }    
	            System.out.print("\n");
	        }	        
	        {
	            //�˻��ϱ� -2 : ��� ��ȣ �ְ� ���� ������.
	        int no = 2; //ã�� ��� ��ȣ
	        int result = ar[no];
	                 System.out.print(result+"\n");	               
	        }	    
	        {
	            //��� ���� : ����� ���� ���
	            for (int i=0; i < ar.length; i+=1){
	                System.out.print(ar[i]+",");
	            }
	            System.out.print("\n"); //���� ����, ��ĭ ������\n  /  /t �� 5ĭ ���� ���
	        }                  
	    }
  }
}