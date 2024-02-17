class Example1{
  public static void main(String args[]){
    System.out.println("Hello From First Java App");
    System.out.println("Hello "+args[0]);
    int i;
    for(i=0;i<Integer.parseInt(args[1]);i++){
      System.out.println(args[2]);
    }
  }
}
