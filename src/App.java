public class App {
    public static void main(String[] args) throws Exception {
        Fraction f1 = new Fraction(1, 3); 
        Fraction f2 = new Fraction(1, 6); 
        Fraction sum;

        sum = f1.add(f2);  // 1/3 + 1/6 
        System.out.println(f1 + " + " + f2 + " = " +sum); 
    }
}
