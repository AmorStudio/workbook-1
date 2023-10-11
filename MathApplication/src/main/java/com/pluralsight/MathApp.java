package com.pluralsight;

import java.util.Random;

import java.util.Scanner;

public class MathApp  {

    public static void main(String[] args) {
            int bobSalary = 3000;
            int garySalary = 7000;
            int highestSalary = Math.max(bobSalary , garySalary);
            System.out.println("HighestSalary is: $" + highestSalary);


            // part 2
        int carPrice = 2000;
        int truckPrice = 100;
        int lowestSalary = Math.min(carPrice , truckPrice);
        System.out.println("Smallest Price is: $" + lowestSalary);

       // part 3
        double radius = 7.25;
        double areaOfCircle = Math.PI * radius * radius;

        System.out.println ("Area of the circle with radius " + radius + " is: " + areaOfCircle);

        // part 4
        double n = 5.0;

        System.out.println( "Our solution after square root of n is: " + Math.sqrt(n)) ;

        /*part 5

concanate by using the plus sign
System.out.printf("Distance = &5.2f\n" , distance );
printf is looking for the formatting     double which is distance
Java math
floor celieng
d means decimal

stack trace

what are objects

print f turn strings into objects
floating point type
float or double

cpu uses addressses

public static double calculateDistanceBetween (double x2, double x1, double y2, double y)

%d - int
%f - double
%c - char
%s - String
%b - Boolean

main is a method

if u put a data type next to public static you must use return

Java math

variable double x = 3.14;
variable double y = -10;
answer double z = Math.min(x,y);
System.out.println(z);


math.min
math.max
math.abs
math.sqrt
math.sqrt
math.round 3.0
math.ceil rounds up
math.floor rounds down

static = modifier. A single copy of a variable/method is created and shared
// the class "owns" the static member

 psvm (String[] args)

print(f)
hexadecimal %x
deciamal

octal

string formatted = String.format

System.in

3 standard streams
sequence of bytes
out = write to  printstream
in = read from inputstream
allows you to read a single byte at a time
err =  printstream

re-direct that ouput to a log file

reading input with scanner
working with terminal

declared
scanner scanner;

how to intiliaze

Scanner scanner = new Scanner(System.in);

double inputValue = promptAndReturnDouble(" Please enter

scanner.nextLine(); ??
system.out.println ("Please enter a floating-point number: ");
return distance;

public static double promptAndReturnDouble(String prompt) {
double value;
System.out.print(prompt + " : ");
value = scanner.nextDouble();
return value;

recurisive
main(null);
infinite loop

the only way back to a method is return

return is called a jump statement
if (inputString. equals ("Paul"))
    System.out.println ("Go away, Paul);
    else
    system.out.println ("Hello " + inputString);





















         */


        int [] a = {5,10};
        int [] b = {85,50};
        double ans = Math.pow((b[0]-a[0]),2) + Math.pow ((b[1]-a[1]),2);
        double distance = Math.sqrt(ans);
        System.out.println("Distance is: " + distance);


        // part 6
        double GivenNumber = -3.8;
        System.out.println("Absolute value of -3.8 is: " + Math.abs(GivenNumber));

        // part 7

        Random rn = new Random();
        int answer = rn.nextInt(10) + 1;
        System.out.println (answer);

//

        int num = 42;
        double pi = 3.14159;
        String name = "Alice";
        char grade = 'A';

        String formatted = String.format("Number: %d, Pi: %f, Name: %s, Grade: %c", num, pi, name, grade);
        System.out.println(formatted);











    }
}
