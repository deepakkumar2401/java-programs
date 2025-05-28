package interview;

public class Matrices {

    public static void main(String[] args) {
        int[][] arr={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int[][] brr={
                {1,0,3},
                {4,5,6},
                {7,8,9}
        };

        boolean flag = true;
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr.length;j++){
                if (arr[i][j]!=brr[i][j]){
                    flag=false;
                    break;
                }
            }
        }
        if (flag){
            System.out.println("identical");
        }else {
            System.out.println("non");
        }
    }
}
