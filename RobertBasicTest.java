import java.util.ArrayList;

import java.util.Arrays;

public class RobertBasicTest{

    public static void main(String[] args){

        RobertBasic iD  = new RobertBasic();

/*-------------------------------------------------------------------------------------------------------*/       

        iD.oneToTwo(1,255);


/*-------------------------------------------------------------------------------------------------------*/        

        iD.printOdd(1,255);

/*-------------------------------------------------------------------------------------------------------*/

        iD.printSum(1,255);

/*-------------------------------------------------------------------------------------------------------*/

        int[] x = {1,3,5,7,9,13};

        iD.printArray(x);

/*-------------------------------------------------------------------------------------------------------*/

        int[] x = {1,-3,14,0};

        System.out.println(iD.printMaximum(x));

/*-------------------------------------------------------------------------------------------------------*/

        int[] x = {2,4,5,9};

        System.out.println(iD.printAverage(x));

/*-------------------------------------------------------------------------------------------------------*/

        System.out.println(iD.oddArray(1,255));

/*-------------------------------------------------------------------------------------------------------*/

        int[] x = {1,3,5,7};

        int y = 3;

        System.out.println(iD.greaterThanY(x,y));

/*-------------------------------------------------------------------------------------------------------*/

        int[] x = {1,5,10,-2};

        System.out.println(Arrays.toString(iD.squareArray(x)));

/*-------------------------------------------------------------------------------------------------------*/

        int[] x = {1,5,2,-10};

        System.out.println(Arrays.toString(iD.elimNeg(x)));

/*-------------------------------------------------------------------------------------------------------*/      

        int[] x = {1,5,10,-2};

        System.out.println(iD.maxminAverage(x));

/*-------------------------------------------------------------------------------------------------------*/

        int[] x = {1,5,7,10,-2};

        System.out.println(Arrays.toString(iD.shiftValues(x)));

    }

}