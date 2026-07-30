import java.util.Scanner;

class ascendinginarray 
{
public static void main(String[] args) 
{

Scanner sc = new Scanner(System.in);

System.out.print("How many elements? : ");
int n = sc.nextInt();

int[] a = new int[n];

for (int i = 0; i < n; i++) {
System.out.print("Enter value = ");
a[i] = sc.nextInt();
}

        
for (int i = 0; i < n; i++) {
    for (int j = i + 1; j < n; j++) {
        if (a[i] > a[j]) {
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
                }
            }
        }

System.out.println("\nAscending Order:");
for (int i = 0; i < n; i++) {
System.out.println(a[i]);
}

}
}