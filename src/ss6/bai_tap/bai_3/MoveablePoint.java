package ss6.bai_tap.bai_3;

public class MoveablePoint extends Point {
    private float xSpeed;
    private float ySpeed;

    public MoveablePoint() {
    }

    public MoveablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MoveablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getXSpeed() {
        return xSpeed;
    }

    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getYSpeed() {
        return ySpeed;
    }

    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    public void setSpeed(float xSpeed,float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public float[] getSpeed(){
        float[] arrSpeed = new float[2];
        arrSpeed[0] = this.getXSpeed();
        arrSpeed[1] = this.getYSpeed();
        return arrSpeed;
    }

    @Override
    public String toString() {
        return "MoveablePoint : " +'\n'+
                "xSpeed=" + xSpeed +'\n'+
                "ySpeed=" + ySpeed + '\n'+
                "and which is a subclass of "
                + super.toString()+
                '}';
    }
    public MoveablePoint move(){
        setX(this.getX() + this.xSpeed);
        setY(this.getY() + this.xSpeed);
        return this;

    }
}
