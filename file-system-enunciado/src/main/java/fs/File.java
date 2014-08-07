package fs;

public class File {

	FSAdapter ad;
	
	int fd;
	
	public File (String ruta, FSAdapter adaptador){
		
		this.ad = adaptador;
		
		this.fd = ad.openFile(ruta);
		
	}
	
	public byte[] readFile(int base, int offset){
		
		byte[] buffer = ad.readFile(fd, base, offset);
		
		return buffer;
	}
	
	public void close(){
		ad.closeFile(fd);
		/* Disposeame */
		
	}
}
