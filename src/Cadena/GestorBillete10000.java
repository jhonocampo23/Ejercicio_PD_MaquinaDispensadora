package Cadena;

public class GestorBillete10000 extends BaseGestorBilletes{
    private GestorBilletes proximoGestor;
    private final int denominacion = 10000;

    public void siguienteDispensador(GestorBilletes gestor) {
        this.proximoGestor = gestor;
    }

    public void respuestaGestor(int cantidad) {
        if (cantidad >= denominacion) {
            int numBilletes = cantidad / denominacion;
            System.out.println("Se dispensan " + numBilletes + " billetes de $" + denominacion);
            if (proximoGestor != null) {
                proximoGestor.respuestaGestor(cantidad % denominacion);
            }
        } else {
            proximoGestor.respuestaGestor(cantidad);
        }
    }
}
