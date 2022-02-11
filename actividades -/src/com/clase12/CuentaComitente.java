package com.clase12;


public class CuentaComitente extends Cuenta {
    private String claveValidacion;

    public void extraer(double monto, String claveValidacion) {
          this.setSaldo(this.informarSaldo()-monto);
        };

    public String getClaveValidacion() {
        return claveValidacion;
    }
    public void setClaveValidacion(String claveValidacion) {
        this.claveValidacion = claveValidacion;
    }

    @Override
    public void extraer(double monto) {
        this.setSaldo(this.informarSaldo()-(monto/2));
    };

    @Override
    public void depositar(double monto) {
        super.depositar(monto*0.99);
    }
}
