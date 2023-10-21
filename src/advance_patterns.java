public class advance_patterns{
    public static void main(String[] args){
        //advanced patterns:
        System.out.println("Butterfy Pattern: ");
        for(int i = 1; i <= 4; i++){
            for (int j = 1; j <= i; j++){
                System.out.print("*");
            }
            for(int k = 1; k <= 2*(4-i); k++){
                System.out.print(" ");
            }
            for (int l = 1; l <= i; l++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = 4; i >= 1; i--){
            for (int j = 1; j <= i; j++){
                System.out.print("*");
            }
            for(int k = 1; k <= 2*(4-i); k++){
                System.out.print(" ");
            }
            for (int l = 1; l <= i; l++){
                System.out.print("*");
            }
            System.out.println();
        }


        System.out.println();
        System.out.println("Solid Rhombus: ");
        for (int i = 1; i <= 5; i++){
            for (int k = 1; k <= 5-i; k++){
                System.out.print(" ");
            }
            for (int j = 1; j <= 5; j++){
                System.out.print("*");
            }
            System.out.println();
        }


        System.out.println();
        System.out.println("Number Pyramid: ");
        for (int i = 1; i<=5; i++){
            for (int k = 1; k<=5-i; k++){
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }


        System.out.println();
        System.out.println("Palindromic Pyramid: ");
        for (int i = 1; i<=5; i++){
            for (int k = 1; k<=5-i; k++){
                System.out.print(" ");
            }
            for (int j = i; j >= 1; j--){
                System.out.print(j);
            }
            for (int l = 2; l <= i; l++){
                System.out.print(l);
            }
            System.out.println();
        }


        System.out.println();
        System.out.println("Diamond Pyramid: ");
        for (int i = 1; i <=4; i++){
            for (int k = 1; k<=4-i;k++){
                System.out.print(" ");
            }
            for (int j = 1; j<=2*i-1;j++){
                System.out.print("*");
            }
//            for (int j = 2; j<=i;j++){
//                System.out.print("*");
//            }
            System.out.println();
        }
        for (int i = 3; i >=1; i--){
            for (int k = 1; k<=4-i;k++){
                System.out.print(" ");
            }
            for (int j = 1; j<=2*i-1;j++){
                System.out.print("*");
            }
//            for (int j = 2; j<=i;j++){
//                System.out.print("*");
//            }
            System.out.println();
        }


        System.out.println();
        System.out.println("Hollow Butterfly Pyramid: ");
        for(int i = 1; i <= 4; i++){
            for (int j = 1; j <= i; j++){
                if(j == 1 || j == i){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            for(int k = 1; k <= 2*(4-i); k++){
                System.out.print(" ");
            }
            for (int l = 1; l <= i; l++){
                if(l == 1 || l == i){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for(int i = 4; i >= 1; i--){
            for (int j = 1; j <= i; j++){
                if(j == 1 || j == i){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            for(int k = 1; k <= 2*(4-i); k++){
                System.out.print(" ");
            }
            for (int l = 1; l <= i; l++){
                if(l == 1 || l == i){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }


        System.out.println();
        System.out.println("Hollow Rhombus Pyramid: ");
        for (int i = 1; i <= 5; i++){
            for (int k = 1; k <= 5 - i; k++){
                System.out.print(" ");
            }
            for (int j = 1; j <= 5; j++){
                if (j==1||j==5||i==1||i==5){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }



        System.out.println();
        System.out.println("Pascal's Triangle: ");
        for (int i = 0; i < 5; i++) {
            int n = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(n+" ");
                n = n * (i - j) / (j + 1);
            }

            System.out.println();
        }


        System.out.println();
        System.out.println("Half Pyramid: ");
        for(int i = 1; i <= 5; i++){
            for (int j = 1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }


        System.out.println();
        System.out.println("Inverted Half Pyramid: ");
        for (int i = 1; i<=4; i++){
            for (int j = 1; j<=4-i+1;j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}