import java.util.StringTokenizer;
class Splitter{
  public static void main(String args[]){
  if(args.length!=2){
    System.out.println("The app need 2 arguments");
    return;
  }
    StringTokenizer tokenizer = new StringTokenizer(args[0], args[1]);
    while (tokenizer.hasMoreTokens()) {
      System.out.println(tokenizer.nextToken());
    }
  }
}
