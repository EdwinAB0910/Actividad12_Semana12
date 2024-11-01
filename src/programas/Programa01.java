package programas;
import java.util.Scanner;
public class Programa01 {
    public static void main(String[] args) {
    //declarar variables
    double ingresom,oingreso,gastom;
    Scanner lectura=new Scanner(System.in);
    //entrada
        System.out.print("Ingrese el ingreso mensual: ");
        ingresom=lectura.nextDouble();
        System.out.print("Ingrese otros ingresos: ");
        oingreso=lectura.nextDouble();
        System.out.print("Ingrese el gasto mensual: ");
        gastom=lectura.nextDouble();
        
        //crear un objeto de la clase RegistroVenta
        Registro01 objreg01=new Registro01(ingresom,oingreso,gastom);
        
        //salida
        System.out.println("");
        System.out.println("Resultados");
        System.out.println("El ahorro mensual es: " +objreg01.ahorrom());
        System.out.println("El ahorro semstral es: " +objreg01.ahorros());
        System.out.println("El ahorro anual es: " +objreg01.ahorroa());
    }
}

