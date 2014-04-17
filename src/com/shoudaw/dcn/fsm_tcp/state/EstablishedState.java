package com.shoudaw.dcn.fsm_tcp.state;

import Fsm.*;

public class EstablishedState extends State{
	
	/**
	 * the number of SDATA or RDATA Events received to date
	 */
	public int numR;
	public int numS;
	
	public int getNumR(){
		return numR;
	}
	public int getNumS(){
		return numS;
	}
	
	public void increaseNumR(){
		this.numR++;
	}
	public void increaseNumS(){
		this.numS++;
	}
	
	public EstablishedState(String name) {
		super(name);
	}

}






