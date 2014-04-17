package com.shoudaw.dcn.fsm_tcp;
import com.shoudaw.dcn.fsm_tcp.state.*;
import Fsm.State;

public class States {
	
	State closedState = new ClosedState("CLOSED");		
	State listenState = new ListenState("LISTEN");	
	State synSentState = new SynSentState("SYN_SENT");
	State synRcvdState = new SynRcvdState("SYN_RECEIVED");		
	State establishedState = new EstablishedState("ESTABLISED");
	State finWait1State = new FinWait1State("FIN_WAIT_1");
	State finWait2State = new FinWait2State("FIN_WAIT_2");
	State closeWaitState = new CloseWaitState("CLOSE_WAIT");
	State lastAckState = new LastAckState("LAST_ACK");
	State closingState = new ClosingState("CLOSING");
	State timeWaitState = new TimeWaitState("TIME_WAIT");
}
