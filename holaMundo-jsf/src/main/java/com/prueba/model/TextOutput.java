
package com.prueba.model;


public class TextOutput {
    
    private String fraseLimpia;
    private boolean contadorPalabras;

    public TextOutput(String fraseLimpia, boolean contadorPalabras) {
        this.fraseLimpia = fraseLimpia;
        this.contadorPalabras = contadorPalabras;
    }

    public String getFraseLimpia() {
        return fraseLimpia;
    }

    public void setFraseLimpia(String fraseLimpia) {
        this.fraseLimpia = fraseLimpia;
    }

    public boolean isContadorPalabras() {
        return contadorPalabras;
    }

    public void setContadorPalabras(boolean contadorPalabras) {
        this.contadorPalabras = contadorPalabras;
    }
    
    
}
