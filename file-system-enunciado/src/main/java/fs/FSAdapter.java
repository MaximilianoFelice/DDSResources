package fs;

public interface FSAdapter {

	int openFile(String str);
	
	byte[] readFile(int fd, int base, int offset);
	
	void writeFile(int fd, int base, byte[] buffer);
	
	void closeFile(int fd);
}
