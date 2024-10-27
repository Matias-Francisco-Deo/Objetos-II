package parciales;

public class SecretaríaAdapter extends SecretaríaDeInfraestructura implements Secretaría {

	@Override
	public float montoTotal() {
		return this.inversiónTotal();
	}

}
