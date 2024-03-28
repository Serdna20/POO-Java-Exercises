package coleccion;

import figura.Figura;
import java.util.ArrayList;

public class Coleccion {
    String collectionName;
    ArrayList<Figura> listaFiguras;

    public Coleccion(String collectionName) {
        this.collectionName = collectionName;
        this.listaFiguras = new ArrayList<Figura>();
    }

    public String getCollectionName() {
        return collectionName;
    }

    public void setCollectionName(String collectionName) {
        this.collectionName = collectionName;
    }

    public ArrayList<Figura> getListaFiguras() {
        return listaFiguras;
    }

    public void setListaFiguras(ArrayList<Figura> listaFiguras) {
        this.listaFiguras = listaFiguras;
    }
    
    public void addFigura(Figura figura) {
        this.listaFiguras.add(figura);
    }
    
    public void subirPrecio(double extra, String code) {
        for (Figura figurab : this.listaFiguras) {
            if (figurab.getCode().equals(code)) {
                figurab.subirPrecio(extra);
            }
        }
    }

    @Override
    public String toString() {
        String listaFigurasToString = "";
        for (Figura figurab : this.listaFiguras) {
            listaFigurasToString = listaFigurasToString + "\n" + figurab.toString();
        }
        return "Coleccion{" + listaFigurasToString + "\n}";
    }
    
    public String conCapa() {
        String toReturn = "Coleecion con capa{";
        for (Figura figura : this.listaFiguras) {
            if (figura.getSuperheroe().isCape() == true) {
                toReturn = toReturn + "\n" + figura.toString();
            }
        }
        return toReturn + "\n}";        
    }
    
    public String masValioso() {
        Figura figure = this.listaFiguras.get(0);
        for (Figura figura : this.listaFiguras) {
            if (figure.getPrice() < figura.getPrice()) {
                figure = figura;
            }            
        }        
        return figure.toString();    
    }
    
    public double getValorColeccion() {
        double valor = 0;
        for (Figura figura : this.listaFiguras) {
            valor = valor + figura.getPrice();            
        }
        return valor;
    }
    
    public double getVolumenColeccion() {
        double volumen = 0;
        for (Figura figura : this.listaFiguras) {
            volumen = volumen + figura.getDimentions().getVolumen();            
        }
        return volumen;
    }
    
    
}
