
public class AtualizadorDeContas {

		private double saldoTotal = 0;
		private double selic;
		
		public AtualizadorDeContas(double selic) {//a selic deve ser iniciada no criação do objeto
			this.selic = selic;
		}
		
		public void roda(Conta c) {
			System.out.println("Saldo atual: "+c.saldo);
			c.atualiza(this.selic);
			System.out.println("Atualizado com taxa selic: "+c.getSaldo());
			this.saldoTotal += c.getSaldo();
			
			
		}
		
		public double getSaldoTotal() {
			return this.saldoTotal;
		}
}
