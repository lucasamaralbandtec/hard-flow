/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapturarDados;

import java.util.Arrays;
import oshi.SystemInfo;
import oshi.software.os.NetworkParams;
import oshi.software.os.OSProcess;
import oshi.software.os.OperatingSystem;

/**
 *
 * @author guita
 */
public class InfoHard 
{
    private SystemInfo systemInfo = new SystemInfo();
    private OperatingSystem os = systemInfo.getOperatingSystem();
    private NetworkParams params = systemInfo.getOperatingSystem().getNetworkParams();
    
    
    
    public OperatingSystem getSistemaOperacional()
    {
        return os;
    }
    
     public String getNomeMaquina()
    {
        
        return params.getHostName();
    }
     
     public String getGateway()
     {
         return Arrays.toString(params.getDnsServers());
     }
   
      public String getProprietario()
     {
           OSProcess proc = os.getProcess(os.getProcessId());
             return proc.getUser();
     }
}
