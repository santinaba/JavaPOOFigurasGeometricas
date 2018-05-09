package bo.usfx.sis457.figuras;
public class Paralelogramo {
    private double Diagonal;
    private double Alto;

    public Paralelogramo(double diagonal, double alto) {
        this.Diagonal = diagonal;
        this.Alto = alto;
    }
    public Paralelogramo() {
        this(0, 0);
    }
    public double getDiagonal() {
        return Diagonal;
    }
    public void setDiagonal(double Diagonal) {
        this.Diagonal = Diagonal;
    }
    public double getAlto() {
        return Alto;
    }
    public void setAltura(double altura) {
        this.Alto = altura;
    }
    public double getArea() {
        return this.Diagonal * this.Alto;
    }

    public void setLinea1(double nextDouble) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
