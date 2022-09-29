// Your First Program

public class Fraction {
    private int denom;
    private int num;

    public Fraction(int A, int b) {
        denom = A;
        num = b;
    }

    public int GetDenom(){
        return(denom);
    }

    public int Getnum(){
        return(num);
    }

    public String toString(){
        return("\n je suis une fraction \n");
    }
}
