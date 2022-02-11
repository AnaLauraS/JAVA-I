package com.patronesConsolidados;

public class EnReparacion implements Estado {
    private Reparación t;

    public EnReparacion (Reparación t) {
        this.t = t;
    }

    @Override
    public void cambiarDireccion(String e) {
        Exception f = new Exception();
        System.out.println(f.getMessage() + " En el estado de en reparación no podes cambiar la direccion");
    }

    @Override
    public void darValorPresupuesto(double e) {
        Exception f = new Exception();
        System.out.println(f.getMessage() + " En el estado de en reparación no podes asignar presupuesto inicial");
    }

    @Override
    public void agregarRepuestos(double e) {
        this.t.setCosto(this.t.getCosto() + e);
    }

   /* @Override
    public void pasar() {
        this.t.setEstado(new ParaEnvio(t));
        System.out.println("El producto " + this.t.getNombre() + " cambió a estado 'para envio'. Su dirección de entrega es " + this.t.getDireccion());
    } */
}



