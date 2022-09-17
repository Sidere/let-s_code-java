import jdk.swing.interop.SwingInterOpUtils;

public class exercicio2 {
    public static void main(String[] args) {

        int nota = 80;
        String tipo = "";

        // A 80 b 70 c 60 d 0
        if (nota >= 80){
            tipo = "A";
        } else if (nota <= 80 && nota >= 70){
            tipo = "B";
        } else if (nota <= 70 && nota >= 60){
            tipo = "C";
        } else if (nota <= 60 && nota >= 0){
            tipo = "D";
        } else {
            System.out.println("Nota inválida");
        }

        switch (tipo){
            case "A":
            case "B":
                System.out.println("Aluno Aprovado");
                break;
            case "C":
            case "D":
                System.out.println("Aluno Reprovado");
                break;
            default:
                System.out.println("Tipo inválido");
        }

    }
}
