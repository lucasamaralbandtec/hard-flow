/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapturarDados;

import oshi.SystemInfo;
import oshi.software.os.FileSystem;
import oshi.software.os.OSFileStore;
import oshi.software.os.OperatingSystem;
import oshi.util.FormatUtil;

/**
 *
 * @author guita
 */
public class InfoDisco {
    private SystemInfo si;
    private OperatingSystem os;

    
public InfoDisco()
{
    si = new SystemInfo();
    os = si.getOperatingSystem();
}
    
    public String getDiscoDisponivel()
    {
        String discoLivre;
        long livre =0;
        FileSystem fs = os.getFileSystem();
        OSFileStore[] fsA = fs.getFileStores();
        
        for(OSFileStore oSFileStore : fsA)
        {
            livre += oSFileStore.getUsableSpace();
        }
        
        
        
        discoLivre = FormatUtil.formatBytes(livre).replaceAll(",", ".").replaceAll("GiB", "GB");
        
        return discoLivre;
    }
}
