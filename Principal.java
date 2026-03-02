package view;
import controller.MultiplicacaoController;
import javax.swing.JOptionPane;
import controller.MultiplicacaoController;
public class Principal
{
	public static void main (String args [])
	{
		MultiplicacaoController multiplicacaoController = new MultiplicacaoController();
		int a, resultado, b;
		do 
		{
		    a = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número inteiro positivo A: "));
		} while (a <= 0);
		do 
		{
		    b = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número inteiro positivo B: "));
		} while (b <= 0);
		resultado = multiplicacaoController.multiplicacao(a,b);
		System.out.println(resultado);
	}
}