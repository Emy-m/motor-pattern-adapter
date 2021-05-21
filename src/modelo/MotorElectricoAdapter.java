package modelo;

public class MotorElectricoAdapter implements Motor {

	private MotorElectrico motorElectrico;

	public MotorElectricoAdapter(MotorElectrico motorElectrico) {
		this.motorElectrico = motorElectrico;
	}

	@Override
	public void arrancar() {
		motorElectrico.conectarYActivar();
	}

	@Override
	public void apagar() {
		motorElectrico.detenerYDesconectar();
	}

	@Override
	public void acelerar() {
		motorElectrico.moverMasRapido();
	}

}
