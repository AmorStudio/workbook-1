public class Work {

    public static void main (String[] args) {
        //printf() * an optional method to control, format and display text to the console window
        //           two arguments = format string + (object/variable/value)
        //           % [flags] [precision] [width] [conversion-character]


        String myString = "Bro";

        double myDouble = 1000;







        //[width]
        //minimum number of characters to be written as output
        System.out.printf("Hello %-10s", myString);

        //[precision]
        // sets number of digits of precision when outputting floating-point values
        System.out.printf("You have this much money %,f", myDouble);







































    }
}
