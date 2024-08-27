public class Computador {

    String marca;
    float preco;
    HardwareBasico [] hardwareBasico;

    {
        hardwareBasico = new HardwareBasico[50];
    }

    SistemaOperacional sistemaOperacional = new SistemaOperacional();
    public void mostraPCConfigs(){

        System.out.print("Marca: ");
        System.out.println(this.marca);
        System.out.print("Preco: ");
        System.out.println(this.preco);
        System.out.println("Hardwares Basicos: ");
        System.out.print(this.hardwareBasico[0].nome + " ");
        System.out.println(this.hardwareBasico[0].capacidade);
        System.out.print(this.hardwareBasico[1].nome + " ");
        System.out.println(this.hardwareBasico[1].capacidade);
        System.out.print(this.hardwareBasico[2].nome + " ");
        System.out.println(this.hardwareBasico[2].capacidade);
        System.out.print("Sistema Operacional: ");
        System.out.print(this.sistemaOperacional.nome + " ");
        System.out.println(this.sistemaOperacional.tipo);
    }

    public void addMemoriaUSB(MemoriaUSB musb){

    }
}
