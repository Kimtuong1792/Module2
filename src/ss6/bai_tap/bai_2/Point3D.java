package ss6.bai_tap.bai_2;

import java.util.Arrays;

public class Point3D extends Point2D {
    private float z;

    public Point3D() {
    }

    public Point3D(float z) {
        this.z = z;
    }

    public Point3D(float z, float x, float y) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z) {
        setXY(x, y);
        this.z = z;
    }

    public float[] getXYZ() {
        float[] arrXYZ = new float[3];
        arrXYZ[0] = super.getX();
        arrXYZ[1] = super.getY();
        arrXYZ[2] = this.z;
        return arrXYZ;
    }

    @Override
    public String toString() {
        return "Point3D : " + '\n' +
                "z = " + z + '\n' +
                "x = " + getX() + '\n' +
                "y = " + getY() + '\n' +
                " arrXYZ =  " + Arrays.toString(getXYZ());
    }
}
