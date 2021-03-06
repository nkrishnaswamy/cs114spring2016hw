package cs114.util;

/**
 * Convenience Extension of Counter to use an IdentityHashMap.
 *
 * @author Dan Klein
 */
public class IdentityCounter<E> extends Counter<E> {
  static final long serialVersionUID = 1L;

  public IdentityCounter() {
    super(new MapFactory.IdentityHashMapFactory<E,Double>());
  }
}
