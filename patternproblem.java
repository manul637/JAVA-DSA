import java.util.*;

public class patternproblem {
    public static void main (String args[]){

        Scanner sc = new Scanner(System.in);

        // ---------------------------------------  1   NORMAL PATERN - SOLID RECTANGLE--------------------------------------------------

        // int n = sc.nextInt();

        // for( int i = 1 ; i <= n ; i++){
        
        //     for (int j = 1; j <= n ; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println("");

        // }

        // --------------------------------------------  2  HOLLOW RECTANGLE --------------------------------------------------------------

        // int n = sc.nextInt();
        // int m = sc.nextInt();

        // for (int i = 1 ;i <=n ; i ++){
        //     for (int j = 1; j <=m ; j++){
        //         if (i==1 || i==n || j==1 || j==m){
        //             System.out.print("*");
        //         } else {
        //             System.out.print(" ");
        //         }
                
        //     }
        //     System.out.println("");
        // }


        // -------------------------------------------  3  HALFPYRAMMID / RIGHT TRIANGLE ----------------------------------------------

        // int n = sc.nextInt();

        // for (int i = 1 ; i <= n ; i++){
        //     for(int  j = 1 ; j <=i; j ++){                                  //hurrah!!!!
        //         System.out.print("*");
        //     }
        //     System.out.println("");
        // }


        // ------------------------------------------------  4  INVERTED RIIGTH PYRAMID -------------------------------------------------

        // int n = sc.nextInt();
        // for (int i =n ; i >= 1; i--){
        //     for (int j =1 ;j <=i; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println("");
        // }        


        // ---------------------------------------------------- 5  MIRRORED RIGHT TRIANGLED --------------------------------------------------


        // int n = 5;

        // for(int i=1 ; i<=n ; i++){
        //     for ( int j = 1 ; j <=n-i ; j++ ){                                //hurrah!!!!
        //         System.out.print(" ");
        //     }
        //     for (int k = 1 ; k <= i ;k++){                        //could be use j again as counter.
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }



        // ---------------------------------------------------- 6 PYRAMID---------------------------------------------------------

        // int n = 5;
        
        // for (int i= 1 ; i <=n ; i++){
        //     for(int j = i; j<n;j++){
        //         System.out.print(" ");

        //     }
        //     for(int j=1 ; j <=2*i-1 ; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();

        // }


        // ------------------------------------------------- 7 INVERTED PYRAMID --------------------------------------------------------
        
        //  int n = 5;

        //  for (int i = n ; i >=1 ; i--){
        //     for(int j = i; j<n ; j++){
        //         System.out.print(" ");
        //     }
        //     for(int j = 1 ; j<= 2*i-1 ; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        //  }



        // ---------------------------------------------------- 8 HALF NUMBER PYRAMID ----------------------------------------------------

        // int n = 5;                                                             // with i  1              with j 1
        //                                                                              //   22                    12
        // for(int i = 1 ; i <=n ; i++){                                                //   333                   123
        //     for(int j = 1 ; j <=i ;j++){                                             //   4444                  1234
        //         System.out.print(j);                   //hurrah!!                    //   55555                 12345
        //     }                                                     
        //     System.out.println();
        // }



        // ------------------------------------------------------- 9 HALF INVERTED NUMBER PYRAMID ---------------------------------------------

        //  int n = 5;
         
        //  for(int i =n ; i >=1 ; i--){
        //     for(int j= 1 ; j<=i ; j++){                  //hurrah!!!
        //         System.out.print(j);
        //     }
        //     System.out.println();
        //  }


        //ALTER

        // int n = 5;

        // for(int i = 1 ; i <=n ; i++){
        //     for(int j = 1 ; j <=n-i+1 ; j ++){
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }

       
        // --------------------------------------------------- 10 NUMBER PYRAMID ------------------------------------------------

        // int n = 5 ;

        // for (int i = 1; i <=n ; i ++){
        //     for(int j = i; j <n; j++){
        //         System.out.print(" ");
        //     }
        //     for(int k = 1; k <=i ; k++){                            //hurrah!!!
        //         System.out.print(k);
        //     }
        //     for(int l = i-1 ; l >=1 ;l--){
        //         System.out.print(l);
        //     }
        //     System.out.println();
        // }


        //---------------------------------------------------------- 11  FLOYED TRIANGLE --------------------------------------------

        // int n = 5 ;
        // int num = 1;

        // for (int i = 1; i <=n ; i ++){                                //new concept
        //     for(int j = 1; j <=i; j++){
        //         System.out.print(num + " ");
        //         num++;
        //     }
        //     System.out.println();
        // }


        // ---------------------------------------------------------  12   BINARY RIGHT TRIANGLE ----------------------------------

         int n = 5;

         for(int i = 1; i<=n ; i++){
            for(int j = 1 ; j <=i ; j++){
                int sum = i+j;

                if(sum%2==0){
                    System.out.print("1");
                }else{
                    System.out.print("0");
                }
            }
            System.out.println();
         }


            
    }
}
