//NOTES FROM LECTURE: INTRO TO JAVA
//ADAPTED FROM LIONEL BEATO'S NOTES, 1/22/21, techTalentSouth, fullStackJavaDev

//ALWAYS ASSIGN THE PROJECT TO A PACKAGE
//HERE, WE CHANGED THE DEFAULT OF .company TO .tts
package com.tts;

//ALWAYS INCLUDE COMMENTS WITH YOUR CODE!!!
//'PUBLIC' IS AN *ACCESS MODIFIER* THAT DETERMINES DATA ACCESS
//'PRIVATE' IS ANOTHER *ACCESS MODIFIER*

//EVERYTHING IN JAVA IS IN A *CLASS*
//CLASSES CAN ALSO BE THOUGHT OF AS PROGRAMMER-DEFINED TYPES
//BELOW IS A *CLASS*, WHICH IS THE "BLUEPRINT" FOR OBJECTS IN JAVA:

public class Main {

    //VARIABLES CAN BE DECLARED ON THE SAME LINE:

    private int x, y, z;
    //BUT ON SAME LINE IS NOT BEST PRACTICE

        private static class Inner {
            public void printStatement() {
                System.out.println("Hello from an inner class!");
            }
        }

    //BELOW IS A PRIVATE VARIABLE! OTHER CLASSES CAN'T ACCESS IT:
    private int x 4;

    //IF STHG IS "STATIC," (THINK: IT "STATIC CLINGS" TO THE CLASS!)
    //STATIC MEANS YOU CAN CALL THIS DATA DIRECTLY FROM THE CLASS, SO YOU DONT HAVE TO CREATE AN INSTANCE

    private static int myInt = 4;

    //THE SYNTAX FOR VARIABLES IS AS FOLLOWS:
    //accessmod type variableName/reference = value;
    //NOTE THAT camelCase IS USED FOR EVERYTHING EXCEPT CLASSES (STRING IS A CLASS,) WHICH USE PascalCase

    public int myOtherInt = 5;
    public float myFloat;
    public double myDouble;
    public long myLong;
    public String myString;
    public boolean myBool;
    public char myChar;
    public byte myByte;

    //BELOW IS A MAIN METHOD
    //THIS SERVES AS AN *ENTRY POINT*
    //THE INTERPRETER WILL LOOK FOR THIS METHOD TO HAVE ACCESS TO THE PROGRAM
    //"void" IS THE *RETURN TYPE*
    //"void" MEANS THAT THIS MESSAGE DOES NOT RETURN ANYTHING MEANINGFUL
    //BUT NOTE THAT "VOID" DOES RETURN VOID AS A "THING"
    //(VOID IS A THING THAT REPRESENTS THE ABSENCE OF A THING?)

    public static void main(String[] args) {

        //THE VARIABLE BELOW DOES NOT HAVE AN ACCESS MODIFIER (PUBLIC/ PRIVATE)
        //IT IS ALREADY PUBLIC BECUZ IT IS INSIDE OF THE MAIN METHOD
        //STRICTLY SPEAKING, METHODS ARE FUNCTIONS THAT LIVE ON OBJECTS
        //THIS METHOD IS SIMILAR TO CONSOLE.LOG IN JAVASCRIPT

	System.out.println("Hello world");

	//TYPING "sout" WILL AUTOCOMPLETE A "System out" MESSAGE
        System.out.println();

        //BELOW IS A PRACTICE KNOWN AS CONCATENATION
        //IT ALLOWS YOU TO INTERPRET THE VALUES AND MULTIPLE STRINGS
        System.out.println("Here is the value of myInt " + myInt);

        //TO CREATE AN INSTANCE:
        // Main() IS CALLING THE *CONSTRUCTOR*, WHICH GIVES US A NEW *INSTANCE*
        //IN JAVA WE MUST BE EXPLICIT
        Main myMain = new Main();
        System.out.println(myMain.myOtherInt);

        // \n IS AN EXPRESSION FOR "new line"
        //IT IS KNOWN AS AN ESCAPE CHARACTER
        System.out.print("I am in a simply print method");
        System.out.print("I am in a simply print method\n");

        //"printf" IS SIMILAR TO TEMPLATE LITERALS IN JS "${}"
        //IT ALLOWS YOU TO BE MORE EXPRESSIVE, AND NEATER WITH YOUR PRINT OUTS

        System.out.printf("I am in a formatted print method\n");
        System.out.printf("I am in a formatted print method " + "and here is the value of myInt:%d\n%d %d %d %d %d", myInt, 1, 2, 3, 4, 5);

    //        Inner myInner = new Inner();
    //        myInner.printStatement();
    }
}

//SAME DAY, PART II:

import java.util.*;

public class Second {

        public static void main(String[] args) {

            //IN ORDER TO USE A *SCANNER*, YOU NEED TO CONSTRUCT AN *INSTANCE*
            //THIS INSTANCE ACCEPTS A VARIABLE REFERRED TO AS System.in

//            Scanner input = new Scanner(System.in);
//            System.out.println("Input your first name:");
//            String myName = input.nextLine();

            //System.out.printf("Here is your name: %s", myName);
            //
            //input.close();

//*PRIMITIVES* ARE PIECES OF DATA AND VALUES THAT CANNOT BE ALTERED/ REDEFINED
//PRIMITIVES CAN BE THOUGHT OF AS "ATOMIC"
//IN THE FOLLOWING EXAMPLE, "int" WOULD BE THE PRIMITIVE
//WITHIN INTELLIJ, PRIMITIVES WILL BE A DIFFERENT COLOR THAN *REFERENCES*
int myInt = 4;

//*REFERENCES* ARE THE INVERSE OF PRIMITIVES IN A LOT OF WAYS
//THEY ARE A COLLECTION OF VALUES AND DATA THAT CAN BE REFERRED TO AS ONE "THING"
//INTEGER IS IMPLEMENTED AS CLASS WITH FIELDS AND METHODS AND VALUES
Integer myOtherInt = 5;

//NOTE THAT CHAR LITERALS ARE GOING TO BE INTERPRETED BY SINGLE QUOTES
char myChar = 'L';

//
long myLong = 200L;
int bigInt = 2147483647;
System.out.pintln(bigInt);

    }
}




