class Example3{
  public static void main(String args[]){
  if(args.length!=2){
    System.out.println("The app need 2 arguments");
  }else{
      for(int i=0;i<Integer.parseInt(args[0]);i++){
        System.out.println(args[1]);
      }
    }
  }
}
