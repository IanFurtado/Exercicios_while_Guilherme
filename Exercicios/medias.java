import java.util.Scanner;

public class medias {
    public static void main(String[] args) {
        int contador;
        double nota, media, acumulatidorNotas;
        contador = 0;
        acumulatidorNotas = 0;

        Scanner entrada = new Scanner(System.in);
        while (contador < 5) {
            contador++;
            System.out.println("Digite uma nota " + contador); nota = entrada.nextInt();
            acumulatidorNotas = acumulatidorNotas + nota;
        }

        media = acumulatidorNotas / contador;
        System.out.println("média: " + media);
        entrada.close();
    }
    
}