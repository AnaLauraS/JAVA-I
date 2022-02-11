package com.patronesConsolidados;

public class EnPresupuesto implements Estado {
    private Reparación t;

    public EnPresupuesto(Reparación t) {
        this.t = t;
    }

    @Override
    public void cambiarDireccion(String e) {
        Exception f = new Exception();
        System.out.println(f.getMessage()+" En el estado de en presupuesto no podes cambiar la direccion");
    }

    @Override
    public void darValorPresupuesto(double e) {
        this.t.setCosto(e);
    }

    @Override
    public void agregarRepuestos(double e) {
        Exception f = new Exception();
        System.out.println(f.getMessage()+" En el estado de en presupuesto no podes agregar costo de repuestos");
    }

   // @Override
   // public void pasar() {
        //Estás primeras líneas sirven si no hay fábrica
        // this.t.setEstado(new EnReparacion(t));
        // System.out.println("El producto "+this.t.getNombre()+" cambió a estado 'en reparación'. Su dirección de entrega es "+this.t.getDireccion());

   // }
}
