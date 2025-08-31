package storify.cloud;


import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Encryption {
    public static String encrypt(String k, String filepath)
    {

        try
        {
            byte [] key=k.getBytes();
            Path path= Paths.get(filepath);
            byte[] file = Files.readAllBytes(Paths.get(filepath));
            byte [] encryptedbytes=new byte[file.length];
            for ( int i =0;i<file.length;i++)
            {
                encryptedbytes[i]=(byte)(file[i]^key[i%key.length]);
            }
            Files.write(path , encryptedbytes);
            System.out.println("encrypted");

        }
        catch (Exception e)
        {
            System.out.println("error-"+e);
        }


        return "yes";
    }
    public static void main(String[] args) {


        System.out.println(encrypt("parthkhatke@gmail,com","C:\\Users\\parth\\Downloads\\Adobe Express - file.png"));
    }
}
