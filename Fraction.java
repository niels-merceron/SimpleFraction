// Your First Program

public class Fraction {
    public int denom;
    public int num;

    public Fraction(int A, int b) {
        this.denom = A;
        this.num = b;
    }

    public int GetDenom(){
        return(this.denom);
    }

    public int Getnum(){
        return(this.num);
    }

    public String toString(){
        return("\n je suis une fraction ");
    }
}
