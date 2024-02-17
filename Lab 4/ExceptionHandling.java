class ThrowErrorMessage extends Exception {
    public ThrowErrorMessage(String msg) {
        super(msg);
    }
}

class Errors {
    public static String intParserErrorStr(String str) throws ThrowErrorMessage {
        if (str.matches("\\d+")){
          return str;
        }else{
          throw new ThrowErrorMessage("Error: couldn't parse string to int");
        }
    }
    public static int numberCheck(int num) throws ThrowErrorMessage {
         if(num<0){
          throw new ThrowErrorMessage("Error: Number can not be negative");
        }else {
          return num;
        }
        
    }
}

class Factorial {
    public static void main(String args[]) {
    /*
      if(args.length!=1){
      System.out.println("The app needs exactly 1 Number argument");
      System.exit(1);
      }
      if (args.length > 0 && args[0].matches("\\d+")) {
        int number=integer.parseInt(args[0]);
        int factorial = 1;
        if(number<0){
          Errors.invalidNegativeValue();
        }
         for (int i = 1; i <= number; i++) {
          factorial *= i;
         }
        System.out.println("Factorial of " + number + " is: " + factorial);
        } else {
            Errors.intParserErrorString();
        }
*/
        try{
          Errors.intParserErrorStr(args[0]);
        }catch(ThrowErrorMessage e){
          e.printStackTrace();         
        }
    }
}

