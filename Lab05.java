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
        
        if (numOne.length() > numTwo.length()){
            biggestLength = numOne.length();
        }else {
            biggestLength = numTwo.length();
        }
        
        int[] numOneDigits = new int[numOne.length()];
        int[] numTwoDigits = new int[numTwo.length()];
        
        int j = 0;
        for(int i = numOne.length() - 1; i >= 0; i--){
            numOneDigits[j] = Character.getNumericValue(numOne.charAt(i));
            j++;
        }
        j = 0;
        for(int i = 0; i < numTwo.length(); i++){
            numTwoDigits[j] = Character.getNumericValue(numTwo.charAt(i));
            j++;
        }
        sum(numOneDigits, numTwoDigits, biggestLength);
    }
    public static void sum(int[] numOneDigits, int [] numTwoDigits, int biggestLength) {
        int remainder = 0;
        int [] sumDigits = new int[biggestLength+1];
        
        for(int i = 0; i < biggestLength; i++){
            if(i + 1 > numOneDigits.length){
                sumDigits[i] = numTwoDigits[i] + remainder;
                if(numTwoDigits[i] + remainder > 9){
                    remainder = 1;
                } else{
                    remainder = 0;
                }    
            } else if (i + 1 > numTwoDigits.length) {
                sumDigits[i] = numOneDigits[i] + remainder;
                if(numOneDigits[i] + remainder > 9){
                    remainder = 1;
                } else{
                    remainder = 0;
                }    
            } else {
                if(numOneDigits[i] + numTwoDigits[i] > 9){
                    sumDigits[i] = numOneDigits[i] + numTwoDigits[i] - 10 + remainder;
                    remainder = 1;
                } else{
                    sumDigits[i] = numOneDigits[i] + numTwoDigits[i] + remainder; 
                    remainder = 0;
                }    
            }
        }
        if (remainder == 1){
            sumDigits[biggestLength] = 1;
        }else {
            sumDigits[biggestLength] = 0;    
        }
        for (int i = 0; i < sumDigits.length; i ++) {
            System.out.println(sumDigits[i]);           
        }
        String sumString = "";
        
        for (int i = sumDigits.length - 1; i >= 0; i--){
            Integer.toString()
            sumDigits[i]
                
        }
        System.out.println(sumString);
    }
}
