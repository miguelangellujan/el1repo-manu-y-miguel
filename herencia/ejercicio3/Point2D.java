package herencia.ejercicio3;
public class Point2D {
    private float x=0.0f;
    private float y=0.0f;
    public Point2D() {}
    public Point2D(float x,float y){
        this.x=x;
        this.y=y;}
    public void setY(float y) {
        this.y = y;
    }
    public void setX(float x) {
        this.x = x;
    }
    public float getY() {return y;}
    public float getX() {
        return x;
    }
    public void setXY(float x, float y){
        this.x=x;
        this.y=y;}
    public float[] getXY(){
        float[] array = {x,y};
        return array;}
    public String toString(){return "("+x+","+y+")";}}