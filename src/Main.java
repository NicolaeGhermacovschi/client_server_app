//public class Main {
//    public static void main(String[] args) {
//        System.out.println("Hello world!");
//        Thread serverThread = new Thread(() -> {
//            MTServer server = new MTServer();
//            server.start();
//        });
//        serverThread.start();
//
//        // Crează și pornește clientul într-un fir de execuție separat
//        Thread clientThread = new Thread(() -> {
//            Client client = new Client();
//            client.start();
//        });
//        clientThread.start();
//    }
//}