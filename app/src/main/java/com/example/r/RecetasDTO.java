package com.example.r;

public class RecetasDTO {
     private String idreceta;
     private String nombrereceta;
     private String tipo;
     private String ingredientes;

    public String getId() {
        return idreceta;
    }

    public void setId(String id) {
        this.idreceta = id;
    }

    public String getNombrereceta() {
        return nombrereceta;
    }

    public void setNombrereceta(String nombrereceta) {
        this.nombrereceta = nombrereceta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(String ingredientes) {
        this.ingredientes = ingredientes;
    }
}
