class Wordcounter{
  public static void main(String args[]){
  if(args.length!=2){
    System.out.println("The app need 2 arguments");
    return;
  }
    String splited[]=args[0].split(" ");
    int count=0;
    for(int i=0;i<splited.length;i++){
      if(args[1].equals(splited[i])){
        count++;
      }
    }
    System.out.println(count);
  }
}
