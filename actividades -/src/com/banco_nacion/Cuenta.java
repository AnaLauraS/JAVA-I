package com.banco_nacion;

public abstract class Cuenta {
    private Cliente cliente;
    private int num;
    private float saldo;

    public abstract void depositar (float cant);
    public abstract void extraer (float cant);
    public float informar () {
        return this.saldo;
    };

    public Cuenta(Cliente cliente, int num) {
        this.cliente = cliente;
        this.num = num;
    }

    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public int getNum() {
        return num;
    }
    public void setNum(int num) {
        this.num = num;
    }
    public float getSaldo() {
        return saldo;
    }
    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
}
