package parcial2;

public class Abierto implements EstadoPóliza {

	@Override
	public void cerrarInventario(Póliza póliza) {
		póliza.setEstado(new Cerrado());

	}

	@Override
	public void pagar(Póliza póliza) {
		// TODO Auto-generated method stub

	}

	@Override
	public void cancelar(Póliza póliza) {
		// TODO Auto-generated method stub

	}

	@Override
	public void agregarÍtem(Póliza póliza, ÍtemPóliza ítem) {
		póliza.finalizarAgregarÍtem(ítem);

	}

	@Override
	public void aplicarDescuento(Póliza póliza) {
		póliza.agregarBonificaciónAdministrativa();
	}

}
