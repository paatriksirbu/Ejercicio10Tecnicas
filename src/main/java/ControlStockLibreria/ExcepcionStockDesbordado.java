package ControlStockLibreria;

public class ExcepcionStockDesbordado  extends Exception{

    public ExcepcionStockDesbordado(String nombreLibro){
        super("El stock del libro " + nombreLibro + " excede la capacidad de este sistema.");
    }
}
