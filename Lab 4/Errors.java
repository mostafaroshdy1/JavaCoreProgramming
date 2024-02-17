public class Errors {
    public  String intParserErrorStr(String str) throws ThrowErrorMessage {
        if (str.matches("-?\\d+")){
          return str;
        }else{
          throw new ThrowErrorMessage("Error: couldn't parse string to int");
        }
    }
    public  int numberCheck(int num) throws ThrowErrorMessage {
         if(num<0){
          throw new ThrowErrorMessage("Error: Number can not be negative");
        }else {
          return num;
        }   
    }
    public  void argumentCheck(String args[]) throws ThrowErrorMessage {
         if(args.length!=1){
          throw new ThrowErrorMessage("Error: The app needs exactly 1 Number argument");
        }  
    }
}
