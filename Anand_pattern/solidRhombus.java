public class solidRhombus {
    public static void main(String[] args) {
        int n=4;
        for(int i=1; i<=n; i++){
            //Spaces
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            //star
            for(int j=1; j<=n; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        /* for(int i=1; i<=2; i++){
            //star 
            for(int j=1; j<=50; j++){
                System.out.print("*");
            }
            System.out.println();
        } */

        /* for(int i=n; i>=1; i--){
            //Spaces
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            //star
            for(int j=1; j<=n; j++){
                System.out.print("*");
            }
            System.out.println();
        } */
    }
}
