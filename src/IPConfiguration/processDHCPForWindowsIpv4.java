package IPConfiguration;

import java.io.IOException;
import static IPConfiguration.IPConfigurationPanel.networkInterfaceList;

public class processDHCPForWindowsIpv4 {

    private String nameinterface;
    private String command;
    private String ipValue;
    private String netmaskValue;
    private String gatewayValue;

    processDHCPForWindowsIpv4(String ipValue, String netmaskValue, String gatewayValue) {
        System.out.println("This is Windows");
        // change ip configuration using netsh command
        if (networkInterfaceList.getSelectedItem().equals("wlan0")) {
            nameinterface = "Wi-Fi";
            command = "netsh interface ip set address \"" + nameinterface + "\" static " + ipValue + " " + netmaskValue + " " + gatewayValue;
            System.out.println(command);
            try {
                Runtime r = java.lang.Runtime.getRuntime();
                Process p = r.exec(command);
                System.out.println(command);
            } catch (IOException e1) {
                System.out.println(e1.getMessage());
            }
        }
        if (networkInterfaceList.getSelectedItem().equals("eth0")) {
            nameinterface = "Ethernet";
            command = "netsh interface ip set address \"" + nameinterface + "\" static " + ipValue + " " + netmaskValue + " " + gatewayValue;

            try {
                Runtime r = java.lang.Runtime.getRuntime();
                Process p = r.exec(command);
                System.out.println(command);
            } catch (IOException e1) {
                System.out.println(e1.getMessage());
            }
        }
    }
}
