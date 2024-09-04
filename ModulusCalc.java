/**
 * Indicate your first and last name along with a description of this class
 */
//Connor Wing
//class calculates modulus based on hardcoded values


public class ModulusCalc {
    public static void main(String args[]){
        int number = 1234;
        int mod = 103;

        double iterator = Math.floor(number/mod);
        int iter = (int)iterator;
        int result = number;

        for (int i = 0; i < iter; i++){
            result = result - mod;
        }

        System.out.println("Mod is: "+result);
        /**
         * Implement your algorithm for calculating the modulus of any number 
         * without using the modulus operator.  For the above numbers, the result 
         * should be 101.  Test your algorithm against other values too! 
         */
    }
}
