public class Main {
    public static void main(String[] args) {

        boolean fimDeSemana = true;
        boolean fazendoSol = true;
        boolean vamosAPraia = fimDeSemana && fazendoSol;
        System.out.println(vamosAPraia);

        //tabela verdade
        // operador && (AND)
        // true && true = true
        // true && false = false
        // false && true = false
        // false && false = false

        //operador || (OR)
        // true || true = true
        // true || false = true
        // false || true = true
        // false || false = false

        String mensagem = fimDeSemana ? "é fim de semana" : "Não é fim de semana";
        System.out.println(mensagem);

        //importante uso de tenários <3
    }
}