package Cadena;

public abstract class BaseGestorBilletes implements GestorBilletes {
    private GestorBilletes proximoGestor;

    public void siguienteDispensador(GestorBilletes gestor) {
        this.proximoGestor = gestor;
    }

    public void respuestaGestor(int cantidad){
        if(proximoGestor != null){
            proximoGestor.respuestaGestor(cantidad);
        }
    }    
}
