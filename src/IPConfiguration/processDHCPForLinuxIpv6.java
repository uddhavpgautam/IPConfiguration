package IPConfiguration;

import java.io.IOException;
import static IPConfiguration.IPConfigurationPanel.networkInterfaceList;

public class processDHCPForLinuxIpv6 {

    private String nameinterface;
    private String command;
    private String ipValue;
    private String netmaskValue;
    private String gatewayValue;

    processDHCPForLinuxIpv6(String ipValue, String netmaskValue, String gatewayValue) {
        System.out.println("This is Unix or Linux");
        // change ip configuration using netsh command
//            ifconfig  $interface_name $IP netmask $subnetmask  broadcast $Broadcast_address pointopoint $gateway up
        nameinterface = (String) networkInterfaceList.getSelectedItem();
        command = "ifconfig " + nameinterface + " add " + ipValue + "/" + netmaskValue + " pointtopoint " + gatewayValue;

        try {
            Runtime r = java.lang.Runtime.getRuntime();
            Process p = r.exec(command);
            System.out.println(command);
        } catch (IOException e1) {
            System.out.println(e1.getMessage());
        }
    }
}
