package models;

/**
 * Created by mtorre4580 on 4/6/16.
 */
public class Ubicacion {

    private double latitud;
    private double longitud;

    public Ubicacion(){

    }

    public Ubicacion(double latitud,double longitud){
        this.latitud = latitud;
        this.longitud = longitud;
    }

    public double getLatitud() {
        return latitud;
    }

    public void setLatitud(double latitud) {
        this.latitud = latitud;
    }

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }
}
