/**
 * 
 */
package ijt.filter.event;

/**
 * Interface for managing status changes of an algorithm. 
 * 
 * @author David Legland
 *
 */
public interface StatusListener {
	public void statusChanged(StatusEvent evt);
}
