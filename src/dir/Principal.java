package dir;

import java.io.File;

public class Principal {
	
	private static File carpetaDeTrabajo = null;
	private File carpetaDeTrabajo2 = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public Principal() {
		carpetaDeTrabajo = File.listRoots()[0];
	}
	
	public static void comparar(){
		
		StringBuilder strBuilder=new StringBuilder();
		String arg0 = null;
		File file = new File(carpetaDeTrabajo, arg0);
		String arg1 = null;
		File file1 = new File(carpetaDeTrabajo, arg1);
		
		file.list();
		if (file.isDirectory() && file1.isDirectory()) {
			strBuilder.append(file.list().length);
			strBuilder.append(file1.list().length);
				if (file.list().length == file1.list().length) {
					System.out.println("Misma cantidad de ficheros/directorios");
				}
				else {
					System.out.println("Distina cantidad de ficheros/directorios");

				}
		}
		else {
			System.out.println("No son directorios ambos");
		}
	
	}
	}
	


