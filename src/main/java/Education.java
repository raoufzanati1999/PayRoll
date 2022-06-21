public class Education {
    String degree;
    
    public String getDegree() {
        return degree;
    }

   
    public void setDegree(String degree) {
        this.degree = degree;
    }
    String major;
    
    public String getMajor() {
        return major;
    }

    
    public void setMajor(String major) {
        this.major = major;
    }
    String research;
    
    public String getResearch(){
        return research;
    }
    
    public void setResearch(String Reseacrh ){
        this.research = Reseacrh ;
    }

    public Education(String degree, String major, String research){
        this.degree = degree;
        this.major = major;
        this.research = research;
    }
}

