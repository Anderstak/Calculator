package com.example.demo1;

public class Calculator {
    private double buffer = 0.0;
    Calculator() {

    }

    Calculator(double buffer){
        this.buffer = buffer;
    }

    public double getBuffer() {
        return this.buffer;
    }

    //Реализуем операции
    void add(double x) {
        this.buffer += x;
    }

    void sub(double x) {
        this.buffer -= x;
    }

    void mlt(double x) {
        this.buffer *= x;
    }

    void div(double x) {
        this.buffer /= x;
    }

    public void log() {
        this.buffer = Math.log(this.buffer)/Math.log(2);
    }

    public void Koren() {
        this.buffer  = Math.sqrt(this.buffer);
    }

    public void Proh() {
        this.buffer /= 100;
    }

    public void C() {
        this.buffer = 0;
    }

    public void Ravno(double x) {
        this.buffer += x;
    }


}

