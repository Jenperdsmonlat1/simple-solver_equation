import java.util.Scanner;
import java.lang.System;
import java.lang.String;

public class MainSolver
{
    private static final String RESET = "\u001B[0m";
    private static final String BLACK = "\u001B[30m";
    private static final String RED = "\u001B[31m";
    private static final String GREEN = "\u001B[32m";
    private static final String YELLOW = "\u001B[33m";
    private static final String BLUE = "\u001B[34m";
    private static final String PURPLE = "\u001B[35m";
    private static final String CYAN = "\u001B[36m";

    public static void main(String[] arg)
    {
        double discriminant, solution1, solution2, solution3;
        Solver solver = new Solver();
        Scanner lectureClavier = new Scanner(System.in);

        System.out.println(YELLOW + "Saisissez l'entier A: " + RESET);
        solver.a = lectureClavier.nextDouble();

        System.out.println(YELLOW + "Saisissez l'entier B: " + RESET);
        solver.b = lectureClavier.nextDouble();

        System.out.println(YELLOW + "Saisissez l'entier C: " + RESET);
        solver.c = lectureClavier.nextDouble();

        if (solver.a == 0)
        {
            if (solver.b == 0)
            {
                if (solver.c == 0)
                {
                    System.out.print(GREEN + "Tous les réels sont solutions." + RESET);
                }
                else
                {
                    System.out.print(RED + "Il n'y a pas de solutions." + RESET);
                }
            }
            else
            {
                solution3 = solver.solutionTrois(solver.b, solver.c);
                System.out.println(PURPLE + "L'equation possède une seule solution." + RESET);
                System.out.println(PURPLE + "Celle-ci est: " + solution3 + RESET);
            }
        }
        else {
            discriminant = solver.calulerDiscriminant(solver.a, solver.b, solver.c);
            if (discriminant >= 0) {
                System.out.println(BLUE + "L'equation possède deux solutions qui sont: " + RESET);
                solution1 = solver.solutionUne(solver.a, solver.b, discriminant);
                solution2 = solver.solutionDeux(solver.a, solver.b, discriminant);
                System.out.println(CYAN + "Solution 1: " + solution1 + RESET);
                System.out.println(CYAN + "Solution 2: " + solution2 + RESET);
            } else {
                System.out.print(RED + "Il n'y a aucunes solutions dans les réels." + RESET);
            }
        }
    }
}
