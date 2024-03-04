package classes;

public class Customer {
    private int id;
    private String name;
    private int discount;
    public Customer(int id,String name,int discount){
        this.id=id;
        this.name=name;
        this.discount=discount;}
    public int getDiscount() {return discount;}
    public String getName() {return name;}
    public int getId() {return id;}
    public void setDiscount(int discount) {this.discount = discount;}
    public String toString(){return "name"+name+"("+id+")("+discount+"%)";}}