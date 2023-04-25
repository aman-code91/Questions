public class Main{
    public static void pattern1(int n){
        int star = 1;

        for(int row = 0; row < n; row++){

            for(int cst = 0; cst < star; cst++){
                System.out.print("*");
            }

            System.out.println();
            star++;

        }

    }
public static void pattern2(int n){
        int star = 1;
        int space = n-1;

        for(int row = 0; row < n; row++){
            for(int csp = 0; csp < space; csp++){
                System.out.print(" ");
            }
            for(int cst = 0; cst < star; cst++){
              System.out.print("*");  
            }
            System.out.println();
            star++;
            space--;

        }

    }
    public static void pattern3(int n){
        int star = 1;
        int val = 1;

        for(int row = 0; row < n; row++){

            for(int cst = 0; cst < star; cst++){
                System.out.print(val);
            }

            System.out.println();
            star++;

        }

    }

    public static void main(String [] args){
        // pattern1(5);
        pattern3(5);
    }
}