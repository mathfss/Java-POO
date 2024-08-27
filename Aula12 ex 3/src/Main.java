import java.util.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        int nValores = 100000;
        long tInicial;
        long tFinal;

        List<Integer> lista = new ArrayList<Integer>();
        Set<Integer> conjunto = new HashSet<Integer>();
        Map<Integer, Integer> mapa = new HashMap<Integer, Integer>();

        tInicial = System.currentTimeMillis();
        for (int i = 0; i < nValores; i++) {
            lista.add(i);
        }
        tFinal = System.currentTimeMillis();
        System.out.println("Tempo Lista: " + (tFinal - tInicial));

        tInicial = System.currentTimeMillis();
        for (int i = 0; i < nValores; i++) {
            conjunto.add(i);
        }
        tFinal = System.currentTimeMillis();
        System.out.println("Tempo Conjunto: " + (tFinal - tInicial));

        tInicial = System.currentTimeMillis();
        for (int i = 0; i < nValores; i++) {
            mapa.put(i, i);
        }
        tFinal = System.currentTimeMillis();
        System.out.println("Tempo Mapa: " + (tFinal - tInicial));

        tInicial = System.currentTimeMillis();
        for (int i = 0; i < nValores; i++) {
            lista.contains(i);
        }
        tFinal = System.currentTimeMillis();
        System.out.println("Tempo Busca Lista: " + (tFinal - tInicial));

        tInicial = System.currentTimeMillis();
        for (int i = 0; i < nValores; i++) {
            conjunto.contains(i);
        }
        tFinal = System.currentTimeMillis();
        System.out.println("Tempo Busca Conjunto: " + (tFinal - tInicial));

        tInicial = System.currentTimeMillis();
        for (int i = 0; i < nValores; i++) {
            mapa.get(i);
        }
        tFinal = System.currentTimeMillis();
        System.out.println("Tempo Busca Mapa: " + (tFinal - tInicial));
    }
}