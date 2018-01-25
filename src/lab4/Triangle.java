package lab4;
import static java.lang.Math.*;

abstract class Triangle {
    private double cathetus_1;
    private double cathetus_2;
    private double hypotenuse;

    public Triangle (){
    }

    public Triangle(double cathetus_1, double cathetus_2, double hypotenuse){
        this.cathetus_1 = cathetus_1;
        this.cathetus_2 = cathetus_2;
        this.hypotenuse = hypotenuse;
    }

    public void setCathetus_1(double cathetus_1) {
        this.cathetus_1 = cathetus_1;
    }

    public void setCathetus_2(double cathetus_2) {
        this.cathetus_2 = cathetus_2;
    }

    public void setHypotenuse(double hypotenuse) {
        this.hypotenuse = hypotenuse;
    }

    public double getCathetus_1() {
        return cathetus_1;
    }

    public double getCathetus_2() {
        return cathetus_2;
    }

    public double getHypotenuse() {
        return hypotenuse;
    }

    abstract public double area();
    abstract public double perimeter();
    abstract public String show();
}
