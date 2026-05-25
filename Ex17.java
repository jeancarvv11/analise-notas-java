import java.util.Scanner;

public class Ex17 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double notas[][] = new double[10][3];

        int piorProva1 = 0;
        int piorProva2 = 0;
        int piorProva3 = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("Digite as 3 notas do aluno " + ( i + 1 ) + ":");
            for (int j = 0; j < 3; j++) {
                notas[i][j] = in.nextDouble();
            }
        }

        for (int i = 0; i < 10; i++) {

            // inicialmente a pior nota é da primeira prova
            double piorNota = notas[i][0];
            int indicePior = 0;

            for (int j = 1; j < 3; j++) {
                // compara a prova 2 e a prova 3 com a piorNota atual
                if (notas[i][j] < piorNota) {
                    piorNota = notas[i][j];
                    indicePior = j;
                }
            }

            if (indicePior == 0){
             piorProva1++;
            }
            else if (indicePior == 1) {
             piorProva2++;
            }
            else { 
              piorProva3++;
            }
        }

      
        System.out.println("RESULTADO:");
        System.out.println("Pior nota na prova 1: " + piorProva1 + " alunos");
        System.out.println("Pior nota na prova 2: " + piorProva2 + " alunos");
        System.out.println("Pior nota na prova 3: " + piorProva3 + " alunos");
    }
}