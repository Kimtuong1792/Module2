package ss6.bai_tap.bai_3;

import java.util.Arrays;

public class Point {
    private float x = 0.0f;
    private float y = 0.0f;

    public Point() {
    }

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float[] getXY() {
        float[] arr1 = new float[2];
        arr1[0] = getX();
        arr1[1] = getY();

        return arr1;
    }

    @Override
    public String toString() {
        return "Point " + '\n'+
                "x=" + x + '\n'+
                "y=" + y + '\n'+
                "getXY = " + Arrays.toString(getXY());
    }
}
