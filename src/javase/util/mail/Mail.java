package javase.util.mail;

/**
 * 邮件协议:
 *  SMTP (Simple Mail Transport Protocol)    // 发邮件
 *      [telnet smtp.qq.com 25]
 *      Ehlo(SP)<域名>(CRLF)    // 与服务器通讯
 *      Auth(SP>Login(CRLF)    // 请求登录
 *      (base64(username))(CRLF)
 *      (base64(password))(CRLF)
 *      Mail(SP)From:(everse-path)(CRLF) //发件人的email：www@aa.com
 *      Rcpt(SP)To:(forword-path)(CRLF) //收件的地址：eee@aa.com
 *      Data(CRLF) //以下是数据
 *      from:<(reverse-path)>(CRLF)
 *      to:<(forword-path)>(CRLF)
 *      subject:(forword-path)(CRLF)
 *      (CRLF)
 *      ...
 *      .
 *      Quit(CRLF) //退出
 *  pop3 (Post Office Protocol 3）           // 收邮件
 *      [telnet pop3.qq.com 110]
 *
 *  IMAP // 新协议 发邮件也可以收邮件
 *
 * @see javax.mail
 * @see javax.activation
 * @see com.sun.mail
 */
public class Mail {

}
