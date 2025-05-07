public class MulticastChatServer {

    public static void main(String args[])
        throws Exception {

    //Default port number we are going to use
    int portnumber = 5000;
    if (args.length >= 1){
        portnumber = Integer.parseInt(args[0]);
    }
    }
}
