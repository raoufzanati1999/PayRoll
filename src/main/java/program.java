import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.util.Arrays;
import java.util.Collections;
import java.util.GregorianCalendar;
import java.util.Comparator;

public class program {

    public static void main(String[] args){

        Employee[] employee = new Employee[9];
        employee[0] = new Staff("Pita","Allen", "10124254","M", new GregorianCalendar(1959,2,23), 20);
        employee[1] = new Staff("Steven", "Zapata","1121241" ,"F", new GregorianCalendar(1964,7,12), 11);
        employee[2] = new Staff("Enrique","Rios", "1212342","M", new GregorianCalendar(1970, 6, 2),23);

        employee[3] = new Faculty("Anne","Johnson","133234","F", new GregorianCalendar(1962, 4, 27), 23, Faculty._level.FU, new Education("Ph.D","Engineering","IT"));
        employee[4] = new Faculty("William", "Boris", "142345", "F", new GregorianCalendar(1975,3,14), 33,Faculty._level.AS, new Education("Ph.D","English", "Ancient English"));
        employee[5] = new Faculty("Christopher","Andrade", "1521452", "F", new GregorianCalendar(1980,5,22),14,Faculty._level.AS, new Education("MS","Physical Education","Physical forces"));

        employee[6] = new Partime("Augusto","Guzman","1612415","F",new GregorianCalendar(1977, 8, 10),35,30);
        employee[7] = new Partime("Martin","Pierrot","24123124","F",new GregorianCalendar(1987, 9, 15),30, 15);
        employee[8] = new Partime("Marque","Alda co","4141351","M",new GregorianCalendar(1988,11,24), 20, 35);


        System.out.println("All Employees data");
        System.out.println("#Staff");
        for(int i=0;i<3;i++){
            System.out.println(employee[i]);
        }
        System.out.println("#Faculty");
        for(int i=3;i<6;i++){
            System.out.println(employee[i]);
        }
        System.out.println("#Part-time");
        for(int i=6;i<9;i++){
            System.out.println(employee[i]);
        }


        double total = 0;
        for(int i=6;i<9;i++)
            total += employee[i].monthlyEarning();
        System.out.println("Total monthly salary for all part-time staff is: " + total);

        total = 0;
        for(int i=0;i<9;i++)
            total += employee[i].monthlyEarning();
        System.out.println("Total month salary for all employees is : " + total);





        System.out.println("/n sort by last name");
        Arrays.sort(employee, new EmployeeComparer());
        for(int i=0;i<9;i++)
            System.out.println(employee[i].toString());



        Employee faculty = new Faculty("Anne","Johnson","143234","F", new GregorianCalendar(1962, 4, 27), 23, Faculty._level.FU, new Education("Ph.D","Engineering","IT"));
        Employee duplicateFaculty = (Faculty)((Faculty)faculty).duplicate();
        if(duplicateFaculty == null)
            System.out.println("Duplicate false.");
        else
            System.out.println("Duplicate faculty: " + duplicateFaculty);
    }
}