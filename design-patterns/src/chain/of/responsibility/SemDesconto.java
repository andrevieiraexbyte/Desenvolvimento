package chain.of.responsibility;

public class SemDesconto implements Desconto {

	@Override
	public double desconta(Orcamento orcamento) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setProximo(Desconto proximo) {
		// n�o tem proximo
	}

}
