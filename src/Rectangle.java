public class Rectangle extends Figura{

    private double l1;
    private double l2;

    public Rectangle(double l1,double l2){
        this.l1=l1;
        this.l2=l2;
    }

    @Override
    public double area() {
        double resultado = l1*l2;
        return resultado;
    }

    @Override
    public int compareTo(Figura o) {
        int comparacion=(int)(this.area()-o.area());
        return comparacion;
    }
}
