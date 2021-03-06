package com.pelleplutt.comm;

public interface Callback {
	public int ack(CommArgument rx, byte[] data);
	
	public int rx(CommArgument rx, byte[] data, int offset);
	
	public void inf(CommArgument rx);
	
	public void error(CommArgument a, boolean txOtherwiseRx, int error);
	
	public void nodeAlert(int commAddress, int type, byte[] extra);
	
	public long getTime();
	
	public void registerComm(Comm comm);

	public long getAndAddTime();
}
