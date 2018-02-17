package br.com.caelum.model.financeiro;

import static org.junit.Assert.assertEquals;
 
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;


import org.junit.Test;

public class FiltradorDeGastosEspeciaisTest {

	private int limite;

	@Test
	public void soDevolveGastosComValorMaiorQueOLimite() throws Exception {
		Funcionario funcionario = new Funcionario("Felipe", 123, new GregorianCalendar(1989, 3, 17));
		Calendar hoje = Calendar.getInstance();

		Gasto g1 = new Gasto(25.0, "almoco", funcionario, hoje);
		Gasto g2 = new Gasto(150.0, "jantar", funcionario, hoje);
		Gasto g3 = new Gasto(22.0, "extras", funcionario, hoje);
		List<Gasto> lista = Arrays.asList(g1, g2, g3);

		FiltradorDeGastosEspeciais filtrador = new FiltradorDeGastosEspeciais(25.0);
		List<Gasto> gastosGrandes = filtrador.filtraGastosGrandes(lista);

		assertEquals(1, gastosGrandes.size());
		assertEquals(150.0, gastosGrandes.get(0).getValor(), 0.00001);
		
		
		if(g1.getValor() >= this.limite);
	}
}
