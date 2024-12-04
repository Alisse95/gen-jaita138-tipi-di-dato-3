import java.time.LocalDate;
import java.util.Scanner;

public class fornitore {
    public static void main(String[] args) throws Exception {

        boolean cont = true; //variabile per chiedere all'utente se vuole continuare
        Scanner sc = new Scanner(System.in);
        while (cont) {

            System.out.println("Esaminiamo i fornitori del nostro negozio");

            System.out.println("Nome del fornitore:");
            String nome = sc.nextLine();

            System.out.println("Categoria:");
            System.out.println("0 - PIANTE");
            System.out.println("1 - VASELLAME");
            System.out.println("2 - CONCIME");
            System.out.println("3 - GIARDINAGGIO");
            byte catNum = sc.nextByte();
            CategoriaLista Categoria = CategoriaLista.values()[catNum];

            System.out.println("P.iva:");
            String piva = sc.nextLine();

            System.out.println("Luogo:");
            String Luogo = sc.nextLine();

            System.out.println("Telefono:");
            String telefono = sc.nextLine();

            System.out.println("email:");
            String email = sc.nextLine();
            
            System.out.println("linguaPrincipale:");
            String linguaPrincipale = sc.nextLine();

            System.out.println("Iban:");
            String Iban = sc.nextLine();

            System.out.println("Nome referente:");
            String NomeReferente = sc.nextLine();

            System.out.println("note:");
            String  note = sc.nextLine();


            System.out.println("");
            System.out.println("--------------------------------------");
            System.out.println("");
            System.out.println("Ecco con le informazioni del fornitore");

            System.out.println("Nome del fornitore: " + nome);
            System.out.println("Categoria: " + Categoria);
            System.out.println("P.iva: " + piva);
            System.out.println("Luogo': " + Luogo);
            System.out.println("Telefono: " + telefono);

            System.out.println("email: " + email);
            System.out.println("linguaPrincipale: " + linguaPrincipale);
            System.out.println("Iban: " + Iban);
            System.out.println("Nome referente: " + NomeReferente);
            System.out.println("note: " + note);
            
            System.out.println("");

            System.out.println("Vuoi continuare a ottenere altre info riguardanti i tuoi fornitori (true/false):");
            cont = sc.nextBoolean();
            sc.nextLine();
        }

        sc.close();
        System.out.println("Ciao, grazie per averci utilizzato");
    }
}