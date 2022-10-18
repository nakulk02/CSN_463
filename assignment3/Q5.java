package assignment3;
import java.util.ArrayList;

public class Q5 {
	static int dp[][];

	static ArrayList<ArrayList<String> > arrs =	new ArrayList<ArrayList<String> >();
	
	static void printAllChanges(String str1,String str2, ArrayList<String> changes)
	{

		int i = str1.length();
		int j = str2.length();

		while (true) {

			if (i == 0 || j == 0) {

				arrs.add(changes);
				break;
			}

			if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
				i--;
				j--;
			}

			else {
				boolean if1 = false, if2 = false;
				if (dp[i][j] == dp[i - 1][j - 1] + 1) {

					changes.add("Change " + str1.charAt(i - 1)
								+ " to " + str2.charAt(j - 1));
					i--;
					j--;

					if1 = true;
				}
				if (dp[i][j] == dp[i - 1][j] + 1) {
					if (if1 == false) {
						changes.add("Delete " + str1.charAt(i - 1));
						i--;
					}
					else {
						ArrayList<String> changestr2 = new ArrayList<String>();
						changestr2.addAll(changes);
						changestr2.remove(changes.size() - 1);
						changestr2.add("Delete " + str1.charAt(i));
						printAllChanges(str1.substring(0, i),
										str2.substring(0, j + 1), changestr2);
					}

					if2 = true;
				}
				if (dp[i][j] == dp[i][j - 1] + 1) {
					if (if1 == false && if2 == false) {
						changes.add("Add " + str2.charAt(j - 1));
						j--;
					}
					else {
						ArrayList<String> changestr2 = new ArrayList<String>();
						changestr2.addAll(changes);
						changestr2.remove(changes.size() - 1);
						changestr2.add("Add " + str2.charAt(j));
						printAllChanges(str1.substring(0, i + 1),
										str2.substring(0, j), changestr2);
					}
				}
			}
		}
	}

	static void editDP(String str1, String str2)
	{
		int l1 = str1.length();
		int l2 = str2.length();
		int[][] DP = new int[l1 + 1][l2 + 1];
		for (int i = 0; i <= l1; i++)
			DP[i][0] = i;
		for (int j = 0; j <= l2; j++)
			DP[0][j] = j;
		for (int i = 1; i <= l1; i++) {
			for (int j = 1; j <= l2; j++) {
				if (str1.charAt(i - 1) == str2.charAt(j - 1))
					DP[i][j] = DP[i - 1][j - 1];
				else {
					DP[i][j] = min(DP[i - 1][j - 1],
								DP[i - 1][j], DP[i][j - 1])
							+ 1;
				}
			}
		}
		dp = DP;
	}
	static int min(int a, int b, int c)
	{
		int z = Math.min(a, b);
		return Math.min(z, c);
	}
	static void printWays(String str1, String str2,	ArrayList<String> changes)
	{
		printAllChanges(str1, str2, new ArrayList<String>());

		int i = 1;
		for (ArrayList<String> ar : arrs) {
			System.out.println("\nMethod " + i++ + " : \n");
			for (String s : ar) {
				System.out.println(s);
			}
		}
	}

	public static void main(String[] args)
	{
		String str1 = "abcdef";
		String str2 = "axcdfdh";
		editDP(str1, str2);
		printWays(str1, str2, new ArrayList<String>());
	}
}
