public class circle {
    private String color = "red";
    private double radius = 1.0;

    public circle() {
        color = "red";
        radius = 1.0;
    }
    public circle(double r) {
        color = "red";
        radius = r;
    }
    public circle (double r, String color){
        this.color=color;
        this.radius=r;
    }
    public String toString(){
        return "Circle[radius="+radius+"color="+color+"]";
    }
    public void setRadius(double newRadius){
        this.radius= newRadius;
    }
    public void setColor(String newColor){
        this.color= newColor;
    }
    public String getColor(){
        return color;
    }
    public double getRadius() {
        return radius;
    }
    public double getArea(){
        return radius*radius*Math.PI;
        }
    }