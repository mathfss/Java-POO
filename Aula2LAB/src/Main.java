public class Main{

    public static void main(String[] args) {

        Carro carro1 = new Carro("laranja", "ferrari");
        //carro1.modelo = "toyota";
        carro1.velocidade = 50;
        carro1.acelerar(100);
        System.out.println(carro1.modelo);
        System.out.println(carro1.cor);

        System.out.println(carro1.motor1);

    }
}