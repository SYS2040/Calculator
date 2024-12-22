public class Main {

    public static void main(String[] args) {

        System.out.println("Welcome to main from multi");
        int number1 = 5 ;
        int number2 = 7 ;
        summation(number1, number2);
        division(number1, number2);

    }
    static void summation(int number1, int number2) {
        System.out.println("Welcome to summation from multi");
        System.out.println(number1 + number2);
    }
    static void division(int number1, int number2) {
        System.out.println("Welcome to Division from multi");
        System.out.println(number1 / number2);
    }


}
