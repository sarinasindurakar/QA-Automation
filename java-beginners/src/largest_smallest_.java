import java.util.Scanner;

public class largest_smallest_ {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int[] num = new int[5];
        for (int i = 0; i < num.length; i++) {
            //System.out.println(num[i]);
            num[i] = scanner.nextInt();
        }
        int largest = num[0];
        int smallest = num[0];

        for (int i = 0; i < num.length; i++){
            if(num[i]>largest)
                largest = num[i];
            if(num[i]<smallest)
                smallest = num[i];
        }

        System.out.println("Largest is "+largest+" and smallest is "+smallest);

    }
}
