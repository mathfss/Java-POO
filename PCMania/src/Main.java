import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Cliente cliente = new Cliente();
        MemoriaUSB[] memoriaUSB;
        memoriaUSB = new MemoriaUSB[50];
        Computador[] PCs;
        PCs = new Computador[50];

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        cliente.nome = entrada.next();
        System.out.println("Digite seu CPF: ");
        cliente.cpf = entrada.nextLong();
        int compras = 0;

        for (int i = 0; i < PCs.length; i++) {

            PCs[i] = new Computador();
            System.out.println("Qual PC de qual promoção você deseja comprar?");
            int x = entrada.nextInt();
            if (x == 1)
            {
                PCs[i].marca = "Positivo";
                PCs[i].preco = 2300;
                PCs[i].hardwareBasico[0] = new HardwareBasico();
                PCs[i].hardwareBasico[0].nome = "Pentium Core i3";
                PCs[i].hardwareBasico[0].capacidade = 2200;
                PCs[i].hardwareBasico[1] = new HardwareBasico();
                PCs[i].hardwareBasico[1].nome = "Memória RAM";
                PCs[i].hardwareBasico[1].capacidade = 8;
                PCs[i].hardwareBasico[2] = new HardwareBasico();
                PCs[i].hardwareBasico[2].nome = "HD";
                PCs[i].hardwareBasico[2].capacidade = 500;
                PCs[i].sistemaOperacional.nome = "Linux Ubuntu";
                PCs[i].sistemaOperacional.tipo = 32;
                memoriaUSB[i] = new MemoriaUSB();
                PCs[i].addMemoriaUSB(memoriaUSB[i]);
                memoriaUSB[i].nome = "Pen-drive";
                memoriaUSB[i].capacidade = 16;
                compras = compras + 1;
            }

            else if (x == 2)
            {
                PCs[i].marca = "Acer";
                PCs[i].preco = 5800;
                PCs[i].hardwareBasico[0] = new HardwareBasico();
                PCs[i].hardwareBasico[0].nome = "Pentium Core i5";
                PCs[i].hardwareBasico[0].capacidade = 3370;
                PCs[i].hardwareBasico[1] = new HardwareBasico();
                PCs[i].hardwareBasico[1].nome = "Memória RAM";
                PCs[i].hardwareBasico[1].capacidade = 16;
                PCs[i].hardwareBasico[2] = new HardwareBasico();
                PCs[i].hardwareBasico[2].nome = "HD";
                PCs[i].hardwareBasico[2].capacidade = 1000;
                PCs[i].sistemaOperacional.nome = "Windows 8";
                PCs[i].sistemaOperacional.tipo = 64;
                memoriaUSB[i] = new MemoriaUSB();
                PCs[i].addMemoriaUSB(memoriaUSB[i]);
                memoriaUSB[i].nome = "Pen-drive";
                memoriaUSB[i].capacidade = 32;
                compras = compras + 1;
            }

            else if (x == 3)
            {
                PCs[i].marca = "Vaio";
                PCs[i].preco = 1800;
                PCs[i].hardwareBasico[0] = new HardwareBasico();
                PCs[i].hardwareBasico[0].nome = "Pentium Core i7";
                PCs[i].hardwareBasico[0].capacidade = 4500;
                PCs[i].hardwareBasico[1] = new HardwareBasico();
                PCs[i].hardwareBasico[1].nome = "Memória RAM";
                PCs[i].hardwareBasico[1].capacidade = 32;
                PCs[i].hardwareBasico[2] = new HardwareBasico();
                PCs[i].hardwareBasico[2].nome = "HD";
                PCs[i].hardwareBasico[2].capacidade = 2000;
                PCs[i].sistemaOperacional.nome = "Windows 10";
                PCs[i].sistemaOperacional.tipo = 64;
                memoriaUSB[i] = new MemoriaUSB();
                PCs[i].addMemoriaUSB(memoriaUSB[i]);
                memoriaUSB[i].nome = "HD Externo";
                memoriaUSB[i].capacidade = 1000;
                compras = compras + 1;
            }

            else if (x == 0) {
                break;
            }
        }
        System.out.print("Nome: ");
        System.out.println(cliente.nome);
        System.out.print("CPF: ");
        System.out.println(cliente.cpf);
        for (int i = 0; i < compras; i++) {
            System.out.println("PC numero: " + (i + 1));
            PCs[i].mostraPCConfigs();
        }
        System.out.print("Total da compra: ");
        cliente.computador = PCs;
        System.out.println(cliente.calculaTotalcompra());
    }
}