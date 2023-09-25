package aquecimentoProjetoPOO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

public class Persistencia {
	private XStream xStream =new XStream(new DomDriver());
	
	public void salvarCentral(CentralDeInformacoes cdi, String arquivo) {
		File file = new File(arquivo);
		String xml= xStream.toXML(cdi);
		try {
			if(file.exists()) 
				file.createNewFile();
			PrintWriter gravar=new PrintWriter(file);
			gravar.print(xml);
			gravar.close();
		} catch(IOException e) {
			e.printStackTrace();
		}

	}
	public CentralDeInformacoes recuperarCentral(String arquivo) {
		File file=new File(arquivo);
		try {
			if(file.exists()) {
				FileInputStream fis=new FileInputStream(file);
				fis.reset();
				return (CentralDeInformacoes) xStream.fromXML(fis);
			}
		}catch(FileNotFoundException e) {
			e.printStackTrace();		
		} catch (Exception e) {
			e.printStackTrace();
		}
		CentralDeInformacoes cdi=new CentralDeInformacoes();
		return cdi;
	}
}
