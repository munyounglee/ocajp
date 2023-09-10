public class question11 {
    public static void main(String[] args){
        int[][] arr = new int[2][4];

        int[] arr1 = new int[2];
        System.out.println(arr1[0]); // 배열 선언안하면 초기값은 0
        //2행 4열인 배열
        /*
        [0][0]1 [0][1]3 [0][2]5 [0][3]7
        [1][0]1 [1][1]3 [1][2] [1][3]
         */
        arr[0] = new int[] {1,3,5,7};
        arr[1] = new int[]{1,3};

       // System.out.println("arr[1][2]"+ arr[1][2]);
        System.out.println(arr.length);
        //System.out.println(arr[1].length);
        //System.out.println("arr[1][2] = " + arr[1][2]);// 선언 안해가지고 Index 2 out of bounds for length2가 뜸 1,3,5,7로 해놓으면 문제없음.
        //System.out.println("arr[1][3] = " + arr[1][3]);
        for(int[] a: arr){
            for(int i=0; i<arr.length; i++){
                System.out.print(a[i] + " " );

            }
            System.out.println();
        }
        /*
        1 3
        1 3이 나옴.

         */

    }
}
