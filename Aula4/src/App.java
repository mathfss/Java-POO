public class App {

    public static void main(String[] args) {

        Conta contaChris = new Conta();
        Conta contaAnna = new Conta();
        Conta conta3 = new Conta();

        contaChris.limite = 10;
        contaChris.nomeTitular = "Chris";
        contaChris.numero = 1234;
        contaChris.saldo = 100;

        contaAnna.saldo = 10000;
        contaAnna.numero = 5678;
        contaAnna.nomeTitular = "Anna";
        contaAnna.limite = 100000;

    }


}
