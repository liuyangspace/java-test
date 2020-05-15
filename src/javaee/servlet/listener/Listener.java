package javaee.servlet.listener;

/**
 * 监听器
 *
 * use e.g:
 *  1) 编写相关类（RequestListener）
 *      public class MyListener implements RequestListener { //... }
 *  2) 配置(WEB-INF/web.xml):
 *      <listener>
 *          <listener-class>test.javaee.servlet.listener.RequestListener</listener-class>
 *      </listener>
 *  观察者模式：
 *      观察者 : HttpSessionListener   HttpSessionAttributeListener, ServletContextListener
 *      被观察者：HttpSesson
 *      观察到的事件：HttpSessonEvent
 *
 *
 */
public class Listener {

}
