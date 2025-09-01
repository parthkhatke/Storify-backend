package storify.cloud.Service;

import org.springframework.stereotype.Service;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@Service
public class Decryption {
    public String decrypt(String email, String filepath)
    {
        try
        {
            byte [] key=email.getBytes();
            Path path= Paths.get(filepath);
            byte[] file = Files.readAllBytes(path);
            byte [] decryptedbytes=new byte[file.length];
            for ( int i =0;i<file.length;i++)
            {
                decryptedbytes[i]=(byte)(file[i]^key[i%key.length]);
            }
            Files.write(path , decryptedbytes);
            System.out.println("decryptedbytes");
            return "Sucess";
        }
        catch (Exception e)
        {
            System.out.println("error-"+e);
            return "error";
        }
    }
}
