import java.util.ArrayList;

import java.util.Arrays;

public class RobertBasicJava{

 

    public void oneToTwo(int x, int y){

        while(x <= y){

            System.out.println(x);

            x++;

        }

    }

/*-------------------------------------------------------------------------------------------------------*/

    public void printOdd(int x, int y){

        while(x <= y){

            if(x % 2 == 1)

                System.out.println(x);

            x++;

        }

    }

/*-------------------------------------------------------------------------------------------------------*/

    public void printSum(int num1, int num2){

        int sum = 0;

        while(num1 <= num2){

            sum += i;

            System.out.println("New number: " + i + "Sum: " + sum);

            num1++;

        }

    }

/*-------------------------------------------------------------------------------------------------------*/   

    public void printArray(int[] arr){

        int i=0;

        while(i < arr.length){

            System.out.println(arr[i]);

            i++;

        }

    }

/*-------------------------------------------------------------------------------------------------------*/

    public int printMaximum(int[] arr){

        int max = arr[0];

        for (int i = 1; i < arr.length; i++){

            if (max<arr[i])

                max=arr[i];

        }

        return max;

    }

/*-------------------------------------------------------------------------------------------------------*/

    public int printAverage(int[] arr){

        int avg = 0;

        for (int i = 0; i < arr.length; i++){

            avg += arr[i];

        }

        return avg / arr.length;

    }

/*-------------------------------------------------------------------------------------------------------*/

    public ArrayList<Integer> oddArray(int start, int end ){

        ArrayList<Integer> y = new ArrayList<Integer>();

        while (start <= end){

            if(start % 2 == 1)

                y.add(start);

            start++;

        }

        return y;

    }

/*-------------------------------------------------------------------------------------------------------*/

    public int greaterThanY(int[] x, int y){

        int count = 0;

        for(int i = 0; i < x.length; i++){

            if (x[i] > y)

                count++;

        }

        return count;

    }

/*-------------------------------------------------------------------------------------------------------*/

    public int[] squareArray(int[] x){

        for (int i = 0; i < x.length; i++){

            x[i] *= x[i];

        }

        return x;

    }

/*-------------------------------------------------------------------------------------------------------*/

    public int[] elimNeg(int[] x){

        for(int i = 0; i < x.length; i++){

            if(x[i] < 0)

                x[i] = 0;

        }

        return x;

    }

/*-------------------------------------------------------------------------------------------------------*/

    public ArrayList<Integer> maxminAverage(int[] x){

        ArrayList<Integer> y = new ArrayList<Integer>();

        int max = x[0];

        int min = x[0];

        int avg = 0;

        for (int i=0; i < x.length; i++){

            avg += x[i];

            if (max < x[i])

                max = x[i];

            else if (min > x[i])

                min = x[i];

        }

        y.add(max);

        y.add(min);

        y.add(avg / x.length);

        return y;

    }

/*-------------------------------------------------------------------------------------------------------*/

    public int[] shiftValues(int[] x){

        for (int i = 0; i < x.length - 1; i++){

            x[i] = x[i + 1];

        }

        x[x.length - 1] = 0;

        return x;

    }

}