/*Write a method called printNumberInWord. The method has one parameter number which is the whole number. The method needs to print "ZERO", "ONE", "TWO", ... "NINE", "OTHER" if the int parameter number is 0, 1, 2, .... 9 or other for any other number including negative numbers. You can use if-else statement or switch statement whatever is easier for you.


NOTE: Method printNumberInWord needs to be public static for now, we are only using static methods.

NOTE: Do not add main method to solution code.*/public class NumberInWord {
    public static void printNumberInWord(int number) {
        String num;
        switch (number) {
            case 0:
                num="ZERO";
                break;
            case 1:
                num="ONE";
                break;
            case 2:
                num="TWO";
                break;
            case 3:
                num="THREE";
                break;
            case 4:
                num="FOUR";
                break;
            case 5:
                num="FIVE";
                break;
            case 6:
                num="SIX";
                break;
            case 7:
                num="SEVEN";
                break;
            case 8:
                num="EIGHT";
                break;
            case 9:
                num="NINE";
                break;
            default:
                num="OTHER";
        }
        System.out.println(num);
    }
}