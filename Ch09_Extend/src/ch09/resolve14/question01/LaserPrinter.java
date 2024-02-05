package ch09.resolve14.question01;

public class LaserPrinter extends Printer {
	
	protected double LaserPrinter;

	public LaserPrinter(String modelName, String manuFacturer, P_INTERFACE pInterface, int printCount,
			int paperRemains, double LaserPrinter) {
		super(modelName, manuFacturer, pInterface, printCount, paperRemains);
		this.LaserPrinter = LaserPrinter;
	}

	@Override
	public void print() {
		
		super.print();
		this.printCount++;
		System.out.println("빠르게 출력된다.");
		System.out.println("품질이 매우 양호하다.");
	}

	@Override
	public String toString() {
		return "LaserPrinter [tonnerRemainders=" + LaserPrinter + ", modelName=" + modelName + ", manuFacturer="
				+ manuFacturer + ", pInterface=" + pInterface + ", printCount=" + printCount + ", paperRemains="
				+ paperRemains + "]";
	}
	


}
