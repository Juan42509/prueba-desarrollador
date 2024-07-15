
package com.prueba.controller;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;

@Named
@RequestScoped
public class TextProcesation {
    private String inputText;
    private String outputText;

    public String getInputText() {
        return inputText;
    }

    public void setInputText(String inputText) {
        this.inputText = inputText;
    }

    public String getOutputText() {
        return outputText;
    }

    public void setOutputText(String outputText) {
        this.outputText = outputText;
    }

    public void processText() {

    String[] partes = inputText.split("\\\\");
    if (inputText == null || partes.length != 2) {
        throw new IllegalArgumentException("La frase no tiene el Formato Invalido");
    }

    int number = Integer.parseInt(partes[0].trim());
    String frase = partes[1].trim();

    // Limpiar la frase y verificar el número de palabras
    String fraseLimpia = frase.replaceAll("[^a-zA-Z\\s]", "").toLowerCase();
    int contadorPalabras = fraseLimpia.split("\\s+").length;
    boolean verificarContadorPalabras = contadorPalabras == number;

    // Formatear la salida
    outputText = fraseLimpia + "\\" + (verificarContadorPalabras ? "true" : "false");
    }
}