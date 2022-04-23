import java.util.*;

public class Codec {

    // Encodes a URL to a shortened URL.
    HashMap<String,String> hm = new HashMap<>();
    public String encode(String longUrl) {
        String tem = "http://tinyurl.com/"+longUrl.hashCode();
        hm.put(tem,longUrl);
        return tem;
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        return hm.getOrDefault(shortUrl,null);

    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(url));