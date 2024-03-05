package herencia.ejercicio4;

public class MovablePoint extends Point{
    private float xSpeed=0.0f;
    private float ySpeed=0.0f;
    public MovablePoint(float x,float y,float xSpeed,float ySpeed){
        super(x,y);
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;}
    public MovablePoint(float xSpeed,float ySpeed){
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;}
    public MovablePoint(){}
    public float getxSpeed() {return xSpeed;}
    public float getySpeed() {return ySpeed;}
    public void setxSpeed(float xSpeed) {this.xSpeed = xSpeed;}
    public void setySpeed(float ySpeed) {this.ySpeed = ySpeed;}
    public void setSpeed(float xSpeed,float ySpeed){
        this.setxSpeed(xSpeed);
        this.setySpeed(ySpeed);}
    public float[] getSpeed(){
        float xSpeed=this.getxSpeed();
        float ySpeed=this.getySpeed();
        float[] float2= new float[]{xSpeed,ySpeed};
            return float2;}
    public String toString (){
        return "("+getX()+","+getY()+"),speed= ("+getSpeed()+")";}
    public MovablePoint move(){
        setX(getX()+xSpeed);
        setY(getY()+ySpeed);
        return this;}}