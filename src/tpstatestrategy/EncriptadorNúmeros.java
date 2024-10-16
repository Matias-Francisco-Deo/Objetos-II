package tpstatestrategy;

import java.util.Arrays;

public class EncriptadorNúmeros implements Encriptador {

	@Override
	public String encriptar(String string) {
		String[] chars = string.split("");
		String[] stringEncriptado = new String[chars.length];
		int count = 0;
		for (String car : chars) {
			if (Character.isLetter(car.charAt(0))) {
				stringEncriptado[count] = "" + (car.charAt(0) - 96);
			} else if (Character.isSpaceChar(car.charAt(0))) {
				stringEncriptado[count] = "0";
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
			if (car.charAt(0) != '0' && Character.isDigit(car.charAt(0))) {
				String str = String.valueOf((char) (car.charAt(0) + 48));
				stringEncriptado[count] = str;
			} else if (car.charAt(0) == '0') {
				stringEncriptado[count] = " ";
			} else {
				stringEncriptado[count] = car;
			}
			count++;
		}
		Arrays.toString(stringEncriptado);
		return String.join("", stringEncriptado);
	}

}
