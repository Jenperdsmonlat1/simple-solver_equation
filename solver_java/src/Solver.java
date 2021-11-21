import java.lang.Math;
import java.lang.System;

public class Solver
{
    private static final String RESET = "\u001B[0m";
    private static final String RED = "\u001B[31m";
    private static final String GREEN = "\u001B[32m";
    private static final String YELLOW = "\u001B[33m";
    private static final String CYAN = "\u001B[36m";
    private static int discriminant;

    public Solver(int a, int b, int c)
    {
        System.out.println(YELLOW + "Entier A: " + a);
        System.out.println("Entier B: " + b);
        System.out.println("Entier C: " + c + RESET);
        discriminant = calculerDiscriminant(a, b, c);
    }

    public void trouverSolutions(int a, int b, int c)
    {
        if (a == 0)
        {
            if (b == 0)
            {
                if (c == 0)
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
                System.out.println(YELLOW + "Il n'y a qu'une seul solution." + RESET);
                int solution;
                solution = calculerSolutionDouble(b, c);
                System.out.print(YELLOW + "Solution; " + solution + RESET);
            }
        }
        else
        {
            if (discriminant >= 0)
            {
                System.out.println(GREEN + "L'equation a deux solutions qui sont: " + RESET);
                int solution1, solution2;

                solution1 = calculerSolutionUne(discriminant, a, b);
                solution2 = calculerSolutionDeux(discriminant, a, b);

                System.out.println(CYAN + "Solution 1: " + solution1);
                System.out.println("Solution 2: " + solution2);
            }
            else
            {
                System.out.println(RED + "L'equation n'a pas de solutions." + RESET);
            }
        }
    }

    public int calculerDiscriminant(int a, int b, int c)
    {
        return b * b - 4 * a * c;
    }

    private int calculerSolutionUne(int discriminant, int a, int b)
    {
        return (int) (- b - Math.sqrt(discriminant) / 2 * a);
    }

    private int calculerSolutionDeux(int discriminant, int a, int b)
    {
        return (int) (- b + Math.sqrt(discriminant) / 2 * a);
    }

    private int calculerSolutionDouble(int b, int c)
    {
        return - c / b;
    }
}
