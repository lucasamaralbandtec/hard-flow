package CapturarDados;
import java.io.File;
import oshi.SystemInfo;
import oshi.software.os.FileSystem;
import oshi.software.os.OSFileStore;
import oshi.software.os.OperatingSystem;
import oshi.util.FormatUtil;

public class InfoDisco {
    private SystemInfo si;
    private OperatingSystem os;
     private Integer discoUsado;
    File[] disco = File.listRoots();
       
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
    
    public Integer getPorcentagemDisco() {
        for (File indice : disco) {
            Double memoria = getGigabytes(indice.getTotalSpace());
            Double memoriaUsada = getGigabytes(indice.getTotalSpace() - indice.getFreeSpace());
            this.setQuantDiscoUsado((int) ((memoriaUsada / memoria) * 100));
        }
        return discoUsado;
    }
    
    public void setQuantDiscoUsado(Integer discoUsado) {
        this.discoUsado = discoUsado;
    }
    
    public double getGigabytes(long valor) {
        return valor / 1024 / 1024 / 1024;
    }
    
    public static void main(String[] args) {
        InfoDisco i = new InfoDisco();
        System.out.println(i.getPorcentagemDisco());
    }
}
