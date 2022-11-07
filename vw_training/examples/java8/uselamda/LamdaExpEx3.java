package uselamda;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
/*
interface Consumer
{
	void accept(int n);
}
*/

public class LamdaExpEx3 {

	public static void main(String[] args) {
		
     
     List<Integer> arrlst = new ArrayList<Integer>(); 
     arrlst.add(10);
     arrlst.add(3);
     arrlst.add(10);
     arrlst.add(30);
    
     arrlst.forEach((n)->System.out.println(n));
	}
	


}
