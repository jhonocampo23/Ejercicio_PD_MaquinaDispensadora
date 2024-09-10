import java.util.Scanner;
import Cadena.GestorBilletes;
import Cadena.GestorBillete10000;
import Cadena.GestorBillete100000;
import Cadena.GestorBillete20000;
import Cadena.GestorBillete5000;
import Cadena.GestorBillete50000;

public class CajeroAutomatico {
    private GestorBilletes gestorBilletes;

        public CajeroAutomatico(GestorBilletes gestorBilletes) {
            this.gestorBilletes = gestorBilletes;
        }

        public void dispensarDinero(int cantidad) {
            gestorBilletes.respuestaGestor(cantidad);
        }

    public static void main(String[] args) {
        GestorBilletes billete100000 = new GestorBillete100000();
        GestorBilletes billete50000 = new GestorBillete50000();
        GestorBilletes billete20000 = new GestorBillete20000();
        GestorBilletes billete10000 = new GestorBillete10000();
        GestorBilletes billete5000 = new GestorBillete5000();

        billete100000.siguienteDispensador(billete50000);
        billete50000.siguienteDispensador(billete20000);
        billete20000.siguienteDispensador(billete10000);
        billete10000.siguienteDispensador(billete5000);
        

        CajeroAutomatico cajero = new CajeroAutomatico(billete100000);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la cantidad a dispensar: ");
        int cantidad = scanner.nextInt();

        cajero.dispensarDinero(cantidad);

        scanner.close();
    }
}
