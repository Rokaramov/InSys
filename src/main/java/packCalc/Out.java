package packCalc;

public class Out extends Abst{
	  Out(double first, double second, double third, double fourth){
		  super(first, second,third,fourth);
	  }
	@Override
	double calc() {
  	  return ((a - d) * (b/12)) / (1 - Math.pow(1 + (b/12), -(c*12)));
	}
}