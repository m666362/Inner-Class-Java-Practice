package org.richit.inner_class_lib;


public class MyClass {

    static String dot = "----------------";
    private static void startProgramme() {
        String start = "Programme started";
        System.out.println("");
        System.out.println(dot+start+dot);
        System.out.println("");
    }
    public static void endProgramme(){

        String end = "Programme ended";
        System.out.println("");
        System.out.println(dot+end+dot);
        System.out.println();
    }

    public static void main(String[] args) {

        startProgramme();

        setInt();
        innerClass();

        endProgramme();
    }

    public static void innerClass() {
        System.out.println(dot + "innerClass" + dot + "\n");
        Robot.Battery battery = new Robot.Battery(); //Battery can access because it is static. doubt occoured in qs
        battery.remainingCharge();
    }

    private static void setInt() {

        System.out.println(dot + "setInt" + dot + "\n");
        Robot robot = new Robot(); //qs: How can I declare robot though Robot is not static class?
        robot.setValue( 7 );
        System.out.println("This is Robot no. "+robot.getValue());
        robot.start();
        System.out.println();
    }
}
