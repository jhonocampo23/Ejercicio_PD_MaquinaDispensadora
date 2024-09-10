package Cadena;

public class GestorBillete5000 extends BaseGestorBilletes {
    private GestorBilletes proximoGestor;
    private int denominacion = 5000;

    public void siguienteDispensador(GestorBilletes gestor) {
        this.proximoGestor = gestor;
    }

    public void respuestaGestor(int cantidad) {
        if (cantidad % denominacion != 0) {
            System.out.println("Error: La cantidad no es multiplo de " + denominacion);
            return;
        } else {
            if (cantidad >= denominacion) {
                int numBilletes = cantidad / denominacion;
                System.out.println("Se dispensan " + numBilletes + " billetes de $" + denominacion);
                if (proximoGestor != null) {
                    proximoGestor.respuestaGestor(cantidad % denominacion);
                }
            }
        }
    }
}
