package pekan4;

public class PerulanganFor8 {

	public static void main(String[] args) {
			int x = 16;
			int n = 4;
			int j, i;
			System.out.print("#");
			for ( i = 1; i <= x; i ++) {
				System.out.print("=");
			}
			System.out.println("#");
			for ( i = 1; i <= n; i ++) {
				for ( j =1; j <= 1; j++) {
					System.out.print("|");
				}
				for ( j = i; j < n; j ++) {
					System.out.print("  ");
				}
				for ( j =1; j <= 1; j++) {
					System.out.print("<>");
				}
				for ( j = 1; j < i; j ++) {
					System.out.print("**");
				}
				for ( j = 1; j < i; j ++) {
					System.out.print("**");
				}
				for ( j =1; j <= 1; j++) {
					System.out.print("<>");
				}
				for ( j = i; j < n; j ++) {
					System.out.print("  ");
				}
				for ( j = i; j <= i; j ++) {
					System.out.println("|");
				}
			}
			for ( i = 1; i <= n; i ++) {
				for ( j =1; j <= 1; j++) {
					System.out.print("|");
				}
				for ( j = 1; j < i; j ++) {
					System.out.print("  ");
				}
				for ( j =1; j <= 1; j++) {
					System.out.print("<>");
				}
				for ( j = i; j < n; j ++) {
					System.out.print("**");
				}
				for ( j = i; j < n; j ++) {
					System.out.print("**");
				}
				for ( j = 1; j <= 1; j++) {
					System.out.print("<>");
				}
				for ( j = 1; j < i; j ++) {
					System.out.print("  ");
				}
				for ( j =1; j <= 1; j++) {
					System.out.println("|");
				}
			}
			System.out.print("#");
			for ( i = 1; i <= x; i ++) {
				System.out.print("=");
			}
			System.out.println("#");
		}

	}

