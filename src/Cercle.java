public class Cercle extends Figura{

    private double r;
    public Cercle(double r){
        this.r = r;
    }

    @Override
    public double area() {
        double resultado = Math.PI * Math.pow(r,2);
        return resultado;
    }

    @Override
    public int compareTo(Figura o) {
        int comparacion = (int)(this.area()-o.area());
        return comparacion;
    }
}
