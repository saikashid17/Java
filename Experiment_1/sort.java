import java.util.Scanner;
import java.util.Arrays;
 class SortArray{
 public static void SortArray(int[] arr) {
 int n=arr.length;
   for (int i=0;i<n;i++){
int key=arr[i];
int j=i-1;
while(j>=0 && arr[j]>key){
arr[j+1]=arr[j];
j--;
}
arr[j+1]=key;
}
}

 public static void main (String[] args){
   Scanner sc = new Scanner(System.in);
int[] numbers=new int[10];
 System.out.println("Enter 10 number :");
  for(int i=0;i<10;i++){
      numbers[i]=sc.nextInt();
}
sc.close();

SortArray(numbers);
System.out.println("Sorted number in asending order:");
for(int num : numbers){
System.out.println(num+"");
}
}
}





