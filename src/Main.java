//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.*;



void main() {
    Scanner sc = new Scanner(System.in);

    double RegMid = sc.nextDouble(), RegEnd, Final, RegTerm, Total;

    if (RegMid < 25) {
        System.out.println("Retake");
    }
    else{
        RegEnd = sc.nextDouble();
        if (RegEnd < 25) {
            System.out.println("Retake");
        }
        else{
            RegTerm = (RegMid + RegEnd) / 2 * 0.3;
            if (RegTerm < 50) {
                System.out.println("Retake");
            } else {
                Final = sc.nextDouble();
                if (Final > 25 && Final < 50){
                    System.out.println("FX");
                }
                Total = RegTerm + Final * 0.4;
                if (Final < 25 || Total < 50){
                    System.out.println("Retake");
                }
                else{
                    System.out.println("Total = " + Total);
                }
            }
        }
    }



}

