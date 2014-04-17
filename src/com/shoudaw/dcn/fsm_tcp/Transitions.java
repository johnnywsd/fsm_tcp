package com.shoudaw.dcn.fsm_tcp;

import Fsm.Transition;
import com.shoudaw.dcn.fsm_tcp.action.*;


public class Transitions {
	
    Events events = new Events();
	States states = new States();
	Fsm.Action ac = new Action_impl();
	

	Transition listen_to_closed = new Transition(states.listenState, events.closeEvent, states.closedState, ac);
	Transition syn_sent_to_closed = new Transition(states.synSentState, events.closeEvent, states.closedState, ac);
	Transition syn_sent_to_syn_rcvd = new Transition(states.synSentState, events.synEvent, states.synRcvdState, ac);
	Transition syn_rvcd_to_fin_wait_1 = new Transition(states.synRcvdState, events.closeEvent, states.finWait1State, ac);
	Transition closed_to_listen = new Transition(states.closedState, events.passiveEvent, states.listenState, ac);       
	Transition closed_to_syn_sent = new Transition(states.closedState, events.activeEvent, states.synSentState, ac);		
	Transition listen_to_syn_rcvd = new Transition(states.listenState, events.synEvent, states.synRcvdState, ac);		
	Transition syn_sent_to_established = new Transition(states.synSentState, events.synAckEvent, states.establishedState, ac);		
	Transition syn_rcvd_to_established = new Transition(states.synRcvdState, events.ackEvent, states.establishedState, ac);
	
	

	Transition  established_to_established_s= new Transition(states.establishedState, events.sDataEvent, states.establishedState, ac);
	Transition  established_to_established_r= new Transition(states.establishedState, events.rDataEvent, states.establishedState, ac);
	

	Transition established_to_fin_wait_1 = new Transition(states.establishedState, events.closeEvent, states.finWait1State, ac);
	Transition established_to_close_wait = new Transition(states.establishedState, events.finEvent, states.closeWaitState, ac);
	Transition fin_wait_1_to_fin_wait_2 = new Transition(states.finWait1State, events.ackEvent, states.finWait2State, ac);		
	Transition fin_wait_1_to_closing = new Transition(states.finWait1State, events.finEvent, states.closingState, ac);
	Transition fin_wait_2_to_timewait = new Transition(states.finWait2State, events.finEvent, states.timeWaitState, ac);
	Transition closing_to_time_wait = new Transition(states.closingState, events.ackEvent, states.timeWaitState, ac);
	Transition close_wait_to_last_ack = new Transition(states.closeWaitState, events.closeEvent, states.lastAckState, ac);
	Transition last_ack_to_closed = new Transition(states.lastAckState, events.ackEvent, states.closedState, ac);
	Transition time_wait_to_closed = new Transition(states.timeWaitState, events.timeoutEvent, states.closedState, ac);
	

}
