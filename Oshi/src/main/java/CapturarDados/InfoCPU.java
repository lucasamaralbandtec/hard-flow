/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapturarDados;

import oshi.SystemInfo;
import oshi.hardware.CentralProcessor;

/**
 *
 * @author guita
 */
public class InfoCPU {
        private CentralProcessor cpuInfo;
        private long oldTicks[];
    
    public InfoCPU() 
    {
          this.cpuInfo = new SystemInfo().getHardware().getProcessor();
           oldTicks = new long[CentralProcessor.TickType.values().length];
    }
    
    
    public double getPorcentagemCPU()
    {
        Double loadCPU = cpuInfo.getSystemCpuLoadBetweenTicks(oldTicks);
        oldTicks = cpuInfo.getSystemCpuLoadTicks();
        return loadCPU * 100;
    }
}
