
public class LabPoprawiam {
	public static void main(String[] args) {

		
	}
	
	//ZADANIE 5a:
	//spr�buj zrozumie� co sprawdza ta metoda
	//podpowiedz w main wywo�aj metod� zadanie z r�nymi warto�ciami x
	//i zobacz dla jakich liczb zwracana jest warto�� true a dla jakich false
	private static boolean tajemnica(int x)
	{
		if (x%2==0)
		{
			return true;
		}
		else
		{
			return false;
		}				
	}
	
	//ZADANIE 5b:
	//Do tej metody wdar� si� b��d. Popraw j� tak, �eby:
	//je�li dochody s� wi�ksze od wydatk�w o 10 z� wy�wietl "super"
	//je�li dochody s� wi�ksze od wydatk�w o mniej ni� 10z� wy�wietl "ok"
	//je�li dochody s� r�wne wydatkom wy�wietl "hmm"
	//je�li dochody s� mniejsze od wydatk�w wy�wietl "huston mamy problem"
	private static void bilans(int wydatki, int dochody)
	{
		if (dochody+wydatki>10)
		{
			System.out.println("super");
		}
		else if (dochody>0)
		{
			System.out.println("ok");
		}
		else if (wydatki>0)
		{
			System.out.println("hmm");
		}
		else
		{
			System.out.println("huston mamy problem");
		}
	}
}
