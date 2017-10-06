
public class Loopy {
	public static void main(String[] args){
		int x=1;
		System.out.println("Antes do loop");
		while(x<100){
			System.out.println("no loop");
			System.out.println("O valor de x: "+ x);
			x=x+1;
		}
		System.out.println("Esse e o fim do loop");
	}

}
