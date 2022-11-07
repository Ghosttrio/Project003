// if, break 사용해서 8까지만 출력
public class Dowhile {

	public static void main(String[] args) {

		int i=0;
		while(i<10)	{
			System.out.println(i);
			if(i==8) {
				break;
			}
			i++;
		}
		
	}

}
