package com.patronesConsolidados;

public class Finalizado implements Estado {
    private Reparación t;

    public Finalizado (Reparación t) {
        this.t = t;
    }

    @Override
    public void cambiarDireccion(String e) {
        Exception f = new Exception();
        System.out.println(f.getMessage() + " En el estado de finalizado no podes cambiar la dirección");
    }

    @Override
    public void darValorPresupuesto(double e) {
        Exception f = new Exception();
        System.out.println(f.getMessage() + " En el estado de finalizado no podes asignar presupuesto inicial");
    }

    @Override
    public void agregarRepuestos(double e) {
        Exception f = new Exception();
        System.out.println(f.getMessage() + " En el estado de finalizado no podes agregar respuestos");
    }

   /* @Override
    public void pasar() {
        this.t.setEstado(new EnPresupuesto(t));
        System.out.println("El producto " + this.t.getNombre() + " cambió a estado 'en presupuesto'. Su dirección de entrega es " + this.t.getDireccion());
    } */
}
