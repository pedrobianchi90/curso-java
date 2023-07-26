import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Exemplo {
	private static final String caminhoArquivo = "/path/to/some/file.txt";
	
	public void lerConteudoArquivo() {
		File meuArquivo = new File(caminhoArquivo);
		FileReader leitorArquivo= null;
		BufferedReader bufferedLeitor = null;
		
		if(meuArquivo.exists()) {
			try {
				leitorArquivo= new FileReader(meuArquivo );
				bufferedLeitor = new BufferedReader(leitorArquivo);
				
				String conteudoLinha = bufferedLeitor.readLine();
				
				while(conteudoLinha != null) {
					System.out.println(conteudoLinha);
					conteudoLinha = bufferedLeitor.readLine();
				}
				
			} catch (IOException  e) {
				e.printStackTrace();
			} finally {
				this.fecharObjetosLidos(leitorArquivo, bufferedLeitor);
			}
		}
	}

  public void escreverConteudoArquivo(){
    File meuArquivo = new File(caminhoArquivo);
    FileWriter escritorArquivo = null;
    BufferedWriter bufferedEscritor = null;

    if(meuArquivo.exists()){
      try {
        escritorArquivo = new FileWriter(meuArquivo);
        bufferedEscritor = new BufferedWriter(escritorArquivo);
        bufferedEscritor.write("Texto escrito");
        bufferedEscritor.flush();

      } catch (IOException e) {
        e.printStackTrace();
      } finally {
        this.fecharObjetosEscritos(escritorArquivo, bufferedEscritor);
      }
    }
  }
	
	private void fecharObjetosLidos(FileReader fileReader, BufferedReader bufferedReader) {
		try {
			fileReader.close();
			bufferedReader.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

  private void fecharObjetosEscritos(FileWriter escritorArquivo, BufferedWriter bufferedEscritor) {
		try {
			escritorArquivo.close();
			bufferedEscritor.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

  public void listar(){
    File meuArquivo = new File(caminhoArquivo);
    if(meuArquivo.isDirectory() && meuArquivo.canRead()){
      for(File f : meuArquivo.listFiles()){
        System.out.println(f.getName());
      }
    }
  }

}