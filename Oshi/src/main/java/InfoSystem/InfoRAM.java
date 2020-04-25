/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InfoSystem;

import oshi.SystemInfo;
import oshi.hardware.GlobalMemory;

/**
 *
 * @author guita
 */
public class InfoRAM {
    private GlobalMemory ramInfo;
    
    public InfoRAM()
    {
        this.ramInfo = new SystemInfo().getHardware().getMemory();
    }
    
    public Double getPorcentagemRam() {
        Long totalRam = ramInfo.getTotal();
        Long emUso = totalRam - ramInfo.getAvailable();

        return (emUso * 100.0) / totalRam;
    }
}
