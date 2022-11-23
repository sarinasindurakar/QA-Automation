public class array {
    public static void main(String[] args) {
        //single dimension array
        /*
        int [] numbers={2,3,4,5,6,7};
        String[] names = {"ssss", "Bbbb", "kkk"};

        System.out.println(numbers[4]);
        //accessing  numbers  in loop
       for (int i = 0; i <numbers.length; i++) {
           System.out.println(numbers[i]);
       }

        for(int j=0;j<names.length;j++){
            System.out.println(names[j]);
        }
        }

         */
        //multidimensional array
        int[][] num = {{1, 2, 3, 4}, {5, 6, 7, 8}};
        int x = num[0][1];
        System.out.println(num[0][1]);
        System.out.println(num[1][3]);
        //accessing with loops
        int[][] num1 = {{1, 2, 3}, {5, 6, 7}};
        for (int i = 0; i < num1.length; ++i) {
            for (int j = 0; j < num1[i].length; ++j) {
                System.out.println(num1[i][j]);

            }

        }
    }
}

