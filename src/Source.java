import jdk.dynalink.beans.StaticClass;

@SuppressWarnings("ALL")
public class Source {


    public static void main(String [] ags){
printLadder(5);



            }

    private static void printLadder(int steps){

            for (int i = 0; i < steps; i++)
            {

                 for (int j = 0; j < i; j++)
                 {
                    System.out.print(" ");
                    for (int k = 0; k < j; k++)
                     {
                         System.out.print("*");

                     }

               }

                System.out.println();
            }

        }





    public static int convertMinToSec(int min)
    {
        int myAnswer = min * 60;





        return myAnswer;
    }


//    public static double calculateTheMean(int studentsAges[]){
//
//
//    }


public static void sUmofArray (int numbers []){
        int sum = 0;
    for (int i = 0; i <numbers.length ; i++) {
         sum =+ numbers [i] ;
    }
    System.out.println(sum);

}
public static int  smallestNumber (int number [])
{
        int smallnumber = 99999999;
    for (int i = 0; i < number.length ; i++)
    {
        if (number[i] < smallnumber)
            smallnumber = number[i];
    }

   return smallnumber;
}

public static void arrngmntTheStds (int a,int b,int c) {
    if ((a > b) && (a > c)) {
        if (b > c)
            System.out.println(a + " " + b + " " + c);
        else System.out.println(a + " " + c + " " + b);
    } else if ((b > a) && (b > c)) {
        if (a > c)
            System.out.println(b + " " + a + " " + c);
        else System.out.println(b + " " + c + " " + a);
    } else if ((c > a) && (c > b)) {
        if (a > b)
            System.out.println(c +" "+ a +" "+ b);
            else System.out.println(c +" "+ b +" "+ a);

    }




}


}
