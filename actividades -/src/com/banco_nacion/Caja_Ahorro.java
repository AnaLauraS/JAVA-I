package com.banco_nacion;

public class Caja_Ahorro extends Cuenta{
    private float saldo;
    private float tasaInteres;

    public Caja_Ahorro(Cliente cliente, int num, float saldo, float tasaInteres) {
        super(cliente, num);
        this.saldo = saldo;
        this.tasaInteres = tasaInteres;
    }

    @Override
    public void depositar(float cant) {
        saldo+=cant;
    }

    @Override
    public void extraer(float cant) {
        if (saldo>=cant){
            saldo-=cant;
        }
    }

    public void cobrarInterés () {
        saldo *= (1 + (tasaInteres / 100));
    }
}
