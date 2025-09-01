package storify.cloud.Service;

import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class GenerateOTP {

    public static String otp()
    {
        Random random= new Random();
        int otp=0;
        for (int i=0;i<4;i++)
        {
            otp*=10;
            otp+=random.nextInt(10);
        }
        return String.valueOf(otp);
    }
}
