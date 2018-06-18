import java.util.Scanner;
public class Median {
 public static void main(String[] args){
  double med;
  double med1;
  Scanner input = new Scanner(System.in);
  System.out.println("Enter the size of the first array");
  int m = input.nextInt();
  System.out.println("Enter the size of the second array");
  int n = input.nextInt();
  int[] nums1 = new int[m];
  int[] nums2 = new int[n];
  System.out.println("Enter the numbers in the first array(Sorted)");
  for (int i = 0; i < m; i++) {
   nums1[i] = input.nextInt();
  }
  System.out.println("Enter the numbers in the second array (Sorted)");
  for (int j = 0;j<n;j++) {
    nums2[j] = input.nextInt();
  }
  if ((nums1.length) % 2 == 0 ){
    med = (nums1[(m/2)-1] + nums1[m/2])/2.0;
  } else {
    med = nums1[m/2];
  }
  if ((nums2.length) % 2 == 0) {
    med1 = (nums2[(n/2)-1] + nums2[n/2])/2;
  } else {
    med1 = nums2[n/2];
  }
  System.out.println("The median of the first array is " +med);
  System.out.println("The median of the second array is" +med1);

 }
}
