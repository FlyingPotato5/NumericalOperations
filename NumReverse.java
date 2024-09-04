/**
 * Indicate your first and last name along with a description of this class
 */
//Connor Wing
//reverse's the order of digits in a number

//least elegant way to accomplish this
public class NumReverse {
    public static void main(String args[]){
        /*
         * Implement your number reversal algorithm below
         * Your code should work for any 4 digit integer.  
         * When your code is ran the original and the 
         * reversed number should print to the console.  
         */
        int num = 1234;
        int reversenum = 0;

        int[] numberList = new int[new Integer(num).toString().length()];


        for (int i = 0; i < numberList.length; i++){
            int place = num % 10;
            numberList[i] = place;
            double num1 = num/10;
            int num2 = (int)num1;

            num = num2;
        }


        for (int i = 0; i < numberList.length; i++){
            int offset = 1;
            for (int i2 = 0; i2 < i; i2++){
                offset = offset*10;
            }
            reversenum += numberList[numberList.length - i -1]*(offset);
        }
        System.out.println(reversenum);
    }
}
