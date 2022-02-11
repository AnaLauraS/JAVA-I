package com.patronesConsolidados;

public class ParaEnvio implements Estado {
    private Reparación t;

    public ParaEnvio (Reparación t) {
        this.t = t;
    }

    @Override
    public void cambiarDireccion(String e) {
        this.t.setDireccion(e);
    }

    @Override
    public void darValorPresupuesto(double e) {
        Exception f = new Exception();
        System.out.println(f.getMessage() + " En el estado de para envio no podes asignar presupuesto inicial");
    }

    @Override
    public void agregarRepuestos(double e) {
        Exception f = new Exception();
        System.out.println(f.getMessage() + " En el estado de para envio no podes agregar respuestos");
    }

   /* @Override
    public void pasar() {
        this.t.setEstado(new Finalizado(t));
        System.out.println("El producto " + this.t.getNombre() + " cambió a estado 'finalizado'. Su dirección de entrega es " + this.t.getDireccion());
    }*/
}
