public class Main
{
    public static void main(String[] args)
    {
        // Hardcoded integer to examine
        int numToExamine = 2;

        // Determine if the number is odd or even using modulo
        if (numToExamine % 2 == 0) {
            System.out.println(numToExamine + " is Even.");
        } else {
            System.out.println(numToExamine + " is Odd.");
        }
    }
}
