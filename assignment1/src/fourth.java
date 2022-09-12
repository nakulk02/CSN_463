public class fourth {
    public static void main(String[] args) throws Exception {
        int firstNumber = 18, secondNumber = 15, temp;
        System.out.println("\nFirst number: " + firstNumber);
        System.out.println("Second number: " + secondNumber);
        temp = firstNumber;
        firstNumber = secondNumber;
        secondNumber = temp;
        System.out.println("\nSwapping variable values using a third variable-");
        System.out.println("\nFirst number: " + firstNumber);
        System.out.println("Second number: " + secondNumber);
        System.out.println("\n******************************************************");
        firstNumber = 987;
        secondNumber = 54;
        System.out.println("\nFirst number: " + firstNumber);
        System.out.println("Second number: " + secondNumber);
        firstNumber += secondNumber;
        secondNumber = firstNumber - secondNumber;
        firstNumber -= secondNumber;
        System.out.println("\nSwapping variable values without using a third variable-");
        System.out.println("\nFirst number: " + firstNumber);
        System.out.println("Second number: " + secondNumber);

    }
}
