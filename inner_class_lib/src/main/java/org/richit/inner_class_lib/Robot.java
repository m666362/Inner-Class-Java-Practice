package org.richit.inner_class_lib;

public class Robot {

    public static int value;

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
        Brain brain = new Brain();
        brain.processor();
    }
}
