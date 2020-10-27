package sun.net.www.protocol.com.example;

import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

@SuppressWarnings("unused")
public final class CustomConnection extends URLConnection
{
    public CustomConnection(URL u)
    {
        super(u);
    }

    @Override
    public void connect()
    {
        throw new UnsupportedOperationException("The connect() method is not supported");
    }

    @Override
    public Object getContent()
    {
        throw new UnsupportedOperationException("The getContent() method is not supported");
    }

    @Override
    public InputStream getInputStream()
    {
        throw new UnsupportedOperationException("The getInputStream() method is not supported");
    }
}