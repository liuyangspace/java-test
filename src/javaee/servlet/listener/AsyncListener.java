package javaee.servlet.listener;

import javax.servlet.AsyncEvent;
import java.io.IOException;

/**
 * TODO SERVLET3 - Add comments
 *
 * @see javax.servlet.AsyncListener
 */
public interface AsyncListener extends javax.servlet.AsyncListener{

    void onComplete(AsyncEvent event) throws IOException;
    void onTimeout(AsyncEvent event) throws IOException;
    void onError(AsyncEvent event) throws IOException;
    void onStartAsync(AsyncEvent event) throws IOException;

}
