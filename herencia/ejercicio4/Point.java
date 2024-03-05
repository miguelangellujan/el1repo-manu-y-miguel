package herencia.ejercicio4;
public class Point {
    private float x=0.0f;
    private float y=0.0f;
    public Point(){}
    public Point (float x,float y){
        this.x=x;
        this.y=y;}
    public float getX() {return x;}
    public void setX(float x) {this.x = x;}
    public float getY() {return y;}
    public void setY(float y) {this.y = y;}
    public void setXY(float x,float y){
        this.setX(x);
        this.setY(y);}
    public float[] getXY(){
    float x=this.getX();
    float y=this.getX();
    float[] float2= new float[]{x,y};
    return float2;}
    public String toString (){
        return "("+getX()+","+getY()+")";}}