class Ipaddress {
    public static void main(String args[]) {
      if (args.length != 1) {
      System.out.println("The app needs exactly 1 argument");
      return;
      }
      String ipAddress = args[0];
      String ipv4Pattern = "^((25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$";

      if (ipAddress.matches(ipv4Pattern)) {
        System.out.println("The provided IPv4 address is valid.");
         String splited[]=args[0].split("\\.");
         for(int i=0;i<splited.length;i++){
          System.out.println(splited[i]);
         }
      } else {
        System.out.println("The provided IPv4 address is not valid.");
      } 
    }
}

