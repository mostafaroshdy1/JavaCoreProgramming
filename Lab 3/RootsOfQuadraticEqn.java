import java.lang.Math;
class RootsOfQuadraticEqn{
  public static void main(String args[]){
    if(args.length!=3){
      System.out.println("The app needs exactly 3 argument");
    }else{
  Quadratic q1= new Quadratic();
  Parameters eqn=new Parameters(Double.parseDouble(args[0]),Double.parseDouble(args[1]),Double.parseDouble(args[2]));
  q1.apply(eqn);
    if(q1.apply(eqn).isSolved()){
    System.out.println("Root1= "+q1.apply(eqn).getRoot1R()+" Root2= "+q1.apply(eqn).getRoot2R());
   }else{
    System.out.println("Root1= " + q1.apply(eqn).getRoot1R() + "+" + q1.apply(eqn).getRoot1I() + "i");
    System.out.println("Root2= " + q1.apply(eqn).getRoot2R() + "+" + q1.apply(eqn).getRoot2I() + "i");
   }
    }
  }
}

class Parameters {
    private double a;
    private double b;
    private double c;

    public Parameters(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    // Getter methods
    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }
}

class Roots {
    private double root1R;
    private double root2R;
    private double root1I;
    private double root2I;
    private boolean solved;

    public Roots(double root1R, double root2R, double root1I, double root2I, boolean solved) {
        this.root1R = root1R;
        this.root2I = root2I;
        this.root2R = root2R;
        this.root1I = root1I;
        this.solved = solved;
    }

    // Getter methods
    public double getRoot1R() {
        return root1R;
    }
    public double getRoot2R() {
        return root2R;
    }

    public double getRoot1I() {
        return root1I;
    }

    public double getRoot2I() {
        return root2I;
    }

    public boolean isSolved() {
        return solved;
    }
}

