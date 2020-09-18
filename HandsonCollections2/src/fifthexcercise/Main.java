package fifthexcercise;
import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			System.out.println("Enter the mode u want to sort the data");
			System.out.println("1. Email wise sort" + "\n" + "2. Name wise sort");
			int i = Integer.parseInt(br.readLine());
			switch (i) {
			case 1:
				Comparator C = new EmailComparator();
				List<User> L = new ArrayList<User>();
				System.out.println("Enter the no of users");
				int n = Integer.parseInt(br.readLine());
				for (int j = 1; j <= n; j++) {
					System.out.println("The details of user " + i + " are");
					String S = br.readLine();
					String s[] = S.split(",", 4);
					L.add(new User(s[0], s[1], s[2], s[3]));
				}
				Collections.sort(L, C);
				System.out.format("%-15s %-20s %-15s %s", "Name", "ContactNumber", "CostPerDay", "OwnerName");
				Iterator<User> it = L.iterator();
				User ADD = new User();
				while (it.hasNext()) {
					ADD = it.next();
					System.out.println(ADD);
				}
				break;
			case 2:
				Comparator c = new NameComparator();
				List<User> l = new ArrayList<User>();
				System.out.println("Enter the no of users");
				int N = Integer.parseInt(br.readLine());
				for (int j = 1; j <= N; j++) {
					System.out.println("The details of user " + i + " are");
					String S = br.readLine();
					String s[] = S.split(",", 4);
					l.add(new User(s[0], s[1], s[2], s[3]));
				}
				Collections.sort(l, c);
				System.out.format("%-15s %-20s %-15s %s", "Name", "ContactNumber", "CostPerDay", "OwnerName");
				Iterator<User> IT = l.iterator();
				User add = new User();
				while (IT.hasNext()) {
					add = IT.next();
					System.out.println(add);
				}
				break;
			}

		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
