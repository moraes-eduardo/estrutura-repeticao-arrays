import java.util.Scanner;

public class Ex8_Consoantes{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        String[] consoantes = new String[6];
        int count = 0;
        int qtdeConsoantes = 0;
        
        do {
            System.out.println("Letra: ");
            String letra = sc.next();
            
            if (!(letra.equalsIgnoreCase("a") ||
            letra.equalsIgnoreCase("e") ||
            letra.equalsIgnoreCase("i") ||
            letra.equalsIgnoreCase("o") ||
            letra.equalsIgnoreCase("u"))){
                consoantes[count] = letra;
                    qtdeConsoantes++;
                }
            count++;

        } while(count < consoantes.length);

        System.out.println("Consoantes digitadas: ");
        for (String consoante : consoantes) {
            if (consoante != null){
                System.out.println(consoante + " ");                
            }
        }
        
        sc.close();
    }
}