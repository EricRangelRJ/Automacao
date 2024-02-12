package br.com.alho.steps;
import org.junit.Assert;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;

public class ContadorSteps {
	

	private Integer contador;
	
	@Dado("que o valor do contador é {int}")
	public void queOValorDoContadorÉ(Integer int1) {
		contador = int1;
	}
	@Quando("eu incrementar em {int}")
	public void euIncrementarEm(Integer int1) {
		contador = contador + int1;
	}
	@Então("o valor do contador será {int}")
	public void oValorDoContadorSerá(Integer int1) {
//		Assert.assertTrue(int1.equals(contador));
		Assert.assertEquals(contador, int1);
	}




}
