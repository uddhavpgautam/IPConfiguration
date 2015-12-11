package IPConfiguration;

import java.net.*;
import java.util.*;

public class ListUpNets {

    private final Enumeration<NetworkInterface> nets;

    public ListUpNets() throws SocketException {
        nets = NetworkInterface.getNetworkInterfaces();
        for (NetworkInterface netint : Collections.list(nets)) {
            if (netint.isUp() && !netint.isVirtual() && !netint.isPointToPoint() && !netint.isLoopback()) {
                displayInterfaceInformation(netint);
            }
        }
    }

    public static void displayInterfaceInformation(NetworkInterface netint) throws SocketException {
        IPConfigurationPanel.networkInterfaceList.addItem(netint.getName());
    }
}
