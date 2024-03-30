package ControlStockLibreria;
import java.util.*;

public class Libro {

    private String nombreLibro;
    private ArrayList<Integer> stock;

    public Libro(String nombreLibro){
        this.nombreLibro = nombreLibro;
        this.stock = new ArrayList<Integer>();
    }

    public void addToStock(int cantidad) throws ExcepcionStockDesbordado{
        int stockActual = 0;
        if (Integer.MAX_VALUE - stockActual < cantidad){
            throw new ExcepcionStockDesbordado(this.nombreLibro);
        }
        int nuevoStock = stockActual + cantidad;
        this.stock.add(nuevoStock);
    }

    public void removeFromStock(int cantidad) throws ExcepcionStockDesbordado{
        int stockActual = this.stock.get(this.stock.size() - 1);
        if (cantidad > stockActual){
            throw new ExcepcionStockDesbordado(this.nombreLibro);
        }
        int nuevoStock = stockActual - cantidad;
        this.stock.add(nuevoStock);
    }

    public int getStock(){
        return this.stock.get(this.stock.size() - 1);
    }

}
