package com.shoudaw.dcn.fsm_tcp.action;

import com.shoudaw.dcn.fsm_tcp.state.EstablishedState;
import com.shoudaw.dcn.fsm_tcp.event.RDataEvent;
import com.shoudaw.dcn.fsm_tcp.event.SDataEvent;
import Fsm.*;

public class Action_impl extends Fsm.Action{

	@Override
	public void execute(FSM fsm, Event event) {
		
		State currentState = fsm.currentState(); 
		
		if (event instanceof RDataEvent)
		{	
			EstablishedState state = (EstablishedState) currentState;
			state.increaseNumR();
			System.out.println("DATA received "+ state.getNumR());
		}else if (event instanceof SDataEvent)
		{	
			EstablishedState state = (EstablishedState) currentState;
			state.increaseNumS();
			System.out.println("DATA sent "+ state.getNumS());
		}else{
			System.out.println(event.getName() + " received, current State is "+ currentState.getName());
		}
	}
}
