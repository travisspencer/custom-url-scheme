package sun.net.www.protocol.com.example;

import java.net.URL;
import java.net.URLConnection;
import java.net.URLStreamHandler;

@SuppressWarnings("unused")
public class Handler extends URLStreamHandler
{
    @Override
    protected URLConnection openConnection(URL u)
    {
        return new CustomConnection(u);
    }
}