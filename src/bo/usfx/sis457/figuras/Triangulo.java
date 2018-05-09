package bo.usfx.sis457.figuras;


public class Triangulo {
    private double Lado1;
    private double Lado2;
    private double Lado3;
    
    public Triangulo(double lado1, double lado2, double lado3) {
        this.Lado1 = lado1;
        this.Lado2 = lado2;
        this.Lado3 = lado3;
    }
    
   
    public Triangulo() {
        
        this(0, 0, 0);
    }

    
    public double getLado1() {
        return Lado1;
    }

   
    public void setLado1(double lado1) {
        this.Lado1 = lado1;
    }

    
    public double getLado2() {
        return Lado2;
    }

   
    public void setLado2(double lado2) {
        this.Lado2 = lado2;
    }

    public double getLado3() {
        return Lado3;
    }

    public void setLado3(double lado3) {
        this.Lado3 = lado3;
    }
    
    
    public double getArea() {
        return (this.Lado3 * (Math.sqrt (Math.pow(this.Lado1,2)- Math.pow(this.Lado3/2,2))))/2;
    }
    
    
    public double getPerimetro() {
        return( (this.Lado1 + this.Lado2 + this.Lado3));
    }
}

