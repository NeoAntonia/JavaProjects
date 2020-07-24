class StudentProfile {
    String FirstName;
    String LastName;
    double expectedYearGraduation;
    double GPA;
    String DeclaredMajor;

    //Constructor
    public StudentProfile(String firstName, String lastName, double expectedYearGraduation, double GPA, String declaredMajor){
        this.FirstName = firstName;
        this.LastName = lastName;
        this.expectedYearGraduation = expectedYearGraduation;
        this.GPA = GPA;
        this.DeclaredMajor = declaredMajor;
    }
    //methods
    public  void  incrementGraduation(){
        System.out.println("Student Profile Created;");
        System.out.println(FirstName + " "+ LastName + " " + expectedYearGraduation+ " " + GPA +" " + DeclaredMajor);
    }

}
