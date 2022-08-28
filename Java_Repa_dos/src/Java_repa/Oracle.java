package Java_repa;

import java.util.LinkedList;
import java.util.Queue;

import javax.swing.JOptionPane;

public class Oracle extends BDatos implements Operaciones{

	@Override
	public void conectar() {
		// TODO Auto-generated method stub
		System.out.println("se conecto a oracle");
	}

	@Override
	public void consultar() {
		// TODO Auto-generated method stub
		System.out.println(this.getQueue());
	}

	@Override
	public void  insertar(int i) {
		// TODO Auto-generated method stub
		Queue<Integer> queue2=new LinkedList<>();
		
		
		if(this.getQueue()==null) {
			queue2.add(i);
			this.setQueue(queue2);
		}else{
			queue2.add(i);
			
			}
		this.setQueue(queue2);
	}
	

	@Override
	public void eliminar() {
		// TODO Auto-generated method stub
		this.setQueue(null);
		JOptionPane.showMessageDialog(null, "se elimino con exito", null, 0, null);
	}


	

}
