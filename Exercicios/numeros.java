import java.util.Scanner;

public class numeros {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        byte contador = 0;
        byte acumuladorp = 0;
        byte acumuladori = 0;

        do {
        contador++;
        System.out.println("Digite o " + contador + "º número");    
        int resposta = entrada.nextInt();
        
        if (resposta % 2 == 0) {
            acumuladorp++;
        } else {
            acumuladori++;
        }
        
        } while (contador <= 9);

        System.out.println("Total de números pares: " + acumuladorp + "\nTotal de números impares: " + acumuladori);
        entrada.close();
    }
}