@FunctionalInterface
interface Convert<T,R>{
  R convert(T num);
}
class ConvertToFahrenheit implements Convert<Double,Double>{
  public  Double convert(Double num) {
    return num+32;
  }
}
class Temperature {
  public static void main(String args[]){
    if(args.length!=1){
      System.out.println("The app needs exactly one argument");
      return;
    }
    ConvertToFahrenheit temp = new ConvertToFahrenheit();
    
    System.out.println(temp.convert(new Double(args[0])));
  }
}
