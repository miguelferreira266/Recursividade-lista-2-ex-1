package controller;
public class MultiplicacaoController 
{
	

	public MultiplicacaoController()
	{
			super();
	}
	public int multiplicacao (int a, int b)
	{
		if (b == 0)
		{
			return 0;
		}
		else
		{
			b = b - 1;
			return a + multiplicacao(a, b);
		}
	}
}
