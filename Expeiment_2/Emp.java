class Emp {
    String firstName;
    String lastName;
    double monthlySalary;

 Emp(String firstName,String lastName,double monthlySalary){
      this.firstName=firstName;
      this.lastName=lastName;
      setMonthlySalary(monthlySalary);
}

void setFirstName(String firstName)
{
    this.firstName=firstName;
}
 String getFirstName(){
 return firstName;
}

void setLastName(String lastName)
{
    this.lastName=lastName;
}
 String getLastName(){
 return lastName;
}

void setMonthlySalary( double monthlySalary){
if(monthlySalary>0) {
     this.monthlySalary=monthlySalary;
 }
else{
 this.monthlySalary=0.0;
}
}

double getmonthlySalary() {
 return monthlySalary;
}

double getYearlySalary() {
 return monthlySalary*12;
}

void giveRaise(double percentage) {
 if (percentage>0) {
   monthlySalary +=monthlySalary *percentage /100;
}
}
}

class EmpTest{
 public static void main(String[] args) {
 Emp e1= new Emp("Sai","Kashid",60000);
 Emp e2= new Emp("Krudha","Patil",56000);

System.out.println(e1.getFirstName()+""+e1.getLastName()+"'s yearly salary:"+e1.getYearlySalary());
System.out.println(e2.getFirstName()+""+e2.getLastName()+"'s yearly salary:"+e2.getYearlySalary());

e1.giveRaise(10);
e2.giveRaise(10);

System.out.println("\n After a 10% raise:");
System.out.println(e1.getFirstName()+""+e1.getLastName()+"'s yearly salary:"+e1.getYearlySalary());
System.out.println(e2.getFirstName()+""+e2.getLastName()+"'s yearly salary:"+e2.getYearlySalary());
}
}







