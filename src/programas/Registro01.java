package programas;
public class Registro01 {
    //atributos
    private double ingresom;
    private double oingreso;
    private double gastom;
    //metodo constructor
    public Registro01(double xingresom,double xoingreso,double xgastom) {
        this.ingresom=xingresom;
        this.oingreso=xoingreso;
        this.gastom=xgastom;
    }
    public double ahorrom() {
        return(((this.ingresom+this.oingreso)-this.gastom));
    }
    public double ahorros() {
        return(this.ahorrom()*6);
    }
    public double ahorroa() {
        return(this.ahorrom()*12);
    }
}
