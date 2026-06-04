import java.util.Scanner;
public class TwoDimArray{
    public static void main(String[] args) {
//         int marks[][] =  {
// 						{5,6,7},
// 						{7,8,9},
// 						{4,8,3},
// 						{1,2,3},
// 						{4,2,1}
// 					};
	
// 		for(int i=0;i<marks.length;i++)
// 		{
// 			for(int j=0;j<marks[0].length;j++)
// 			{
// 					System.out.print(marks[i][j]);
// 			}
// 			System.out.println("\n");
//         }
//     }
// }


    // public static void main(String[] args) {
    //     int marks[][] =  {
	// 					{5,6,7},
	// 					{7,8,9},
	// 					{4,8,3},
	// 					{1,2,3},
	// 					{4,2,1}
	// 				};
	
	// 	for(int i=0;i<marks.length;i++)
	// 	{
	// 		int sum = 0;
	// 		for(int j=0;j<marks[0].length;j++)
	// 		{
	// 			System.out.print(marks[i][j] + " ");
	// 			sum += marks[i][j];	
	// 		}
	// 		System.out.println(sum);
    //     }
    // }

	


    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     System.out.println("Enter no.of students: ");
    //     int n = sc.nextInt();
    //     System.out.println("Enter no.of subjects: ");
    //     int m = sc.nextInt();
    //     int marks[][] = new int [n][m];
    //     for (int i = 0; i < n; i++) {
    //         System.out.println("Enter marksof student: "+i);
    //         for(int j=0;j<m;j++){
    //             marks[i][j] = sc.nextInt(); 
    //         }
    //     }
	// }
    Scanner sc = new Scanner(System.in);
		System.out.println("enter no of students");
		int n = sc.nextInt();
		System.out.println("enter no of subjects");
		int m = sc.nextInt();
		int marks[][] = new int[n][m];
		for (int i = 0; i < n; i++) {
			System.out.println("enter marks of student:"+i);
			for (int j = 0; j < m; j++) {
				marks[i][j]= sc.nextInt();
			}
		}

		for (int i = 0; i < n; i++) {
			
			for (int j = 0; j < m; j++) {
				System.out.print(marks[i][j]);
			}
			System.out.println();
		}
	}		
}
