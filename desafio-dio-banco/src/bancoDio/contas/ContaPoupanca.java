package bancoDio.contas;

public class ContaPoupanca extends Conta {

	public ContaPoupanca(Cliente cliente) {
		super(cliente);
	}

	@Override
	public void imprimirExtrato() {
		System.out.println(" -Extrato da conta Poupanca -");
		super.imprimirInfosExtratos();
	}	
}


