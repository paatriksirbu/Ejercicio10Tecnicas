package ControlStockLibreria;

public class ExcepcionStockDesbordado  extends Exception{

    //Constructor de la excepcion que nos permitira indicar al usuario que el stock del libro excede la capacidad del sistema.
    public ExcepcionStockDesbordado(String nombreLibro){
        super("El stock del libro " + nombreLibro + " excede la capacidad de este sistema.");
    }
}
