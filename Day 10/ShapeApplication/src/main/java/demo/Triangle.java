package demo;

public class Triangle {
	private Point p3;
	private Point p4;
	private Point p5;

	public void setP1(Point p3) {
		this.p3 = p3;
	}
	
	public Point getP1() {
		return p3;
	}

	public void setP2(Point p4) {
		this.p4 = p4;
	}
	
	public Point getP2() {
		return p4;
	}

	public void setP3(Point p5) {
		this.p5 = p5;
	}
	
	public Point getP3() {
		return p5;
	}

	@Override
	public String toString() {
		return "Triangle [p1=" + p3 + ", p2=" + p4 + ", p3=" + p5 + ", getP1()=" + getP1() + ", getP2()=" + getP2()
				+ ", getP3()=" + getP3() + "]";
	}
	
}
