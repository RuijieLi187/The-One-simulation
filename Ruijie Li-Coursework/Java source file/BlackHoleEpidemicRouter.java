package routing;

import java.util.Random;

import core.Settings;
import core.Message;

/**
 * Grey Hole message router with drop a configured percentage of received packets
 */
public class BlackHoleEpidemicRouter extends ActiveRouter {
	

	/**
	 * Constructor. Creates a new message router based on the settings in
	 * the given Settings object.
	 * @param s The settings object
	 */
	public BlackHoleEpidemicRouter(Settings s) {
		super(s);
	}
	
	/**
	 * Copy constructor.
	 * @param r The router prototype where setting values are copied from
	 */
	protected BlackHoleEpidemicRouter(BlackHoleEpidemicRouter r) {
		super(r);
	}
	
	@Override 
	protected void addToMessages(Message m, boolean newMessage) {
		super.addToMessages(m, newMessage);
		
		
		
		deleteMessage(m.getId(), true);
	}
			
	@Override
	public void update() {
	/*	super.update();
		
		if (isTransferring() || !canStartTransfer()) {
			return; // transferring, don't try other connections yet
		}
		
		// Try first the messages that can be delivered to final recipient
		if (exchangeDeliverableMessages() != null) {
			return; // started a transfer, don't try others (yet)
		}
		
		// then try any/all message to any/all connection
		this.tryAllMessagesToAllConnections();*/
	}
	
	
	@Override
	public BlackHoleEpidemicRouter replicate() {
		return new BlackHoleEpidemicRouter(this);
	}

}