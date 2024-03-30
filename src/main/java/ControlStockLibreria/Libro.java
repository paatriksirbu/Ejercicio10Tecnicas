package ControlStockLibreria;
import java.util.*;

public class Libro implements ControlStock {

    private String nombreLibro;
    private ArrayList<Integer> stock;

    public Libro(String nombreLibro){
        this.nombreLibro = nombreLibro;
        this.stock = new ArrayList<Integer>();
    }

    @Override
    public void addToStock(long cantidadLong) throws ExcepcionStockDesbordado{
        int stockActual = this.stock.isEmpty() ? 0 : this.stock.get(this.stock.size() - 1);
        long suma = (long) stockActual + (long) cantidadLong;
        if (suma > Integer.MAX_VALUE){
            throw new ExcepcionStockDesbordado(this.nombreLibro);
        }
        long nuevoStock = stockActual + cantidadLong;
        this.stock.add((int) nuevoStock);
    }

    @Override
    public void removeFromStock(long cantidadLong) throws ExcepcionStockDesbordado{
        int stockActual = this.stock.isEmpty() ? 0 : this.stock.get(this.stock.size() - 1);
        if (cantidadLong > stockActual){
            throw new ExcepcionStockDesbordado(this.nombreLibro);
        }
        long nuevoStock = stockActual - cantidadLong;
        this.stock.add((int) nuevoStock);
    }

    @Override
    public int getStock() {
        if (this.stock.isEmpty()) {
            return 0;
        } else {
            return this.stock.get(this.stock.size() - 1);
        }
    }
}
