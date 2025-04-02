package main.java;

public class Corpo_humano {
    private  double massa;
    public double altura;
    public double IMC;

    public void setMassa(double massa) {
        this.massa = massa;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setIMC(double IMC) {
        this.IMC = IMC;
    }
    public void calcularIMC(){
        IMC = massa/(altura*altura);

    }
    public double getIMC(){
        return this.IMC;
    }
    
        
    }
