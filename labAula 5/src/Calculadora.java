import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Calculadora {
    private static float pi = 3.14f;

    public static void circunferencia(double raio)
    {
        DecimalFormat df = new DecimalFormat("0.00");
        df.setRoundingMode(RoundingMode.HALF_UP);
        System.out.print("Área da circunferencia = ");
        System.out.println(df.format(pi*raio));
    }

    public static void volumeEsfera (double raio)
    {
        DecimalFormat df = new DecimalFormat("0.00");
        df.setRoundingMode(RoundingMode.HALF_UP);
        System.out.print("Volume da esfera = ");
        System.out.println(df.format((4 / 3) * pi * Math.pow(raio, 3)));
    }

    public static void volumeCilindro (double raio, double altura)
    {
        DecimalFormat df = new DecimalFormat("0.00");
        df.setRoundingMode(RoundingMode.HALF_UP);
        System.out.print("Volume do cilindro = ");
        System.out.println(df.format(pi*Math.pow(raio,2)*altura));
    }
}
