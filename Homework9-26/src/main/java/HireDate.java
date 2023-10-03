public class HireDate {
    private String month;
    private String date;
    private String year;
    public HireDate(String month, String date, String year) {
        this.month = month;
        this.date = date;
        this.year = year;
    }
    public String getMonth() {
        return month;
    }
    public void setMonth(String month) {
        this.month = month;
    }
    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }
    public String getYear() {
        return year;
    }
    public void setYear(String year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "HireDate{" +
                "month='" + month + '\'' +
                ", date='" + date + '\'' +
                ", year='" + year + '\'' +
                '}';
    }
}






