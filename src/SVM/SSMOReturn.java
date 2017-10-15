package SVM;

public class SSMOReturn {
	public double[] lambdas;
	public double b;
	
	public SSMOReturn() {
	}
	public SSMOReturn(double[] l, double b) {
		this.lambdas = l;
		this.b = b;
	}
}
