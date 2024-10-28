package parcial2;

public class Vigente implements EstadoPóliza {

	@Override
	public void agregarÍtem(Póliza póliza, ÍtemPóliza ítem) {
		// TODO Auto-generated method stub

	}

	@Override
	public void cerrarInventario(Póliza póliza) {
		// TODO Auto-generated method stub

	}

	@Override
	public void pagar(Póliza póliza) {
		// TODO Auto-generated method stub

	}

	@Override
	public void cancelar(Póliza póliza) {
		póliza.eliminarGastosAdministrativos();
		póliza.setEstado(new Abierto());

	}

	@Override
	public void aplicarDescuento(Póliza póliza) {
		póliza.eliminarGastosAdministrativos();

	}

}
