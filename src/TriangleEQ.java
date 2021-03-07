public class TriangleEQ extends Figura{

    private double b;
    private double h;

    public TriangleEQ(double b, double h){
        this.h=h;
        this.b=b;
    }

    @Override
    public double area() {
        double resultado = (b*h/2);
        return resultado;
    }

    @Override
    public int compareTo(Figura o) {
        int comparacion = (int)(this.area()-o.area());
        return comparacion;
    }
}
