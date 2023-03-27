public class java2dArray {
    public static void main(String[] args){
        int [][] arr1 = new int[2][2];
        arr1[0][0]=18;
        arr1[0][1]=18;
        arr1[1][0]=18;
        arr1[1][1]=18;

        for(int i=0;i<arr1.length;i++){
            for (int j=0;j< arr1.length;j++){
                System.out.print(arr1[i][j]+" ");
            }
            System.out.println();

        }

    }
}
