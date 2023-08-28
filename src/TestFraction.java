public class TestFraction {
    public static void main(String[] args) throws Exception {
        Fraction f1 = new Fraction(1, 3); 
        Fraction f2 = new Fraction(1, 6); 
        Fraction f3 = new Fraction(1, 4); 
        Fraction f4 = new Fraction(3, 6); 
        Fraction f5 = new Fraction(3, 8); 
        Fraction f6 = new Fraction(2, 5); 
        Fraction sum;
        Fraction product;
        
        sum = f1.add(f2);  // 1/3 + 1/6 
        System.out.println(f1 + " + " + f2 + " = " + sum);
        product = f1.multiply(f2); // 1/3 * 1/6 
        System.out.println(f1 + " * " + f2 + " = " + product);
        sum = f3.add(f4);  // 1/4 + 3/6 
        System.out.println(f3 + " + " + f4 + " = " + sum);
        product = f3.multiply(f4); // 1/4 * 3/6 
        System.out.println(f3 + " * " + f4 + " = " + product);
        sum = f5.add(f6);  // 3/8 + 2/5 
        System.out.println(f5 + " + " + f6 + " = " + sum);
        product = f5.multiply(f6); // 3/8 * 2/5
        System.out.println(f5 + " * " + f6 + " = " + product);

    }
}
