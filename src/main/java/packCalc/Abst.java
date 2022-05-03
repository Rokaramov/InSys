package packCalc;

public abstract class Abst {
	 
	 double a;
	 double b;
	 double c;
	 double d;
  
    Abst(double first, double second, double third, double fourth){
   	 a=first;
   	 b=second;
   	 c=third;
   	 d=fourth;
    }
    abstract double calc();
}
