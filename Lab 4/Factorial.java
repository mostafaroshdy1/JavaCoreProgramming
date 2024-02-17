public class Factorial {
    public static void main(String args[]) {
        try{
          Errors error=new Errors();
          error.argumentCheck(args);
          error.numberCheck(Integer.parseInt(error.intParserErrorStr(args[0])));
          int number=Integer.parseInt(args[0]);
          int factorial = 1;
          for (int i = 1; i <= number; i++) {
           factorial *= i;
          }
          System.out.println("Factorial of " + number + " is: " + factorial);
        }catch(ThrowErrorMessage e){
          e.printStackTrace();         
        }
    }
}

