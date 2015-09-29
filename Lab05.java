import java.util.Scanner;

public class Lab05 {

    static Scanner console = new Scanner(System.in);
    
    public static void main(String[] args) {
        String numOne;
        String numTwo;
        
        System.out.println("Enter first number ");
        numOne = console.next();
        
        System.out.println("Enter second number ");
        numTwo = console.next();
        
        int biggestLength;
        String temp = "";
        
        if (numOne.length() > numTwo.length()){
            biggestLength = numOne.length();
        }else {
            biggestLength = numTwo.length();
            temp = numOne;
            numOne = numTwo;
            numTwo = temp;
        }
        while (numTwo.length() < numOne.length())
        {
            numTwo = "0" + numTwo;
        }
        
        int[] numOneDigits = new int[numOne.length()];
        int[] numTwoDigits = new int[numOne.length()];
        
        for(int i = 0; i < numOne.length(); i++){
            numOneDigits[i] = Character.getNumericValue(numOne.charAt(i));
        }
        for(int i = 0; i < numOne.length(); i++){
            if (i < numTwo.length())
            {            
                numTwoDigits[i] = Character.getNumericValue(numTwo.charAt(i));
            }
        }
        sum(numOneDigits, numTwoDigits, biggestLength);
    }
    public static void sum(int[] numOneDigits, int [] numTwoDigits, int biggestLength) {
        int remainder = 0;
        int [] sumDigits = new int[biggestLength];
        int sum;

        for (int i = numTwoDigits.length - 1; i >= 0; i--)
        {
            sum = numOneDigits[i] + numTwoDigits[i] + remainder;
            sumDigits[i] = sum % 10;
            remainder = (sum - sumDigits[i]) / 10;
        }
        if (remainder > 0)
        {
            System.out.print(remainder);
        }
        for (int i = 0; i < sumDigits.length; i++)
        {
            System.out.print(sumDigits[i]);
        }
        System.out.println();
    }
}
