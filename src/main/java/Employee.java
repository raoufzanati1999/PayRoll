import java.util.Calendar;
import java.util.GregorianCalendar;

public abstract class Employee {

    private String last_name;

    public String getLast_name() {
        return last_name;
    }


    public void setLast_name(String last_name ) {
        this.last_name = last_name ;
    }
    String first_name;

    public String getFirst_name() {
        return first_name;
    }


    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }
    String id_number;

    public String geId_number() {
        return id_number;
    }


    public void setId_number(String id_num) {
        this.id_number = id_num;
    }
    String sex;

    public String getSex() {
        return sex;
    }


    public void setSex(String newSex) {
        this.sex = newSex;
    }
    Calendar birth_date;

    public Calendar getBirth_date() {
        return birth_date;
    }


    public void setBirth_date(Calendar newBirth_date) {
        this.birth_date = newBirth_date;
    }


    public Employee(String last_name, String first_name, String id_number, String sex, Calendar birth_date){
        this.last_name = last_name;
        this.first_name= first_name;
        this.id_number = id_number;
        this.sex = sex;
        this.birth_date = birth_date;
    }

    @Override
    public String toString(){

        int i = this.birth_date.get(Calendar.MONTH);
        String month = null;

        if(i == 1){
            month = "January";
        } else if (i==2){
            month = "February";
        } else if (i==3){
            month = "March";
        } else if (i==4){
            month = "April";
        } else if (i==5){
            month = "May";
        } else if (i==6){
            month = "June";
        } else if (i==7){
            month = "July";
        } else if (i==8){
            month = "August";
        } else if (i==9){
            month = "September";
        } else if (i==10){
            month = "October";
        } else if (i==11){
            month = "November";
        } else if (i==12){
            month = "December";
        }


        return "ID Employee number: " + this.id_number +"\n" +
                "Employee name: " + this.first_name + " " + this.last_name + "\n" +
                "Birth date: " + this.birth_date.get(Calendar.DAY_OF_MONTH)+ " " + month + " " + this.birth_date.getWeekYear() + "\n";
    }

    public abstract int monthlyEarning();

}