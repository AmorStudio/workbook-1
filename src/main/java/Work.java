public class Work {

    public static void main (String[] args) {
        //printf() * an optional method to control, format and display text to the console window
        //           two arguments = format string + (object/variable/value)
        //           % [flags] [precision] [width] [conversion-character]
        boolean myBoolean = true;
        char myChar = '@';
        String myString = "Bro";
        int myInt = 50;
        double myDouble = 1000;

        //conversion character
        // to copy & paste use ctrl D
        /* System.out.printf("%b ",myBoolean);
        System.out.printf("%c ",myChar);
        System.out.printf("%s ",myString);
        System.out.printf("%d ",myInt);
        System.out.printf("%f ", myDouble); */

        /* System.out.printf("%b ",myBoolean);
        System.out.printf("%c ",myChar);
        System.out.printf("%s ",myString);
        System.out.printf("%d ",myInt);
        System.out.printf("%f ", myDouble); */





        //[width]
        //minimum number of characters to be written as output
        System.out.printf("Hello %-10s", myString);

        //[precision]
        // sets number of digits of precision when outputting floating-point values
        System.out.printf("You have this much money %,f", myDouble);

        //[flags]
        // adds an effect to output based on the flag added to format specifier
        // - : left-justify
        // + : output a plus ( + ) or minus ( - ) sign for a numeric value
        // 0 : numeric values are zero-padded
        // , : comma grouping separator if numbers > 1000

        //System.out.printf("You have this much money %020f", myDouble);

        /*
        Getting started with Git
        Fundamentals of git
        Version control system

        control project with alot of files

        to track changes to any file based project

        What is Git?

       Software design
       who or why a chang was made
       keep track of different controls
       Manage data


       1. committed
       safely stored in database
       2. modified
       make changes introduced new changes
       3. staged aka commit 2.0
       next commit snapshot

       A file can also be untracked

       File reside in 3 different states

       .git directory aka Repository
       -commited and recorded

       working directory aka checkout


       index aka staging
       - build change and set up change
       - freedom to modify

       add git to project to manage



gitignore
- dont want version controlled by git
- add a license ( real project )

Secure shell (ssh)

private from the public
fixed security problems

ssshhhhh

Computers talk to each other through networks
telnet created ssh

Example: sending a letter to your neighbor in a brief case and putting a lock on it since ur neighbor doesnt
have your key he'll put his own lock on it and send it back to u expecting for u to take ur lock off.

read throughly


git init creates a repo and helps keep track of any changes made in that repo

git add files or entire folder

git diff view the changes made to a file

touch

git reset undo changes

git merge a "tree" branch  into an active branch

git push upload content from local repo like inteliji to github

git pull fetch and download content from github

http global

https secured global
encryption algorithms
locked keys
hackers cant crack the encryption


git push to  github

create a read.me file
vs gitignore



























         */











    }
}
