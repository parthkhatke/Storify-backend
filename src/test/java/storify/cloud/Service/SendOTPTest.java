package storify.cloud.Service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class SendOTPTest {

    @Autowired
    private SendOTP sendOTP;
    @Test
    void sendEmail() {
        String tp="parthkhatke@gmail.com";
        String otp=GenerateOTP.otp();
        sendOTP.sendEmail(tp,otp);


    }
}