import java.util.Scanner;

public class RemainingWork {

	public static void main(String[] args) {

		int totwork;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Total Work : ");
		totwork = sc.nextInt();

		System.out.println("Remaining Work = " + getRemWork(totwork));
		sc.close();

	}

	public static int getRemWork(int totwork) {

		int force1, force2, distance1, distance2, work1, work2, remwork;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the force1 : ");
		force1 = sc.nextInt();

		System.out.println("Enter the Distance1 : ");
		distance1 = sc.nextInt();

		work1 = force1 * distance1;
		System.out.println("Work done by 1st Person :" + work1);

		System.out.println("Enter the force2 : ");
		force2 = sc.nextInt();

		System.out.println("Enter the Distance2 : ");
		distance2 = sc.nextInt();

		work2 = force2 * distance2;
		System.out.println("Work done by 2nd Person :" + work2);

		remwork = totwork - (work1 + work2);
		sc.close();

		return remwork;

	}

}
