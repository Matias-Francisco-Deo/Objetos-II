package claseIteradoresStreams;

import static org.mockito.Mockito.*;

public enum ColorDerma {
	Rojo("Sangrante", 10), Gris("Mejorando", 7), Amarillo("Ya casi", 4), Miel("Recurperada", 2);

	ColorDerma(String string, int i) {
	}
	
	public ColorDerma darSig() {
		return ColorDerma.values()[this.ordinal()+1 % (ColorDerma.values().length)];
	}
	
}
