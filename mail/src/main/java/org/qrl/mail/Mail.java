package org.qrl.mail;

import com.sun.mail.util.MailSSLSocketFactory;
import lombok.SneakyThrows;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

/**
 * @author qr
 * @date 2021/12/24 15:16
 */
public class Mail {

    @SuppressWarnings("all")
    private final static String token = "uegxcojaylnmebeh";

    @SneakyThrows
    public static void main(String[] args) {
        Properties prop = new Properties();
        //设置QQ邮件服务器
        prop.setProperty("mail.host", "smtp.qq.com");
        //邮件发送协议
        prop.setProperty("mail.transport.protocol", "smtp");
        //需要验证用户名密码
        prop.setProperty("mail.smtp.auth", "true");
        //关于QQ邮箱，还要设置SSL加密，加上以下代码即可
        MailSSLSocketFactory sf = new MailSSLSocketFactory();
        sf.setTrustAllHosts(true);
        prop.put("mail.smtp.ssl.enable", "true");
        prop.put("mail.smtp.ssl.socketFactory", sf);
        // 使用JavaMail发送邮件的5个步骤
        // 1、创建定义整个应用程序所需的环境信息的Session对象
        Session session = Session.getDefaultInstance(prop, new Authenticator() {
            public PasswordAuthentication getPasswordAuthentication() {
                //发件人邮件用户名、授权码
                return new PasswordAuthentication("qrzhz@qq.com", token);
            }
        });
        session.setDebug(true); // 开启Session的debug模式，这样就可以查看到程序发送Email的运行状态
        // 2、通过session得到transport对象
        Transport ts = session.getTransport();
        // 3、使用邮箱的用户名和授权码连上邮件服务器
        ts.connect("smtp.qq.com", "qrzhz@qq.com", token);
        // 4、创建邮件
        // 创建邮件对象
        MimeMessage message = new MimeMessage(session);
        // 指明邮件的发件人
        message.setFrom(new InternetAddress("qrzhz@qq.com"));
        // 指明邮件的收件人
        message.setRecipient(Message.RecipientType.TO, new InternetAddress("94585139@qq.com"));
        // 邮件标题/注意
        message.setSubject("Hello");
        // 邮件文本内容
        message.setContent("你好哇，我是QRZh", "text/html;charset=UTF-8");
        // 发送邮件
        ts.sendMessage(message, message.getAllRecipients());
        //5，关闭连接
        ts.close();
    }
}
