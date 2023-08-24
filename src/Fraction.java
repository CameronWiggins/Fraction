public class Fraction {

    private int numerator;
    private int denominator;

    public Fraction()
    {
        numerator = 0;
        denominator = 1;
    }

    public Fraction(int num, int denom)
    {
        numerator = num;
        denominator = denom; 
    }

    static int gcd(int a, int b)
    {
    if(b == 0)
    {
        return a;
    }
    return gcd(b, a % b);
    }

    static int lcm(int a, int b)
    {
        return (a / gcd(a, b)) * b;
    }

    
}
