import java.util.Calendar;

public class Staff extends Employee {

    protected int RateHours;

    public int getRateHours() {
        return RateHours;
    }


    public void setRateHours(int NewHoursRate) {
        this.RateHours = NewHoursRate;
    }

    public Staff(String last_name, String first_name, String id_number, String sex, Calendar birth_date, int RateHours) {
        super(last_name, first_name, id_number, sex, birth_date);
        this.RateHours = RateHours;
    }

    @Override
    public int monthlyEarning() {
        return RateHours * 160;
    }
}