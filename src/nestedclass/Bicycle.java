package nestedclass;

public class Bicycle {
    private int maxSpeed = 40;

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public class Wheel {
        public void slowDown() {
            maxSpeed *= 0.5;
            System.out.println("Wheel's max speed is now: " + maxSpeed);
        }

    }

    public static class StaticInnerClass {
        public void doNothing() {
            System.out.println("I am a static inner class (nested class)");
        }
    }
}
