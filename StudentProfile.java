public class StudentProfile
{
    String StudentName;
    int StudentRollNo;
    int StudentMarks;
   public void setStudentDetails(String Name, int RollNo, int Marks)
   {
        StudentName = Name;
        StudentRollNo = RollNo;
        StudentMarks = Marks;
   }
   public void getStudentDetails()
   {
       System.out.println("Name: "+StudentName);
       System.out.println("Roll Number: "+StudentRollNo);
       System.out.println("Marks: "+StudentMarks);
   }
}
