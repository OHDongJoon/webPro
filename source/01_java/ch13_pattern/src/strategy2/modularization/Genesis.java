package strategy2.modularization;
import strategy2.interfaces.*;
//��ӹ��� ��� : 3���� ��ǰ ���� /  drive(�Ϲ�), shape(�߻�), engine(�Ϲ�), km(�Ϲ�), fuel(�Ϲ�), setter
public class Genesis extends Car {
	public Genesis() {
		setEngine(new EngineHigh());//engine = new EngineHigh();
		setKm(new Km10());          //km = new Km10();
		setFuel(new FuelGasoline());//fuel = new FuelGasoline();
	}
	@Override
	public void shape() {
		System.out.println("���׽�Ʈ ����� door, sheet, handle�� �̷���� �ֽ��ϴ�.");
	}
}