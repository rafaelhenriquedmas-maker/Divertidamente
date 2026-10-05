import java.util.Scanner;

public class Riley {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int alegria = 0;
        int tristeza = 0;

      
        System.out.print("Quantas novas amizades a Riley fez? ");
        int amizades = entrada.nextInt();

        if (amizades > 0) {
            alegria += amizades * 10;
        } else {
            tristeza += 30;
        }

    
        System.out.print("Digite a nota da prova A1: ");
        double a1 = entrada.nextDouble();

        System.out.print("Digite a nota da prova A2: ");
        double a2 = entrada.nextDouble();

        System.out.print("Digite a nota da prova A3: ");
        double a3 = entrada.nextDouble();

        double media = (a1 + a2 + a3) / 3;

        if (media >= 7) {
            alegria += 50;
        } else {
            tristeza += 50;
        }

      
        System.out.print("Quantos exercícios a Riley conseguiu fazer? ");
        int exercicios = entrada.nextInt();

        alegria += exercicios * 10;
        tristeza += (10 - exercicios) * 10;

      
        System.out.println("\n--- RESULTADO ---");
        System.out.println("Pontos da Alegria: " + alegria);
        System.out.println("Pontos da Tristeza: " + tristeza);

        if (alegria > tristeza) {
            System.out.println(
                "A mudança para a nova cidade foi uma experiência incrível para a Riley."
            );
        } else if (tristeza > alegria) {
            System.out.println(
                "A mudança para a nova cidade foi uma experiência desagradável para a Riley."
            );
        } else {
            System.out.println("A Alegria e a Tristeza ficaram com a mesma pontuação.");
        }

        entrada.close();
    }
}