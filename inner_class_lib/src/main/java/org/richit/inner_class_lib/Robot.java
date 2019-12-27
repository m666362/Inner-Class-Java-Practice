package org.richit.inner_class_lib;

public class Robot {

    private static int value;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    private class Brain{
        public void processor(){
            System.out.println("This is processor method of Brain class of Robot " + value);
        }
    }

    public static class Battery{
        public void remainingCharge(){
            System.out.println("Battery has 50% charge");
        }
    }

    public void start(){
        Brain brain = new Brain(); // as Brain is private, so to access it from other class this method should be used
        brain.processor();
        final String name = "Robert";
        class Temp{
            public void doSomething(){
                System.out.println("This is Class: Robot, Method: start(), class: Temp");
                System.out.println("Id is : " + value);
                System.out.println("Name is : " + name);
            }
        }
        Temp temp = new Temp();
        temp.doSomething();
    }
}
