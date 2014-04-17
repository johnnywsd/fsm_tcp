package com.shoudaw.dcn.fsm_tcp;

import Fsm.Event;
import com.shoudaw.dcn.fsm_tcp.event.*;


public class Events {
	public enum EventEnum {
	    PASSIVE, ACTIVE, SYN, SYNACK,
	    ACK, RDATA, SDATA, FIN, CLOSE, TIMEOUT
	}
		
	Event passiveEvent = new PassiveEvent(EventEnum.PASSIVE.toString());
	Event activeEvent = new PassiveEvent(EventEnum.ACTIVE.toString());
	Event synEvent = new SynEvent(EventEnum.SYN.toString());
	Event synAckEvent = new SynAck_e(EventEnum.SYNACK.toString());
	Event ackEvent= new AckEvent(EventEnum.ACK.toString());
	Event rDataEvent = new RDataEvent(EventEnum.RDATA.toString()); 
	Event sDataEvent = new SDataEvent(EventEnum.SDATA.toString());
	Event finEvent = new FinEvent(EventEnum.FIN.toString());
	Event closeEvent = new CloseEvent (EventEnum.CLOSE.toString());
	Event timeoutEvent = new TimeOutEvent(EventEnum.TIMEOUT.toString());
	
	/**
	 * Get the corresponding Event object based on user input
	 * @param event- input String from user input
	 * @return corresponding Event object or null if not valid
	 */
	public Event get(String event){
		
	if (event.equals(EventEnum.PASSIVE.toString()))
		return passiveEvent;
	else if (event.equals(EventEnum.ACTIVE.toString()))
		return activeEvent;
	else if (event.equals(EventEnum.SYN.toString()))
		return synEvent;
	else if (event.equals(EventEnum.SYNACK.toString()))
		return synAckEvent;
	else if (event.equals(EventEnum.ACK.toString()))
		return ackEvent;
	else if (event.equals(EventEnum.RDATA.toString()))
		return rDataEvent;
	else if (event.equals(EventEnum.SDATA.toString()))
		return sDataEvent;
	else if (event.equals(EventEnum.FIN.toString()))
		return finEvent;
	else if (event.equals(EventEnum.CLOSE.toString()))
		return closeEvent;
	else if(event.endsWith(EventEnum.TIMEOUT.toString()))
		return timeoutEvent;	
	else{		
		return null;
		}
	}
	

}
