class Account {
    private String AccountNumber;
    private String Name;
    private String Address;
    private int PhoneNo;
    private String Dob;
    protected int Balance;

    Account(String AccountNumber, String Name, String Address, int PhoneNo, String Dob) {
        this.AccountNumber = AccountNumber;
        this.Name = Name;
        this.Address = Address;
        this.PhoneNo = PhoneNo;
        this.Dob = Dob;
    }

    public String getAccountNo() {
        return AccountNumber;
    }

    public String getName() {
        return Name;
    }

    public String getAddress() {
        return Address;
    }

    public int getPhone() {
        return PhoneNo;
    }

    public String getDob() {
        return Dob;
    }

    public int getBalance() {
        return Balance;  // Corrected return type
    }

    public void setAddress(String Address) {
        this.Address = Address;  // Corrected assignment
    }

    public void setPhno(int phno) {
        this.PhoneNo = phno;
    }
}

class SavingsAccount extends Account {
    SavingsAccount(String AccountNumber, String Name, String Address, int PhoneNo, String Dob) {
        super(AccountNumber, Name, Address, PhoneNo, Dob); // Call to the superclass constructor
    }
    public void deposit(long amt) {
        Balance += amt;
    }

    public void withdraw(long amt) {
        Balance -= amt;
    }
}

class LoanAccount extends Account {
    LoanAccount(String AccountNumber, String Name, String Address, int PhoneNo, String Dob) {
        super(AccountNumber, Name, Address, PhoneNo, Dob); // Call to the superclass constructor
    }
    public void payEMI(long amt) {
        Balance -= amt;
    }

    public void repay(long amt) {
        if (Balance == amt) {
            Balance = 0;  // Corrected the variable name and logic
        }
    }
}
