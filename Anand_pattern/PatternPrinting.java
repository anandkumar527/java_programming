public class PatternPrinting {
    public static void butterfly_pattern(int n) {
        //upper half
        for(int i=1; i<=n; i++){
            //left star
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
               // middle space
               int space=2*(n-i);
               for(int j=1; j<=space ; j++){
                  System.out.print(" ");
                }
                    //right star
                    for(int j=1; j<=i; j++){
                        System.out.print("*");
                    }
                    System.out.println();
         }
         //lower half
         for(int i=n; i>=1; i--){
            //left star
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
               // middle space
               int space=2*(n-i);
               for(int j=1; j<=space ; j++){
                  System.out.print(" ");
                }
                    //right star
                    for(int j=1; j<=i; j++){
                        System.out.print("*");
                    }
                    System.out.println();
        }
    }


    public static void solidRhombus(int n){
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
    }

     
    public static void Hollow_Squ(int rows,int columns) {
        //outer loop
         for(int i=1; i<=rows; i++){   
            //inner loop
            for(int j=1; j<=columns; j++){    
                //first or last row/column
                if (i==1||j==1||i==rows||j==columns) {    
                    System.out.print("*");
                } else {
                     System.out.print(" ");
                }
            }
            System.out.println();
        }

    }

    public static void hollow_rhombos (int n) {
        for(int i=1; i<=n; i++){
            //space
            for(int j=1; j<=(n-i); j++){
                System.out.print(" ");
            }  
            //star
            for(int j=1; j<=n; j++){
                if (i==1||i==n||j==1||j==n) {
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void Dimend(int n) {
        //outer loop
        for(int i=1; i<=n; i++){
            //space
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            //star
            for(int j=1; j<=(2*i)-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //outer loop
        for(int i=n; i>=1; i--){
            //space
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            //star
            for(int j=1; j<=(2*i)-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }    
    }

    public static void Number_Tirangle(int n) {
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print(i+" ");   
            }
            System.out.println();
        }
        
    }

    public static void Palindromic_pattern(int n) {
        
        
    }
    public static void main(String args[]){
        //butterfly_pattern(6);
        //solidRhombus(5);
        //Hollow_Squ(5, 6);
        //hollow_rhombos(5);
        //Dimend(5);
        //Number_Tirangle(7);
    }
}
 