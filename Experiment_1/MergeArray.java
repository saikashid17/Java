import java.util.Scanner;
import java.util.Arrays;
 class MergeArray{
public static void main (String[] args){
   Scanner sc = new Scanner(System.in);
System.out.println("Enter a the no.of elements in first sorted array :");
  int n1=sc.nextInt();
int[] array1=new int[n1];
System.out.println("Enter elements of first array :");
  for(int i=0;i<n1;i++){
      array1[i]=sc.nextInt();
}

System.out.println("Enter a the no.of elements in second sorted array :");
  int n2=sc.nextInt();
int[] array2=new int[n1];
System.out.println("Enter elements of second array :");
  for(int i=0;i<n2;i++){
      array2[i]=sc.nextInt();
}

int[] mergedArray = new int[n1+ n2];
int i=0,j=0, k=0;
while (i<n1 && j<n2) {
 if(array1[i]<array2[i]) {
    mergedArray[k++]=array1[i++];
} else {
    mergedArray[k++]=array2[j++];
}
while (i<n1) {
mergedArray[k++]=array1[i++];
}
while(j<n2) {
mergedArray[k++]=array2[j++];
}
System.out.println("Merged sorted array:"+ Arrays.toString(mergedArray));
sc.close();
}
}
}

  


