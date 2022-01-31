//* 절대위치 상대좌표
//(번호 개념 설명)


 public class MyClass {

    public static void main(String args[]) { 
    //화면 출력 0 ~ 5까지 연속값이 출력 <----1차
    //현재 위치를 0이라 생각하고, ~번 이동, 옆에
    //i * 4 + j 같이 상대적으로 이동한다는 의미의 식 ---> [i]][j] 2차 배열
        for (int i=0; i < 20; i+=4) { // for문은 반복 회수가 5번인데 / i + 2일때 (0 2 4) 3번 반복되게 나옴
            // [3] + 0, +1이란건 [4], 상대적 기준이 어딘지, 바뀐다.
            // i에서 0번
            System.out.print( (i+0) + ", "); //print가 4번 되니까 총 5 * 4 = 10번이 된다
            // i에서 1번
            System.out.print( (i+1) + ", ");
            System.out.print( (i+2) + ", "); 
            System.out.print( (i+3) + ", "); 
            
        }
    }
}

//에러 뜨면 : 0점, 결과가 안나오면 감점





//*
// URL 얘기
// /list/details.view 에서 앞에 .을 빼고 넣고는 큰차이다. (절대경로)
// ./list/details.view 에서 앞에 .을 빼고 넣고는 큰차이다. (상대경로)
// .. 이전 + 이전

