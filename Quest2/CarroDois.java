package Quest2;

import java.util.*;

public class CarroDois {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);

		String ligar = "Não";
		Carro car = new Carro();

		car.setVelocidadeMaxima(250);
		car.setCor("Verde");
		car.setModelo("F12 TRS");
		car.ligar(ligar);

		System.out.println("Deseja Ligar o carro? (Sim ou Não)");
		ligar = read.nextLine();

		if (ligar.equals("S")) {
			car.ligar(ligar);
			System.out.println(car.getEstado());

			System.out.println("Qual a velocidade neste instante?");
			int kmPH = read.nextInt();
			car.acelerar(kmPH);

			for (; true;) {

				System.out.println("Qual a velocidade agora?");
				kmPH = read.nextInt();
				car.acelerar(kmPH);

				if (kmPH == 0) {
					System.out
							.println("Deseja manter o carro ligado? (Sim ou Não)");
					ligar = read.next();

					if (ligar.equals("Não")) {
						car.ligar(ligar);
						break;
					}
				}
			}

		}
		System.out.println(car.getEstado());

		read.close();
	}

}