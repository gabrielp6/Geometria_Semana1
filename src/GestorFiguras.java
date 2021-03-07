import java.util.Arrays;

public class GestorFiguras {

    public static double suma(Figura[] figuras){
        double suma=0;
        for(Figura figura : figuras){
            suma = suma + figura.area();
        }
        return suma;
    }

    public static void sort(Figura[] figuras){

        Arrays.sort(figuras);
        System.out.println(Arrays.asList(figuras));
    }


    public static void main(String[] args){

        Figura[] figuras = new Figura[3];

        double radio = 20;
        Cercle cercle = new Cercle(radio);
        figuras[0] = cercle;

        double lado1=2;
        double lado2=3;
        Rectangle rectangle=new Rectangle(lado1,lado2);
        figuras[1]=rectangle;

        double base = 4;
        double altura = 1.5;
        TriangleEQ triangleEQ = new TriangleEQ(base, altura);
        figuras[2]=triangleEQ;

        double ResultSuma = suma(figuras);
        System.out.println(ResultSuma);

        System.out.println(Arrays.asList(figuras));
        sort(figuras);

    }

}
