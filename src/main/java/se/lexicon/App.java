package se.lexicon;

public class App {
    private  static int accountNumber=100;
    private  static double balance= 0;
    private  static String customerName="";
    private  static  String email= " ";
    private static   String phoneNumber= "";

    public  App(){
        this.accountNumber =++ accountNumber;
    }
    public App(double balance, String customerName, String email, String phoneNumber ){
        this();
        this.balance=balance;
        this.customerName = customerName;
        this.email=email;
        this.phoneNumber=phoneNumber;
    }

    public static int getAccountNumber() {
        return accountNumber;
    }

    public static void setAccountNumber(int accountNumber) {
        App.accountNumber = accountNumber;
    }

    public static double getBalance() {
        return balance;
    }

    public static void setBalance(double balance) {
        App.balance = balance;
    }

    public static String getCustomerName() {
        return customerName;
    }

    public static void setCustomerName(String customerName) {
        App.customerName = customerName;
    }

    public static String getEmail() {
        return email;
    }

    public static void setEmail(String email) {
        App.email = email;
    }

    public static String getPhoneNumber() {
        return phoneNumber;
    }

    public static void setPhoneNumber(String phoneNumber) {
        App.phoneNumber = phoneNumber;
    }
    public static String personInformation(){
        return  "Person information: " + balance + " "+ customerName+ " " + email+ " " + phoneNumber;
    }

    public static void main(String[] args )
    {
        App name = new App(100, "Nuna Anderson", "nuna@gmail.com","0732169988" );
        System.out.println(App.personInformation());
    }
}
