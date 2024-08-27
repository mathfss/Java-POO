public abstract class Usuario {

    private int id;
    private int senha;

    protected Usuario(int id, int senha) {
        this.id = id;
        this.senha = senha;
    }

    public void logar(){
        System.out.println(id);
        System.out.println(senha);
    }
}
