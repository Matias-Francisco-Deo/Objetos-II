package tpstatestrategy;

import java.util.Arrays;

public class EncriptadorSiguienteVocal implements Encriptador {

	@Override
	public String encriptar(String string) {
		String[] chars = string.split("");
		String[] stringEncriptado = new String[chars.length];
		int count = 0;
		for (String car : chars) {
			if (Character.isLetter(car.charAt(0))) {
				stringEncriptado[count] = String.valueOf((char) (car.charAt(0) + 1));
			} else {
				stringEncriptado[count] = car;
			}
			count++;
		}
		Arrays.toString(stringEncriptado);
		return String.join("", stringEncriptado);

	}

	@Override
	public String desencriptar(String string) {
		String[] chars = string.split("");
		String[] stringEncriptado = new String[chars.length];
		int count = 0;
		for (String car : chars) {
			if (Character.isLetter(car.charAt(0))) {
				stringEncriptado[count] = String.valueOf((char) (car.charAt(0) - 1));
			} else {
				stringEncriptado[count] = car;
			}
			count++;
		}
		Arrays.toString(stringEncriptado);
		return String.join("", stringEncriptado);
	}

}
