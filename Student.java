class Student {
	String index;
	String firstName;
	String lastName;
        int labPoints;

	//TODO constructor
        public Point(String ID,String Fname,String Lname,int LabPoints){
               this.index=ID;
               this.firstName=Fname;
               this.lastName=Lname;
               this.labPoints=LabPoints;
        }


	//TODO seters & getters
        public void setIndex(String ID){
               this.index=ID;
        }
        public void setFirstName(String Fname){
               this.firstName=Fname;
        }
        public void setLastName(String Lname){
               this.lastName=Lname;
        }
        public void setLabPoints(int LabPoints){
               this.labPoints=LabPoints;
        }
        public String getIndex(){
               return index;
        }
        public String getFirstName(){
               return firstName;
        }
        public String getLastName(){
               return lastName;
        }
        public Int getLabPoints(){
               return labPoints;
        }   

	public double getAverage(int labPoints[],int n) {
		//TODO
        int sum=0;
        for(int i=0; i<n; i++)
        sum+=labPoints[i];

        return sum/n; 
                
	}

	public boolean hasSignature() {
		//TODO
        if (getLabPoints()==8) {
        return true;
        }
        return false;
	    }
}
class Course{
	List<Student> studenti=new List<Student>();
	public void dodadi(Student student){
		studenti.add(student);
	}
}