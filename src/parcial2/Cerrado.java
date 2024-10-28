package parcial2;

public class Cerrado implements EstadoPóliza {

	@Override
	public void agregarÍtem(Póliza póliza, ÍtemPóliza ítem) {
		póliza.finalizarAgregarÍtem(ítem);
		póliza.recargoPorExtensión(ítem);
	}

	@Override
	public void cerrarInventario(Póliza póliza) {
		// TODO Auto-generated method stub

	}

	@Override
	public void pagar(Póliza póliza) {
		póliza.setEstado(new Vigente());

	}

	@Override
	public void cancelar(Póliza póliza) {
		// TODO Auto-generated method stub

	}

	@Override
	public void aplicarDescuento(Póliza póliza) {
		póliza.eliminarGastoAdministrativoDeMayorValor();

	}

}
