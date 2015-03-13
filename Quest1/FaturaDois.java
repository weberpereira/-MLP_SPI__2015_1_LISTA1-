package Quest1;

public class FaturaDois {

	public static void main(String[] args) {

		Fatura fat = new Fatura();

		fat.setNumero("1");
		fat.setDescricao("Roteador");
		fat.setQuantidadeDeItens(1);
		fat.setPrecoPorItem(-200);

		System.out
				.printf("Descrição da compra: %n%nCodigo Produto: %s%nDescrição: %s%n"
						+ "Quantidade: %d%nValor: R$ %.2f%nValor Total: R$ %.2f%n",
						fat.getNumero(), fat.getDescricao(),
						fat.getQuantidadeDeItens(), fat.getPrecoPorItem(),
						fat.getValorFatura());

	}

}