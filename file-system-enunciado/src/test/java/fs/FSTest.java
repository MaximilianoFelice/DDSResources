package fs;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;

import org.junit.Before;
import org.junit.Test;

public class FSTest {

	FileSystem fs;
	private LowLevelFileSystem lowLevelFileSystemMock;
	
	@Before
	public void setUp() throws Exception {
		lowLevelFileSystemMock = mock(LowLevelFileSystem.class);
		fs = new FileSystem(new LLAdapter(lowLevelFileSystemMock));
	}

	@Test
	public void abrirNuevoArchivo() {
		
		File nuevoArchivo = fs.openFile("LA FUCKING RUTA");
		
				
	}

}
