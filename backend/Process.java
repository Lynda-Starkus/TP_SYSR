import java.util.ArrayList;
import java.util.Collections;


public class Process extends Thread{

    private String ip;
    private int port;
    private int pid;
    private int clock;
    private ArrayList<Message> messages;
    private Client client;
    private Server server;
    private boolean sharedResource;
    private int resourceName;


    public Process(String ip ,int port, int pid){
        this.ip = ip;
        this.port = port;
        this.pid = pid;
        this.clock = 0;
        this.messages = new ArrayList<Message>();
        this.sharedResource = false;
        this.resourceName = 0;
        this.client = new Client(this);
    }

    public void addResourceName(){ this.resourceName++; }

    public int getClock() {
        return clock;
    }

    public int getPid() {
        return pid;
    }

    public int getResourceName() {
        return resourceName;
    }

    public boolean isSharedResource() {
        return sharedResource;
    }

    public void setSharedResource(int resourceName, boolean sharedResource) {
        this.resourceName = resourceName;
        this.sharedResource = sharedResource;
    }

    public void startListening(){
        this.server = new Server(port,this);
        server.start();
        this.client.connect(ip, port);
    }

    public void connect(String ip, int port) {
        this.client.connect(ip, port);
    }

    public void sendMessage(){
        client.start();
    }

    public void sendAnotherMessage(){
        try {
            Thread.sleep(150);
            client.sendMessage();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void addClock(){
        this.clock++;
    }

    public void addMessage(Message message){
        messages.add(message);
        Collections.sort(messages);
        for (Message m: messages){
            System.out.print("Processus  "+pid+" reçu ! ");
            m.printMessage();
        }
    }

    public void printMessages() {
        System.out.println("\n\nMesages que le processus  " + this.pid + " a reçu.");
        for (Message message: messages){
            message.printMessage();
        }
    }

    public void updateClock(int clockFromMessage){
        this.clock = Math.max(this.clock, clockFromMessage);
    }

    public boolean askPermission(int resourceName, int messagePid){
        if ((this.sharedResource) && (this.resourceName == resourceName) && (this.pid < messagePid)){
            return false;
        }else{
            return true;
        }
    }

    @Override
    public void run(){
        startListening();
    }

    public void closeConnection(){
        server.closeConnection();
        client.closeConnection();
    }

}
