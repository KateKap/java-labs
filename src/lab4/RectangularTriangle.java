package lab4;

public class RectangularTriangle extends Triangle {

    public  RectangularTriangle(){
        super();
    }

    public RectangularTriangle(double cathetus_1, double cathetus_2, double hypotenuse){
        super(cathetus_1, cathetus_2, hypotenuse);
    }

    public boolean is_a_rectangular_triangle (){
        if((Math.pow(super.getCathetus_1(),2)+Math.pow(super.getCathetus_2(),2)) == Math.pow(super.getHypotenuse(),2))
                return true;
        else
                return false;
    }

    @Override
    public double perimeter(){
        return super.getCathetus_1()+super.getCathetus_2()+super.getHypotenuse();
    }

    @Override
    public String show() {
        return "Cathetus_1: " + super.getCathetus_1() +
                "\nCathetus_2: " + super.getCathetus_2() +
                "\nHypotenuse: " + super.getHypotenuse() + "\n";
    }

    @Override
    public double area() {
        return 0.5 * super.getCathetus_1() * super.getCathetus_2();
    }
}
