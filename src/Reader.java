public class Reader {
   private String fullname;
    private int librarycadnumber;
    private String faculty;
    private String dateofbirth;
    private String phoneNumber;

    public Reader(String fullname, int librarycadnumber, String faculty, int dateofbirth, int phoneNumber) {
        this.fullname = fullname;
        this.librarycadnumber = librarycadnumber;
        this.faculty = faculty;
        this.dateofbirth = String.valueOf(dateofbirth);
        this.phoneNumber = String.valueOf(phoneNumber);
    }
    public void takeBook(int numberOfBooks){


        System.out.println(fullname + " vzyal " + numberOfBooks + " knigi ");
    }
    public void returnBook(int numberOfBooks){

        System.out.println(fullname + " vernul "  + " knigi ");
    }
}