package self;
public class pr_set6 {
    public static void main(String[] args) {
        //Q. 1(create array of 5 floats & sum of them)
//        float [] marks = {2.5f,2.5f,2.5f,2.5f,2.5f,2.5f};
//        float sum=0.0f;
//        for (float elements : marks) {
//            sum += elements;
//        }
//            System.out.println("sum of given array elements is :" + sum);


        //Q.2 To find given element is present in array or not
//        float[] marks = {2.5f, 3.5f, 4.5f, 5.5f, 6.5f, 7.5f};
//        float num = 8.5f;
//        boolean isInArray = false;
//        for (float element : marks) {
//            if (num == element) {
//                isInArray = true;
//                break;
//            }
//        }
//        if (isInArray) {
//            System.out.println("The value is  present in an array");
//        } else {
//            System.out.println(" The value is not present in an array");
//        }


        //Q.3 Average of array elements marks in physics
//        float [] marks = {2.5f,2.5f,2.5f,2.5f,2.5f,2.5f};
//        float sum=0.0f;
//        for (float elements : marks) {
//            sum += elements;
//        }
//            System.out.println("average value of given array elements is :" + sum/ marks.length);


//        // Q.4 to add 2 matrices of 2*3 size.
//        int[][] mat1 = {{1, 2, 3},
//                {4, 5, 6}};
//        int[][] mat2 = {{1, 2, 3},
//                {4, 5, 6}};
//        int[][] sum = {{0, 0, 0},
//                {0, 0, 0}};
//        for (int i = 0; i < mat1.length; i++) {  // row no. of times
//            for (int j = 0; j < mat2[i].length; j++) { //column no. of times
//                sum[i][j] = mat1[i][j] + mat2[i][j];
//                System.out.print(sum[i][j] + " ");
//            }
//            System.out.println(" ");


            // Q.5 to find max no in an array
        int[] arr = {1, 2, 3, 4, 5};
        int l = arr.length;
        int n = Math.floorDiv(l, 2);
        int temp;

        for (int i = 0; i < n; i++) {
            // swap a[i] & a[l-1-i]
            temp = arr[i];
            arr[i] = arr[l - 1 - i];
            arr[l - 1 - i] = temp;
        }
        for (int element : arr) {
                System.out.print(element +" ");
            }


            // Q.6 Max no. in an array
//        int[] arr = {1, 2, 13, 4, 5};
//        int max= 0;
//        for( int ele:arr){
//            if(ele>max){
//                max=ele;}
//        }
//        System.out.println("maximun element in an array is:"+max);


//         //Q.7 Mini no. in an array
//        int[] arr = {15, 12, 13, 4, 5};
//        int min=1000;
//        for( int ele:arr){
//            if(ele<min){
//                min=ele;}
//        }
//        System.out.println("minimum element in an array is:"+min);


//         //Q.7 other way to solve same
//        System.out.println(" mini value is"+ Integer.MIN_VALUE);
//        System.out.println(" mini value is"+ Integer.MAX_VALUE);

//
//        //Q.9 to check it is sorted or not
//        int[] arr = {5, 12, 13, 14, 15};
//        boolean isSorted = true;
//        for(int i=0; i< arr.length;i++){
//            if( arr[i] > arr[i+1]){
//                isSorted= false;
//                break;
//            }
//        }
//        if(isSorted){
//            System.out.println("The array is sorted");
//        }
//        else{
//            System.out.println("The array is not sorted");
//        }


        }

    }
