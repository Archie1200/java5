import java.util.Scanner;

class TotalFees {
    float fees;
    float deposit;
    TotalFees(float fees,float deposit){
        this.fees=fees;
        this.deposit=deposit;
    }
    public void discount(){
        deposit=deposit-0.05f*fees;
    }
    public void extraFees(){
        if(deposit>=(fees/2))
            discount();
        deposit+=(0.1f+0.05f)*fees;
        System.out.println(deposit);
    }
}
class Display{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter original fees greater than Rs50000");
        System.out.println("Enter the amount to be deposited greater than Rs10000");
        TotalFees obj = new TotalFees(scan.nextFloat(),scan.nextFloat());
        obj.extraFees();

    }
}

