package Java_repa;
import javax.swing.JOptionPane;

public class Principal {

	
	public static void main(String[] args) {
		
		
		Oracle ora=new Oracle();
		Postgres post=new Postgres();
		
		

		
		int Base_elec=Integer.parseInt(JOptionPane.showInputDialog("por favor escoja que a que base de datos quiere acceder:\n"
							+"1=oracle\n"+"2=postgres\n"));
		
		
		
		
	
		int opcW=1;
	
		while(opcW!=0) {
			
			if(Base_elec==1) {
				
				int h=Integer.parseInt(JOptionPane.showInputDialog("Esta en la Base de datos de oracle\n"+"1= insertar datos en la base\n"
						+ "2=consultar datos de la base\n" + "3=eliminar datos de la base\n"+"4=conectar\n"+"5=salir\n"));
				switch (h) {
				case 1:
					int kj=Integer.parseInt(JOptionPane.showInputDialog("digite el dato que desea insertar"));
					ora.insertar(kj);
					break;
				case 2:		
					ora.consultar();
					break;
				case 3:		
					ora.eliminar();
					
					break;
				case 4:
					ora.conectar();
				case 5:
					opcW=0;
					break;
				
				
				
			}}
			else {
				int h=Integer.parseInt(JOptionPane.showInputDialog("Esta en la Base de datos de postgres\n"+"1= insertar datos en la base\n"
					+ "2=consultar datos de la base\n" + "3=eliminar datos de la base\n"+"4=conectar\n"+"5=salir\n"));
				switch (h) {
					case 1:
						int kj=Integer.parseInt(JOptionPane.showInputDialog("digite el dato que desea insertar"));
						post.insertar(kj);
						break;
					case 2:		
						post.consultar();
						break;
					case 3:		
						post.eliminar();
						break;
					case 4:
						post.conectar();
					case 5:
						opcW=0;
						break;
				}
				
			}
			}
		
		
		
		}
}
