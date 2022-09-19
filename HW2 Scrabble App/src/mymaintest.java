
public class mymaintest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tile t1 = new Tile('a');
		Tile t2 = new Tile('b');
		Tile t3 = new Tile('c');
		Tile t4 = new Tile('d');
		

		
		char[] arr = {'a','b','c','d'};
		String[] strArr = new String[24];
		
		
		for(int i = 0; i < 4; i++) {
			char temp = arr[0];
			arr[0] = arr[i];
			arr[i] = temp;
			
			char[] subarray = {arr[1], arr[2], arr[3]};
			String[] sixpossible = swapall(subarray);
			for(int n = 0; n < 6; n++) {
				strArr[n+6*i] = arr[0]+sixpossible[n];
			}
			
			
		}
		for (int x = 0; x < strArr.length; x++) {
			System.out.println(strArr[x]);
		}
		
 	}
		public static String[] swapall(char[] toswap) {
			String[] strArr = new String[6];
			strArr[0] = ""+ toswap[0] + toswap[1] + toswap[2];
			strArr[1] = ""+ toswap[0] + toswap[2] + toswap[1]; 
			strArr[2] = ""+ toswap[1] + toswap[0] + toswap[2]; 
			strArr[3] = ""+ toswap[1] + toswap[2] + toswap[0]; 
			strArr[4] = ""+ toswap[2] + toswap[0] + toswap[1]; 
			strArr[5] = ""+ toswap[2] + toswap[1] + toswap[0]; 
			return strArr;
		}
		public int factorial(int num) {
			int factorial = 1;
			for(int i = 1; i <= num; ++i)
	        {
	            // factorial = factorial * i;
	            factorial *= i;
	        }
			return factorial;
		}

}
