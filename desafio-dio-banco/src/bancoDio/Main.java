package bancoDio;

import java.util.ArrayList;
import java.util.List;

import bancoDio.contas.Cliente;
import bancoDio.contas.Conta;
import bancoDio.contas.ContaCorrente;
import bancoDio.contas.ContaPoupanca;

public class Main {
	public static void main(String[] args) {
		Cliente Neildo = new Cliente();
		Neildo.setNome("Neildo Inacio do nascimento junior");
		Conta cc = new ContaCorrente(Neildo);
		Conta cp = new ContaPoupanca(Neildo);
		
		cc.depositar(1000);
		System.out.println("                    ");
		cp.depositar(200);
		
		cc.imprimirExtrato();
		System.out.println("                    ");
		cp.imprimirExtrato();
	
	}
}

