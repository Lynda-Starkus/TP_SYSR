/**
 * Created on 03/09/15.
 * by
 * João Pedro M. G. Dias 511455
 * Andre Luiz Beltrami 489611
 */

public class Main {

    public static void main(String args[]){

        Process p1 = new Process("localhost",3001,1);
        Process p2 = new Process("localhost",3002,2);
        Process p3 = new Process("localhost",3003,3);
        Process p4 = new Process("localhost",3004,4);
        Process p5 = new Process("localhost",3005,5);
        Process p6 = new Process("localhost",3006,6);
        Process p7 = new Process("localhost",3007,7);
        Process p8 = new Process("localhost",3008,8);
        Process p9 = new Process("localhost",3009,9);
        Process p10 = new Process("localhost",3010,10);

        p1.start();
        p2.start();
        p3.start();
        p4.start();
        p5.start();
        p6.start();
        p7.start();
        p8.start();
        p9.start();
        p10.start();

        p1.connect("localhost", 3002);
        p1.connect("localhost", 3003);
        p1.connect("localhost", 3004);
        p1.connect("localhost", 3005);
        p1.connect("localhost", 3006);
        p1.connect("localhost", 3007);
        p1.connect("localhost", 3008);
        p1.connect("localhost", 3009);
        p1.connect("localhost", 3010);

        p2.connect("localhost", 3001);
        p2.connect("localhost", 3003);
        p2.connect("localhost", 3004);
        p2.connect("localhost", 3005);
        p2.connect("localhost", 3006);
        p2.connect("localhost", 3007);
        p2.connect("localhost", 3008);
        p2.connect("localhost", 3009);
        p2.connect("localhost", 3010);

        p3.connect("localhost", 3001);
        p3.connect("localhost", 3002);
        p3.connect("localhost", 3004);
        p3.connect("localhost", 3005);
        p3.connect("localhost", 3006);
        p3.connect("localhost", 3007);
        p3.connect("localhost", 3008);
        p3.connect("localhost", 3009);
        p3.connect("localhost", 3010);

        p4.connect("localhost", 3001);
        p4.connect("localhost", 3002);
        p4.connect("localhost", 3003);
        p4.connect("localhost", 3005);
        p4.connect("localhost", 3006);
        p4.connect("localhost", 3007);
        p4.connect("localhost", 3008);
        p4.connect("localhost", 3009);
        p4.connect("localhost", 3010);

        p5.connect("localhost", 3001);
        p5.connect("localhost", 3002);
        p5.connect("localhost", 3003);
        p5.connect("localhost", 3004);
        p5.connect("localhost", 3006);
        p5.connect("localhost", 3007);
        p5.connect("localhost", 3008);
        p5.connect("localhost", 3009);
        p5.connect("localhost", 3010);

        p6.connect("localhost", 3001);
        p6.connect("localhost", 3002);
        p6.connect("localhost", 3003);
        p6.connect("localhost", 3004);
        p6.connect("localhost", 3005);
        p6.connect("localhost", 3007);
        p6.connect("localhost", 3008);
        p6.connect("localhost", 3009);
        p6.connect("localhost", 3010);

        p7.connect("localhost", 3001);
        p7.connect("localhost", 3002);
        p7.connect("localhost", 3003);
        p7.connect("localhost", 3004);
        p7.connect("localhost", 3005);
        p7.connect("localhost", 3006);
        p7.connect("localhost", 3008);
        p7.connect("localhost", 3009);
        p7.connect("localhost", 3010);

        p8.connect("localhost", 3001);
        p8.connect("localhost", 3002);
        p8.connect("localhost", 3003);
        p8.connect("localhost", 3004);
        p8.connect("localhost", 3005);
        p8.connect("localhost", 3006);
        p8.connect("localhost", 3007);
        p8.connect("localhost", 3009);
        p8.connect("localhost", 3010);

        p9.connect("localhost", 3001);
        p9.connect("localhost", 3002);
        p9.connect("localhost", 3003);
        p9.connect("localhost", 3004);
        p9.connect("localhost", 3005);
        p9.connect("localhost", 3006);
        p9.connect("localhost", 3007);
        p9.connect("localhost", 3008);
        p9.connect("localhost", 3010);

        p10.connect("localhost", 3001);
        p10.connect("localhost", 3002);
        p10.connect("localhost", 3003);
        p10.connect("localhost", 3004);
        p10.connect("localhost", 3005);
        p10.connect("localhost", 3006);
        p10.connect("localhost", 3007);
        p10.connect("localhost", 3008);
        p10.connect("localhost", 3009);









        p1.setSharedResource(1, true);
        p2.setSharedResource(1, true);
        p3.setSharedResource(1, true);
        p4.setSharedResource(1, true);
        p5.setSharedResource(1, true);
        p6.setSharedResource(1, true);
        p7.setSharedResource(1, true);
        p8.setSharedResource(1, true);
        p9.setSharedResource(1, true);
        p10.setSharedResource(1, true);


//        Sends a message and starts a new thread for client
        p10.sendMessage();
        p9.sendMessage();
        p8.sendMessage();
        p7.sendMessage();
        p6.sendMessage();
        p5.sendMessage();
        p4.sendMessage();
        p3.sendMessage();
        p2.sendMessage();
        p1.sendMessage();
//        Sends a message
        p10.sendAnotherMessage();
        p9.sendAnotherMessage();
        p8.sendAnotherMessage();
        p7.sendAnotherMessage();
        p6.sendAnotherMessage();
        p5.sendAnotherMessage();
        p4.sendAnotherMessage();
        p3.sendAnotherMessage();
        p2.sendAnotherMessage();
        p1.sendAnotherMessage();

        try {
            Thread.sleep(150);
            p1.printMessages();
            Thread.sleep(150);
            p2.printMessages();
            Thread.sleep(150);
            p3.printMessages();
            Thread.sleep(150);
            p4.printMessages();
            Thread.sleep(150);
            p5.printMessages();
            Thread.sleep(150);
            p6.printMessages();
            Thread.sleep(150);
            p7.printMessages();
            Thread.sleep(150);
            p8.printMessages();
            Thread.sleep(150);
            p9.printMessages();
            Thread.sleep(150);
            p10.printMessages();


        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.exit(0);
//        p1.closeConnection();
//        p2.closeConnection();
//        p3.closeConnection();
    }
}