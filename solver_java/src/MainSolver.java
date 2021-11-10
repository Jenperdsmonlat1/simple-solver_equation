import java.util.Scanner;
import java.lang.System;
import java.lang.String;

public class MainSolver
{
    public static void main(String[] arg)
    {
        double discriminant, solution1, solution2, solution3;
        Solver solver = new Solver();
        Scanner lectureClavier = new Scanner(System.in);

        System.out.println("Saisissez l'entier A: ");
        solver.a = lectureClavier.nextDouble();

        System.out.println("Saisissez l'entier B: ");
        solver.b = lectureClavier.nextDouble();

        System.out.println("Saisissez l'entier C: ");
        solver.c = lectureClavier.nextDouble();

        if (solver.a == 0)
        {
            if (solver.b == 0)
            {
                if (solver.c == 0)
                {
                    System.out.print("Tous les réels sont solutions.");
                }
                else
                {
                    System.out.print("Il n'y a pas de solutions.");
                }
            }
            else
            {
                solution3 = solver.solutionTrois(solver.b, solver.c);
                System.out.println("L'equation possède une seule solution.");
                System.out.println("Celle-ci est: " + solution3);
            }
        }
        else {
            discriminant = solver.calulerDiscriminant(solver.a, solver.b, solver.c);
            if (discriminant >= 0) {
                System.out.println("L'equation possède deux solutions qui sont: ");
                solution1 = solver.solutionUne(solver.a, solver.b, discriminant);
                solution2 = solver.solutionDeux(solver.a, solver.b, discriminant);
                System.out.println("Solution 1: " + solution1);
                System.out.println("Solution 2: " + solution2);
            } else {
                System.out.print("Il n'y a aucunes solutions dans les réels.");
            }
        }
    }
}
