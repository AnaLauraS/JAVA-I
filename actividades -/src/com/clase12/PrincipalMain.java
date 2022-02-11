package com.clase12;

public class PrincipalMain {

	public static void main(String[] args) {

		CajaAhorro ca = new CajaAhorro();
		ca.setSaldo(100);
		ca.cobrarIntereses();
		
		System.out.println(ca.informarSaldo());

		Cuenta cta1 = new CuentaComitente();
		((CuentaComitente)cta1).extraer(20);
		((CuentaComitente)cta1).extraer(20, "abc");
		
	}

}
