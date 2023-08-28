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

    private void reduce()
    {
        int GreatComDenom = gcd(this.numerator, this.denominator);
        this.numerator /= GreatComDenom;
        this.denominator /= GreatComDenom;
    }

    public Fraction add(Fraction other)
    {
        int leastComMulti = lcm(this.denominator, other.denominator);
        int multiOne = leastComMulti / this.denominator;
        int multiTwo = leastComMulti / other.denominator;
        Fraction sum = new Fraction((this.numerator * multiOne) + (other.numerator * multiTwo), leastComMulti);
        sum.reduce();
        return sum;
    }

    public String toString()
    {
        return this.numerator + "/" + this.denominator;
    }

}
