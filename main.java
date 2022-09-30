
public class main {
    public static void main(String[] args) {

        Fraction C = new Fraction(3, 1);
        Fraction D= new Fraction(3, 1);
        assert C.GetDenom() != 0;
        
        System.out.println(" "+C.compare(D)+"\n");
    }
}
