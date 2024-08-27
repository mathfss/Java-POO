public class Carro {

    int velocidade;
    String cor;
    String modelo;
    String marca;

    Motor motor1 = new Motor();
    Carro(){}

    Carro(String cor, String modelo){
        this.cor = cor;
        this.modelo = modelo;
        this.velocidade = 0;
        this.motor = new Motor(10, 10);
    }

    public void acelerar(int velocidade){
        this.velocidade += velocidade;
    }

    public void freiar(){

    }

    public void ligarFarois(){

    }

    public void virar(){

    }

}
