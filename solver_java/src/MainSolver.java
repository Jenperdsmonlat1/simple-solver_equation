import java.util.Scanner;
import java.lang.System;

public class MainSolver
{
    private static final String RESET = "\u001B[0m";
    private static final String PURPLE = "\u001B[35m";

    public static void main(String[] args)
    {
        int a, b, c;
        int nb_equation;
        Solver [] tableaux;
        Scanner lectureClavier = new Scanner(System.in);

        if (args.length > 0) {
            a = Integer.parseInt(args[0]);
            b = Integer.parseInt(args[1]);
            c = Integer.parseInt(args[2]);
            nb_equation = Integer.parseInt(args[3]);

            tableaux = new Solver[nb_equation];

            for (int i = 0; i < tableaux.length; i++)
            {
                tableaux[i] = new Solver(a, b, c);
                tableaux[i].trouverSolutions(a, b, c);
            }
        }
        else
        {
            System.out.println(PURPLE + "Saisissez le nombre d'equation a resoudre: " + RESET);
            nb_equation = lectureClavier.nextInt();

            tableaux = new Solver[nb_equation];

            for (int i = 0; i < tableaux.length; i++)
            {
                System.out.println(PURPLE + "Saisissez l'entier A: " + RESET);
                a = lectureClavier.nextInt();

                System.out.println(PURPLE + "Saisissez l'entier B: " + RESET);
                b = lectureClavier.nextInt();

                System.out.println(PURPLE + "Saisissez l'entier C: " + RESET);
                c = lectureClavier.nextInt();

                tableaux[i] = new Solver(a, b, c);
                tableaux[i].trouverSolutions(a, b, c);
            }
        }
    }
}
