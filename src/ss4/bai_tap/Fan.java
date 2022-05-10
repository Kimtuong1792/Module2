package ss4.bai_tap;

public class Fan {
    public static class Fan1 {
        private final int SLOW = 1;
        private final int MEDIUM = 2;
        private final int FAST = 3;
        private int speed;
        private boolean on;
        private double radius;
        private String color;

        public Fan1() {
        }

        public Fan1(int speed, boolean on, double radius, String color) {
            this.speed = speed;
            this.on = on;
            this.radius = radius;
            this.color = color;
        }

        public int getSLOW() {
            return 1;
        }

        public int getMEDIUM() {

            return 2;
        }

        public int getFAST() {
            return 3;
        }

        public int getSpeed() {
            return speed;
        }

        public void setSpeed(int speed) {
            this.speed = speed;
        }

        public boolean isOn() {
            return on;
        }

        public void setOn(boolean on) {
            this.on = on;
        }

        public double getRadius() {
            return radius;
        }

        public void setRadius(double radius) {
            this.radius = radius;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public String toString() {
            if (isOn()) {
                return "fan is on " + "tốc độ: " + getSpeed() + " màu: " + getColor() + " và bán kính: " + getRadius();
            } else {
                return "fan is off " + " màu" + getColor() + " và bán kính " + getRadius();
            }

        }
    }


}
