package br.com.caelum.model.financeiro;

import java.util.ArrayList;
import java.util.List;

public class FiltradorDeGastosEspeciais {
	private int limite;

	public FiltradorDeGastosEspeciais(double d) {
		super();
		this.limite = (int) d;
	}

	public List<Gasto> filtraGastosGrandes(List<Gasto> gastos) {
		List<Gasto> gastosAcimaDoLimite = new ArrayList<Gasto>();
		for (Gasto gasto : gastos) {
			if (gasto.getValor() > this.limite)
				gastosAcimaDoLimite.add(gasto);
		}
		return gastosAcimaDoLimite;
	}
}
