package model;

public class Producto {
   private String id;
   private String nombre;
   private double precio;
   private String idFabricante;
   private String nombreFabricante;

    public Producto(String id, String nombre, double precio, String idFabricante, String nombreFabricante) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.idFabricante = idFabricante;
        this.nombreFabricante = nombreFabricante;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getIdFabricante() {
        return idFabricante;
    }

    public void setIdFabricante(String idFabricante) {
        this.idFabricante = idFabricante;
    }

    public String getNombreFabricante() {
        return nombreFabricante;
    }

    public void setNombreFabricante(String nombreFabricante) {
        this.nombreFabricante = nombreFabricante;
    }
}
