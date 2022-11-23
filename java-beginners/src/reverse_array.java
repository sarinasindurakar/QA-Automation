public class reverse_array {
    public static void main(String[] args) {
        /*
        int [] a = {1, 21, 3, 4, 5, 34, 67};
       System.out.println("original array");
           for(int i=0;i<a.length;i++){
               System.out.print(a[i] + "  ");

           }
           System.out.println();
           //reverse
            System.out.println(" reverse order:");
            for(int i=a.length-1;i>=0;i--)
                System.out.print(a[i] + "  ");
            */

        //checking if two array are equal
         int [] a = {1, 21, 3, 4, 5, 34, 67};
         int [] b={4,5,6,7,8,9,10};


         if(a.length!=b.length){
             System.out.print("length not same");
         }
         else{
             for( int i=0;i<a.length;i++){
                 if(a[i]!=b[i]){
                     System.out.print("not same");
                 }
             }
         }
        }
        }

