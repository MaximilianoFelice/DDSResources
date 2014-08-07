package fs;

public class LLAdapter implements FSAdapter {

	LowLevelFileSystem llfs;
	
	public LLAdapter(LowLevelFileSystem llfs){
		this.llfs = llfs;
	}
	
	@Override
	public int openFile(String str) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public byte[] readFile(int fd, int base, int offset) {
		
		byte[] buffer = new byte[offset];
		
		llfs.syncReadFile(fd, buffer, base, base+offset);
		
		return buffer;
	}

	@Override
	public void writeFile(int fd, int base, byte[] buffer) {
		// TODO Auto-generated method stub

	}

	@Override
	public void closeFile(int fd) {
		// TODO Auto-generated method stub

	}

}
