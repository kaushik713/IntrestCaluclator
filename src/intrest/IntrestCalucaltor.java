package intrest;

public class IntrestCalucaltor {
	public double simpleInterest(double profit,double time,double rate) {
		return ((profit * rate * time) / 100);
	}
	
	public double compoundInterest(double profit,double time,double rate) {
		return (profit * Math.pow((1 + (rate / 100)), time));
	}
  

}
