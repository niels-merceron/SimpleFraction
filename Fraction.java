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

    public void Setnum(int n){
        this.numerateur=n;
    }

    public void Setdeno(int n){
        this.denominateur=n;
    }

    public String toString(){
        return("je suis une fraction : "+this.Getnum()+"/"+this.GetDenom()+"\n");
    }

    public double Resultfraction (){
        double d =this.denominateur;
        double n = this.numerateur;
        return(n/d);
    }

    public Fraction addorlessFraction(Fraction B,boolean A){
        Fraction C =new Fraction();

        C.Setdeno(this.GetDenom()*B.GetDenom());
        if(A==true){
        C.Setnum((this.Getnum()*B.GetDenom())+(B.Getnum()*this.GetDenom()));
        }
        else{
            C.Setnum((this.Getnum()*B.GetDenom())-(B.Getnum()*this.GetDenom()));
        }
        return(C);
    }

    public boolean compare(Fraction B){
        if(this.Resultfraction()==B.Resultfraction()){
            return(true);
        }
        else{
            return(false);
        }
    }

}
