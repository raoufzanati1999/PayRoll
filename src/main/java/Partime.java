import java.util.Calendar;

public class Partime extends Staff{

    protected int hwpw;

    public int getHwpw() {
        return hwpw;
    }


    public void setHwpw(int newHwpw) {
        this.hwpw = newHwpw;
    }


    public Partime(String last_name, String first_name, String id_number, String sex, Calendar birth_date, int RateHours, int hwpw) {
        super(last_name, first_name, id_number, sex, birth_date, RateHours);
        this.hwpw = hwpw;
    }

    public String toString(String last_name, String first_name, String id_number, String sex, Calendar birth_date, int RateHours){

        int hwpm = RateHours * hwpw * 4;
        int monthlySalary = hwpm * 160;

        return "ID Employee number :{id_number}\n" +
                "Employee name: {first_name} {last_name}\n" +
                "Birth date: {birth_date}\n" +
                "Hours works per month: ${hwpm}\n" +
                "Monthly Salary: ${monthlySalary}\n";
    }

}
