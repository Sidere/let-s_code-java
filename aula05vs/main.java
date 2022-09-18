public class Main {
    public static void main(String[] args) {
        String nome = "Sidere";
        
        System.out.println(nome.toUpperCase()); //letras maiusculas
        System.out.println(nome.toLowerCase()); // letras minusculas
        System.out.println(nome.length()); //tamanho da palavra

        String nomeOutro = "sidere";
        System.out.println(nomeOutro.equals(nomeOutro)); //comparação de strings
        System.out.println(nomeOutro.equalsIgnoreCase(nomeOutro)); /*comparação de strings 
        ignorando diferanças maisculas e minusculas*/
        
    }
}