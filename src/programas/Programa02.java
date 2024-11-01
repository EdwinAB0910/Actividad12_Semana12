package programas;
import java.util.Scanner;
public class Programa02 {
    public static void main(String[] args) {
    //declarar variables
    double c1,c2,c3,c4;
    Scanner lectura=new Scanner(System.in);
    //entrada
        System.out.print("Ingrese el valor de la primera compra: ");
        c1=lectura.nextDouble();
        System.out.print("Ingrese el valor de la segunda compra: ");
        c2=lectura.nextDouble();
        System.out.print("Ingrese el valor de la tercera compra: ");
        c3=lectura.nextDouble();
        System.out.print("Ingrese el valor de la cuarta compra: ");
        c4=lectura.nextDouble();
        
        //crear un objeto de la clase RegistroVenta
        Registro02 objreg02=new Registro02(c1,c2,c3,c4);
        
        //salida
        System.out.println("");
        System.out.println("Resultados");
        System.out.println("El total de valor de las compras es: " +objreg02.total());
        System.out.println("El promedio del valor de las compras es: " +objreg02.promedio());
        System.out.println("El mayor valor de compra es: " +objreg02.mayor());
        System.out.println("El menor valor de compra es: " +objreg02.menor());
    }
}
