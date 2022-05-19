package p4;

public class NetWorkTest {
    public static void main(String[] args) {

        Server server = new Server();

        ProxyServer proxyServer = new ProxyServer(server);
        proxyServer.browse();

    }
}

interface NetWork {
    public abstract void browse();
}

//被代理类
class Server implements NetWork {

    @Override
    public void browse() {
        System.out.println("true follow network");
    }
}

class ProxyServer implements NetWork {

    private NetWork netWork;

    public ProxyServer(NetWork netWork) {
        this.netWork = netWork;
    }

    public void check() {
        System.out.println("check NetWork");
    }

    @Override
    public void browse() {
        check();
        netWork.browse();
    }
}
