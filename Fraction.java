// Your First Program

public class Fraction {
    public int denominateur;
    public int numerateur;

    public Fraction(int A, int b) {
        this.denominateur = A;
        this.numerateur = b;
    }
    public Fraction(int A){
        this.denominateur=1;
        this.numerateur=A;
    }
    public Fraction(){
        this.denominateur=1;
        this.numerateur=1;
    }

    public int GetDenom(){
        return(this.denominateur);
    }

    public int Getnum(){
        return(this.numerateur);
    }

    public String toString(){
        return("\n je suis une fraction ");
    }

    public double Resultfraction (){
        double i = this.denominateur/this.numerateur;
        return(i);
    }

}
