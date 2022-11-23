public class add_mult_2D {
    public static void main(String[] args) {

        int a[][]={{1,3,4},{2,4,3},{3,4,5}};
        int b[][]={{1,3,4},{2,4,3},{1,2,4}};
        int sum[][]=new int[3][3];
        int mul[][]=new int[3][3];

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                sum[i][j]=a[i][j]+b[i][j];
                mul[i][j]=a[i][j]+b[i][j];
                System.out.print(sum[i][j]+" ");
            }
            System.out.println();//new line
        }
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){

                mul[i][j]=a[i][j]*b[i][j];

                System.out.print(mul[i][j]+" ");
            }
            System.out.println();//new line
        }
    }}









