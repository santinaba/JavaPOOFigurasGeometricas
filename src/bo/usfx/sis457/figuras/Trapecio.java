package bo.usfx.sis457.figuras;


public class Trapecio {
    private double Parte1;
    private double Parte2;
    private double Parte3;
    private double Parte4;
    public Trapecio(double parte1, double parte2, double parte3, double parte4) {
        this.Parte1 = parte1;
        this.Parte2 = parte2;
        this.Parte3 = parte3;
        this.Parte4 = parte4;
    }
    
   
    public Trapecio() {
        
        this(0, 0, 0, 0);
    }

    
    public double getParte1() {
        return Parte1;
    }

   
    public void setParte1(double parte1) {
        this.Parte1 = parte1;
    }

    
    public double getParte2() {
        return Parte2;
    }

   
    public void setParte2(double parte2) {
        this.Parte2 = parte2;
    }

    public double getParte3() {
        return Parte3;
    }

    public void setParte3(double parte3) {
        this.Parte3 = parte3;
    }

    public double getParte4() {
        return Parte4;
    }

    public void setParte4(double parte4) {
        this.Parte4 = parte4;
    }
    
    
    public double getArea() {
        return ((this.Parte2 + this.Parte3) * this.Parte4)/2;
    }
    
    
    public double getPerimetro() {
        return( (2 * this.Parte1 + this.Parte2 + this.Parte3 ));
    }
}


