package strategy1.step4.modularization;
// 4�ܰ� : ����� ��ǰȭ
public class TestMain {
	public static void main(String[] args) {
		Robot    superR = new SuperRobot();
		Robot standardR = new StandardRobot();
		Robot      lowR = new LowRobot();
		Robot[] robots = {superR, standardR, lowR};
		for(Robot robot : robots) {
			robot.shape();
			robot.actionWalk();
			robot.actionRun();
			robot.actionFly();
			robot.actionMissile();
			robot.actionKnife();
		}
		// lowR.setFly(new FlyYes()); 5�ܰ迡�� �ذ�
	}
}
