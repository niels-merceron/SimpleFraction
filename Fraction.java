// Your First Program

public class Fraction {
    public int denom;
    public int num;

    public Fraction(int A, int b) {
        this.denom = A;
        this.num = b;
    }
    public Fraction(int A){
        this.denom=1;
        this.num=A;
    }
    public Fraction(){
        this.denom=1;
        this.num=1;
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
