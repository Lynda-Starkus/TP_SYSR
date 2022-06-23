package com.example.tp;


public interface ProcessConnection {
	
	public void sendMessage(Message message);
	public void sendMessage(Message message, ResponseEvent e);
	
	public VectorClock getVclock();
	
	public String getPid();

}
