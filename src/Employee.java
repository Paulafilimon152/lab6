public class Employee {
    private String name;
    private String email;
    private double hourRate;
    private int capacity;
    private int freeDays;
    private double DailyIncome;
    private double MonthlyIncome;
    public Employee(String name,String email,double hourRate,int capacity,int freeDays,double DailyIncome,double MonthlyIncome){
        this.name=name;
        this.email=email;
        this.hourRate=hourRate;
        this.capacity=capacity;
        this.freeDays=freeDays;
        this.DailyIncome=DailyIncome;
        this.MonthlyIncome=MonthlyIncome;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setEmail(String email){
        this.email=email;
    }
    public void setHourRate(double hourRate){
        this.hourRate=hourRate;
    }
    public void setCapacity(int capacity){
        this.capacity=capacity;
    }
    public void setFreeDays(int freeDays){
        this.freeDays=freeDays;
    }
    public String getName(){
        return name;
    }
    public String getEmail(){
        return email;
    }
    public double getHourRate(){
        return hourRate;
    }
    public int getCapacity(){
        return capacity;
    }
    public int getFreeDays(){
        return freeDays;
    }
    public double getDailyIncome(){
        return this.DailyIncome=this.hourRate* this.capacity;
    }
    public double getMonthlyIncome(){
        return this.MonthlyIncome=this.DailyIncome*(30-this.freeDays);
    }

}
