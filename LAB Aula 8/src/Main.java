public class Main {
    public static void main(String[] args) {

        Aluno aluno = new Aluno(1, 1234);
        Professor professor = new Professor(2, 4321, 40);
        Estagiario estagiario = new Estagiario(3, 5678, 60);


        aluno.logar();
        professor.logar();
        estagiario.logar();

        System.out.println(professor.calculaSalario());
        System.out.println(estagiario.calculaSalario());


        }
    }