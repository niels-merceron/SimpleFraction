// Your First Program

public class Fraction {
    public int denominateur;
    public int numerateur;

    public Fraction(int d, int n) {
        this.denominateur = d;
        this.numerateur = n;
    }
    public Fraction(int n){
        this.denominateur=1;
        this.numerateur=n;
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
        double i = this.numerateur/this.denominateur;
        return(i);
    }

}
