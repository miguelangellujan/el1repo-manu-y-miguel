package polimorfismos.interfaces.ejercicio3;
import polimorfismos.interfaces.ejercicio2.Movable;
import polimorfismos.interfaces.ejercicio2.MovablePoint;
public class MovableCircle implements Movable{
    private int radius;
    private MovablePoint center;
    public MovableCircle(int x, int y,int xSpeed, int ySpeed, int radius){
        MovablePoint centro= new MovablePoint(x,y,xSpeed,ySpeed);
        this.radius=radius;
        this.center=centro;}
    public String toString() {
        return center.toString() + ", radius= " + radius;}
    @Override
    public void moveUp() {
        center.moveUp();}
    @Override
    public void moveDown() {
        center.moveDown();}
    @Override
    public void moveLeft() {
        center.moveLeft();}
    @Override
    public void moveRight() {
        center.moveRight();}}