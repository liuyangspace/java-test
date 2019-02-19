package javaee.jsp.tag;

/**
 * The auxiliary interface of a Tag, IterationTag or BodyTag tag
 * handler that wants additional hooks for managing resources.
 *
 * <p>This interface provides two new methods: doCatch(Throwable)
 * and doFinally().  The prototypical invocation is as follows:
 *
 * <pre>
 * h = get a Tag();  // get a tag handler, perhaps from pool
 *
 * h.setPageContext(pc);  // initialize as desired
 * h.setParent(null);
 * h.setFoo("foo");
 *
 * // tag invocation protocol; see Tag.java
 * try {
 *   doStartTag()...
 *   ....
 *   doEndTag()...
 * } catch (Throwable t) {
 *   // react to exceptional condition
 *   h.doCatch(t);
 * } finally {
 *   // restore data invariants and release per-invocation resources
 *   h.doFinally();
 * }
 *
 * ... other invocations perhaps with some new setters
 * ...
 * h.release();  // release long-term resources
 * </pre>
 * @see javax.servlet.jsp.tagext.TryCatchFinally
 */
public interface TryCatchFinally extends javax.servlet.jsp.tagext.TryCatchFinally{

    void doCatch(Throwable t) throws Throwable;
    void doFinally();

}
