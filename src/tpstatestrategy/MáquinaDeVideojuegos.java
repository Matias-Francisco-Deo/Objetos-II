package tpstatestrategy;

public class MáquinaDeVideojuegos {
	Estado estado = new Apagado();
	BotónDeInicio botón = new BotónDeInicio();
	Ranura ranura = new Ranura();

	public void encender() {
		System.out.print("INSERTAR FICHA");
		estado = new StandBy();
	}

	public void pulsarBotónInicio() {
		botón.pulsar(this);
	}

	public void recibirFicha(Ficha ficha) {
		ranura.recibirFicha(ficha, this);
	}

	public Estado getEstado() {
		// TODO Auto-generated method stub
		return estado;
	}

	public void setEstado(Estado estado) {
		// TODO Auto-generated method stub
		this.estado = estado;
	}

	public void terminarPartida() {
		estado = new StandBy();

	}

}
