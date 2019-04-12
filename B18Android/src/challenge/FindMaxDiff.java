package challenge;

public class FindMaxDiff {
	
	public static int findMax(int[] a) {
//		int ans = 0;
		int max = a[0];
		for (int i = 1; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];
			}
		}
		return max;
	}

	public static void main(String[] args) {
		int[] a = {2,3,10,2,4,8,1};//n = 7 
		int[] allAns = new int[a.length * (a.length - 1)];
		int counter = 0;
		//1.iterate all the result from subtraction
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if (i != j && counter <= allAns.length) {
					allAns[counter] = Math.abs(a[i] - a[j]);
					counter++;
				}
			}
		}
		
		//2.use findMax() to find out max dif from the all result array.
		int ans = findMax(allAns);
		System.out.println(ans);//expect 9 : 10 - 1 = 9
	}
}
