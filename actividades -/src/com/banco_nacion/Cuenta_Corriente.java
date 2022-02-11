package com.banco_nacion;

public class Cuenta_Corriente extends Cuenta{
    private float saldo;
    private float montoAutorizado;

    public Cuenta_Corriente(Cliente cliente, int num, float saldo, float montoAutorizado) {
        super(cliente, num);
        this.saldo = saldo;
        this.montoAutorizado = montoAutorizado;
    }

    @Override
    public void depositar(float cant) {
        saldo+=cant;
    }

    @Override
    public void extraer(float cant) {
        if (saldo>=cant){
            saldo-=cant;
        }if (saldo+montoAutorizado>=cant){
            saldo=0;
            //no sé que pasa: consume del monto autorizado? o deja el saldo en negativo?
        }
    }
}
