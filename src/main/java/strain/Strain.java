package strain;

import java.util.LinkedList;
import java.util.List;
import java.util.function.Predicate;

public class Strain
{

	public Strain( )
	{
		// TODO Auto-generated constructor stub
	}

	public static <T> List< T > keep(List< T > input, Predicate<T> f) {
		List<T> result = new LinkedList<T>();
		
		return result;
	}
	
	public static <T> List< T > discard(List< T > input, Predicate<T> f) {
		List<T> result = new LinkedList<T>();
		
		return result;
	}
}
