package tp9doubles;

import java.util.Arrays;
import java.util.List;

public class PóquerStatus {

	public Jugada verificar(Carta carta1, Carta carta2, Carta carta3, Carta carta4, Carta carta5) {
		Jugada jugadaFinal;
		List<Carta> cartas = Arrays.asList(carta1, carta2, carta3, carta4, carta5);

		long colorContado = igualColor(cartas);
		long igualValorContado = igualValor(cartas);

		if (colorContado == 5) {
			jugadaFinal = new JugadaColor(carta1, carta2, carta3, carta4, carta5);
		} else if (igualValorContado == 3) {
			// técnicamente no está bien, ya que cada jugada debería solamente contener las
			// cartas de la jugada, pero bueno
			jugadaFinal = new JugadaTrío(carta1, carta2, carta3);
		} else if (igualValorContado == 4) {
			jugadaFinal = new JugadaPóquer(carta1, carta2, carta3, carta4);
		} else {
			jugadaFinal = new JugadaNada();
		}
		return jugadaFinal;

	}

	private long igualColor(List<Carta> cartas) {
		long total = 0;
		for (Carta cart : cartas) {
			long colorContado = 0;
			colorContado = cartas.stream().filter(carta -> carta.esMismoPalo(cart)).count();
			if (colorContado > total) {
				total = colorContado;
			}
		}
		return total;
	}

	private long igualValor(List<Carta> cartas) {
		long total = 0;
		for (Carta cart : cartas) {
			long igualValorContado = 0;
			igualValorContado = cartas.stream().filter(carta -> carta.getValor() == cart.getValor()).count();
			if (igualValorContado > total) {
				total = igualValorContado;
			}
		}
		return total;
	}

//		List<String> números = cartas.stream().map(
//				carta -> (carta.charAt(0) == '1' && carta.charAt(1) == '0') ? "10" : String.valueOf(carta.charAt(0)))
//				.toList();
//
//		// Color
//		List<Character> palos = cartas.stream()
//				.map(carta -> (carta.charAt(1) == '0') ? carta.charAt(2) : carta.charAt(1)).toList();
//		for (Character color : palos) {
//			long val = 0;
//			val = palos.stream().filter(carta -> carta == color).count();
//			if (val == 5) {
//				return "Color";
//			}
//		}

	// Trío o Póquer
//		for (String número : números) {
//			long val = 0;
//			val = números.stream().filter(carta -> carta == número).count();
//			if (val == 4) {
//				return "Póquer";
//			}
//			if (val == 3) {
//				jugadaFinal = "Trío";
//			}
//		}
//		return jugadaFinal;
//	}
}
