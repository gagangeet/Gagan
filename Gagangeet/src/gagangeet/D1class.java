package gagangeet;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class D1class
{
    static String rootId="00000000000000000000000000000000";
   public static void main(String args[])
   {
       DateTimeFormatter sdf= DateTimeFormatter.ofPattern("yyyy/mm/dd HH:mm:ss");
       LocalDateTime now= LocalDateTime.now();
       Node root=new Node();
       root.setTimeStamp(sdf.format(now));
       root.setDate(dataConfigurator(0,30,rootId,(0+30+rootId.toString().hashCode())));
   }
   public static dataConfigurator()
   {
       
   }
}
