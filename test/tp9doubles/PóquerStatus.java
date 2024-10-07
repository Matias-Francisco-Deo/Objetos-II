package tp9doubles;

import java.util.Arrays;
import java.util.List;

public class PóquerStatus {

	public String verificar(String carta1, String carta2, String carta3, String carta4, String carta5) {
		String jugadaFinal = "Nada";
		List<String> cartas = Arrays.asList(carta1, carta2, carta3, carta4, carta5);
		List<String> números = cartas.stream().map(
				carta -> (carta.charAt(0) == '1' && carta.charAt(1) == '0') ? "10" : String.valueOf(carta.charAt(0)))
				.toList();

		// Color
		List<Character> palos = cartas.stream()
				.map(carta -> (carta.charAt(1) == '0') ? carta.charAt(2) : carta.charAt(1)).toList();
		for (Character color : palos) {
			long val = 0;
			val = palos.stream().filter(carta -> carta == color).count();
			if (val == 5) {
				return "Color";
			}
		}

		// Trío o Póquer
		for (String número : números) {
			long val = 0;
			val = números.stream().filter(carta -> carta == número).count();
			if (val == 4) {
				return "Póquer";
			}
			if (val == 3) {
				jugadaFinal = "Trío";
			}
		}
		return jugadaFinal;
	}
}
