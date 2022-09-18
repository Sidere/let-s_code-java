import java.LocalDate;
import java.LocalDateTime;
import java.time.format.TextStyle;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        //Olá, "Sidere", hoje é {dia-da-semana}, bom dia!
        
        String nome = "Sidere";
        
        LocalDate hoje = LocalDate.now();
        Locale brasil = new Locale ("pt", "BR");
        System.out.println(hoje.getDayOfWeek().getDisplayName(TextStyle.FULL, brasil));
        // getDayOfWeek = dia da semana
        // getDisplayName(TextStyle.FULL, brasil) Tipo de formato do dia e tradução
        String diaDaSemana = hoje.getDayOfWeek().getDisplayName(TextStyle.FULL, brasil);
        String saudacao;
        LocalDateTime agora = LocalDateTime.now();

        if (agora.getHour() >= 0 && agora.getHour() < 12){
            saudacao = "bom dia";
        } else if (agora.getHour() >= 12 && agora.getHour() < 18){
            saudacao = "boa tarde";
        } else if (agora.getHour() >= 18 && agora.getHour() < 24){
            saudacao = "boa noite";
        } else {
            System.out.println("Olá");
        }

        System.out.printf("Olá, %s. Hoje é %s, %s. %n", nome, diaDaSemana, saudacao.toUpperCase);
    }
}