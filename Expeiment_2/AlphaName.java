import java.util.Scanner;
class AlphaName {
 public static void main(String[] args) {
   Scanner scanner =new Scanner(System.in);
  String[] names =new String[10];
 System.out.println("Enter 10 names:");
 for (int i=0;i<10;i++) {
  names[i]=scanner.nextLine();
 }
// Bubble sort
for(int i=0;i<names.length-1;i++){
   for(int j=0;j<names.length-i-1;j++)
  {
  if(names[j].compareToIgnoreCase(names[j+1])>0) {
      String temp=names[j];
      names[j]=names[j+1];
      names[j+1]=temp;
}
}
}
System.out.println("\n Names in alphabetical order:");
 for(String name: names){
    System.out.println(name);
}
scanner.close();
}
}
