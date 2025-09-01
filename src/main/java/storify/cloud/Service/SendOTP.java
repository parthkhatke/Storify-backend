package storify.cloud.Service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class SendOTP {

    @Autowired
    private JavaMailSender mailSender;

    public void sendEmail(String toEmail,String otp)
    {

        String subject="OTP From Storify";
        String body="One time password for your email verification is "+otp;
        SimpleMailMessage message= new SimpleMailMessage();
        message.setFrom("storifycloud@gmail.com");
        message.setTo(toEmail);
        message.setText(body);
        message.setSubject(subject);
        mailSender.send(message);
        log.info("mail send successfully");
    }

}
