
public class main {
    public static void main(String[] args) {

        Fraction C = new Fraction(5, 2);
        Fraction D= new Fraction(2, 1);
        assert C.GetDenom() != 0;
        
        System.out.println(" "+C.addorlessFraction(D, false).toString()+"\n");
    }
}
