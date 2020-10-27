# Custom URL Scheme

This project shows how to add a custom URL scheme handler to the JVM. Using it is very easy:

1. Rename the package `sun.net.www.protocol.com.example` to end with the reverse domain name of your scheme handler. FOr instance, if your domain is travisspencer.com, the reverse domain name of the URLs would be `com.travisspencer` and you would, thus, rename the package to `sun.net.www.protocol.com.travisspencer`. 
2. Implement the methods in `CustomConnection` (if needed)
3. Package the JAR by doing `mnv package`
4. Put the JAR in your JVM's classpath.

More specifically, this can be used with the Curity Identity Server to support custom schemes on a mobile application. To do this, update the scheme as described previously, but skip step 2. It's not needed in this case. Then, in step 4, put the JAR file in `$IDSVR_HOME/lib`. Do this on each node, and restart them. 
