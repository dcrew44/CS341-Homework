

public class TileArray {
	private Tile[] val;
	
	public TileArray(Tile[] val) {
		this.val = val;
	}

	public String scrabble(TileArray arr, int l, int r, String str) {
		if (l == r ) 
			return str += arr.toString()+", ";
		else {
			for (int i = l; i <= r; i++) {
				arr = swap(arr,l,i);
				scrabble(arr, l+1, r, str);
				arr = swap(arr, l,i);
			}
		}
		
	}
	
	public TileArray swap(TileArray a, int i, int j) {
		Tile temp = a.val[i];
		a.val[i] = a.val[j];
		a.val[j] = temp;
		return a;
		
	}
	
	public int length() {
		return val.length;
	}
	
	public String toString() {
		String out = "";
		for(int i = 0; i < val.length; i++) {
			out += val[i].getVal();
		}
		return out;
	}
}
