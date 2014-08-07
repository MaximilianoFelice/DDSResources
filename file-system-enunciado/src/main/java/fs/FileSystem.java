package fs;

public class FileSystem {

	FSAdapter ad;
	
	public FileSystem(FSAdapter adapter){
		ad = adapter;
	}
	
	public File openFile(String ruta){
		return new File(ruta, ad);
	}
}
