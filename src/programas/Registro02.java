package programas;
public class Registro02 {
    //atributos
    private double compra1;
    private double compra2;
    private double compra3;
    private double compra4;
    //metodo constructor
    public Registro02(double xcompra1,double xcompra2,double xcompra3, double xcompra4) {
        this.compra1=xcompra1;
        this.compra2=xcompra2;
        this.compra3=xcompra3;
        this.compra4=xcompra4;
    }
    public double total() {
        return(this.compra1+this.compra2+this.compra3+this.compra4);
    }
    public double promedio() {
        return(this.total()/4);
    }
    public double mayor() {
        double xmayor;
        xmayor=this.compra1;
        if (this.compra2>xmayor) {
            xmayor=this.compra2;
        }
        if (this.compra3>xmayor) {
            xmayor=this.compra3;
        }
        if (this.compra4>xmayor) {
            xmayor=this.compra4;
        }
        return(xmayor);
    }
    public double menor() {
        double xmenor;
        xmenor=this.compra1;
        if (this.compra2<xmenor) {
            xmenor=this.compra2;
        }
        if (this.compra3<xmenor) {
            xmenor=this.compra3;
        }
        if (this.compra4<xmenor) {
            xmenor=this.compra4;
        }
        return(xmenor);
    }
}
