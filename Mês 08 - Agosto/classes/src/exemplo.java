import java.time.LocalDate;
import java.time.Period;

public class exemplo {

    public static void main(String[] args) {
        LocalDate hoje = LocalDate.now();



        LocalDate DataNascC = LocalDate.of(2009,1,23);
        LocalDate DataNascO = LocalDate.of(2008,10,29);

        if (DataNascC.isAfter(DataNascO)){
            System.out.println("Cauan é mais novo");
        }else {
            System.out.println("Otavio é mais novo");
        }

        int idadeCauan = Period.between(DataNascC, hoje).getYears();
        System.out.println("O Cauan tem "+ idadeCauan + " Anos");
    }
}
