import java.io.IOException;
import java.net.URI;
import java.util.ArrayList;

class Handler implements URLHandler{
    ArrayList<String> SearchList = new ArrayList<String>();
    public String handleRequest(URI url){
        if(url.getPath().contains("/add")){
            String[] param = url.getQuery().split("=");
            if

        }

    }
}
public class SearchEngine {
    public static void main(String[] args) throws IOException{
        if(args.length == 0){
            System.out.println("Missing port number! try any number between 1024 and 49151");
            return;
        }

        int port = Integer.parseInt(args[0]);
        Server.start(port, new Handler());
    }
}
