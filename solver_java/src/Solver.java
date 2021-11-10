import java.lang.Math;

public class Solver
{
    public double a, b, c;

    public double calulerDiscriminant(double a, double b, double c)
    {
        return b * b - 4 * a * c;
    }

    public double solutionUne(double a, double b, double discriminant)
    {
        return - b - Math.sqrt(discriminant) / 2 * a;
    }

    public double solutionDeux(double a, double b, double discriminant)
    {
        return - b + Math.sqrt(discriminant) / 2 * a;
    }

    public double solutionTrois(double b, double c)
    {
        return - c / b;
    }
}
