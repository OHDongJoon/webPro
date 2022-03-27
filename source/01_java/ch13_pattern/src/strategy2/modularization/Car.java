package strategy2.modularization;
// 3���� ��ǰ ���� / ������X / drive(�Ϲ�), shape(�߻�), engine(�Ϲ�), km(�Ϲ�), fuel(�Ϲ�), setter 
import strategy2.interfaces.*;
public abstract class Car {
	private IEngine engine;// 3���� ��ǰ ����
	private IKm     km;
	private IFuel   fuel;
	public void drive() {
		System.out.println("����̺� �� �� �ֽ��ϴ�");
	}
	public abstract void shape();
	public void engine() {
		engine.engine();
	}
	public void km() {
		km.km();
	}
	public void fuel() {
		fuel.fuel();
	}
	public void setEngine(IEngine engine) {this.engine = engine;}
	public void setKm(IKm km) {this.km = km;}
	public void setFuel(IFuel fuel) {this.fuel = fuel;}
}
