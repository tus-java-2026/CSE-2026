/**
 * JAVA PATTERN HANDBOOK
 * Beginner Revision Guide
 */
public class JavaPatternHandbook {

    public static void main(String[] args) {

        /*
//====================================================
// Left Star Triangle
//
// Output:
//
// *
// **
// ***
// ****
// *****

//====================================================

for (int i = 1; i <= 5; i++) {
    for (int j = 1; j <= i; j++) {
        System.out.print("*");
    }
    System.out.println();
}

        */

        /*
//====================================================
// Inverted Left Triangle
//
// Output:
//
// *****
// ****
// ***
// **
// *

//====================================================

for (int i = 5; i >= 1; i--) {
    for (int j = 1; j <= i; j++) {
        System.out.print("*");
    }
    System.out.println();
}

        */

        /*
//====================================================
// Square
//
// Output:
//
// *****
// *****
// *****
// *****
// *****

//====================================================

for (int i=1;i<=5;i++){
    for(int j=1;j<=5;j++){
        System.out.print("*");
    }
    System.out.println();
}

        */

        /*
//====================================================
// Hollow Square
//
// Output:
//
// *****
// *   *
// *   *
// *   *
// *****

//====================================================

for(int i=1;i<=5;i++){
    for(int j=1;j<=5;j++){
        if(i==1||i==5||j==1||j==5)
            System.out.print("*");
        else
            System.out.print(" ");
    }
    System.out.println();
}

        */

        /*
//====================================================
// Rectangle
//
// Output:
//
// ******
// ******
// ******

//====================================================

for(int i=1;i<=3;i++){
    for(int j=1;j<=6;j++){
        System.out.print("*");
    }
    System.out.println();
}

        */

        /*
//====================================================
// Number Triangle
//
// Output:
//
// 1
// 12
// 123
// 1234
// 12345

//====================================================

for(int i=1;i<=5;i++){
    for(int j=1;j<=i;j++){
        System.out.print(j);
    }
    System.out.println();
}

        */

        /*
//====================================================
// Repeated Number Triangle
//
// Output:
//
// 1
// 22
// 333
// 4444
// 55555

//====================================================

for(int i=1;i<=5;i++){
    for(int j=1;j<=i;j++){
        System.out.print(i);
    }
    System.out.println();
}

        */

        /*
//====================================================
// Reverse Number Pattern
//
// Output:
//
// 54321
// 5432
// 543
// 54
// 5

//====================================================

for(int i=5;i>=1;i--){
    for(int j=5;j>=i;j--){
        System.out.print(j);
    }
    System.out.println();
}

        */

        /*
//====================================================
// Alphabet Triangle
//
// Output:
//
// A
// AB
// ABC
// ABCD
// ABCDE

//====================================================

for(char i='A';i<='E';i++){
    for(char j='A';j<=i;j++){
        System.out.print(j);
    }
    System.out.println();
}

        */

        /*
//====================================================
// Repeated Alphabet Triangle
//
// Output:
//
// A
// BB
// CCC
// DDDD
// EEEEE

//====================================================

for(char i='A';i<='E';i++){
    for(char j='A';j<=i;j++){
        System.out.print(i);
    }
    System.out.println();
}

        */

        /*
//====================================================
// @ Triangle
//
// Output:
//
// @
// @@
// @@@
// @@@@
// @@@@@

//====================================================

for(int i=1;i<=5;i++){
    for(int j=1;j<=i;j++){
        System.out.print("@");
    }
    System.out.println();
}

        */

        /*
//====================================================
// # Triangle
//
// Output:
//
// #
// ##
// ###
// ####
// #####

//====================================================

for(int i=1;i<=5;i++){
    for(int j=1;j<=i;j++){
        System.out.print("#");
    }
    System.out.println();
}

        */

        /*
//====================================================
// $ Triangle
//
// Output:
//
// $
// $$
// $$$
// $$$$
// $$$$$

//====================================================

for(int i=1;i<=5;i++){
    for(int j=1;j<=i;j++){
        System.out.print("$");
    }
    System.out.println();
}

        */

        /*
//====================================================
// + Triangle
//
// Output:
//
// +
// ++
// +++
// ++++
// +++++

//====================================================

for(int i=1;i<=5;i++){
    for(int j=1;j<=i;j++){
        System.out.print("+");
    }
    System.out.println();
}

        */

        /*
//====================================================
// X Triangle
//
// Output:
//
// X
// XX
// XXX
// XXXX
// XXXXX

//====================================================

for(int i=1;i<=5;i++){
    for(int j=1;j<=i;j++){
        System.out.print("X");
    }
    System.out.println();
}

        */

    }
}
