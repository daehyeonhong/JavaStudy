package Test0511.Parking;

public class Vehicle {
	final int MAX_FEE = 50000;
	Kind kind;
	int feePerTime;
	int intTime;
	int outTime;

	public Vehicle(String kind, int feePerTime, int intTime, int outTime) {
		this.kind = Kind.valueOf(kind);
		this.feePerTime = feePerTime;
		this.intTime = intTime;
		this.outTime = outTime;
	}

	public Vehicle(String kind, int intTime, int outTime) {
		this.kind = Kind.valueOf(kind);
		this.intTime = intTime;
		this.outTime = outTime;
	}

	int calcTime() {
		return 0;
	}

	final int calcFee() {
		int time = calcTime();
		if (time > 12)
			return MAX_FEE;
		else {
			return time * getFeePerTime();
		}
	}

	int getFeePerTime() {
		return feePerTime;
	}

	void print() {
		System.out.println("================");
		System.out.println("차종:" + kind);
		System.out.println("주차시간:" + calcTime());
		System.out.println("주차요금:" + calcFee());
	}

}
