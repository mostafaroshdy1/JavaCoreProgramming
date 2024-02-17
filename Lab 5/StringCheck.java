class StringCheck{
  public static void main(String args[]){
    if(args.length!=2){
      System.out.println("The app requires exactly 2 strings");
    }else{
      StringActions strTest=(str1,str2)->str1.length()>str2.length();
      if(strTest.betterString(args[0],args[1])){
        System.out.println("The First String in larger than the second length");
      }else{
        System.out.println("The Second String in larger than the First length");
      }
      
    }
  }
}
