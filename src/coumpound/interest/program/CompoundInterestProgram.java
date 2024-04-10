package compound.interest.program;

import java.util.Scanner;
public class CompoundInterestProgram {

    public static void main(String[] args) {
    int p, t, n;
    double a,r, ci;
    
    Scanner st= new Scanner (System.in);
    
    System.out.println("Enter the principal amount: ");
    p = st.nextInt();
    
    System.out.println("Enter the rate of interest: ");
    r = st.nextFloat();
    
    System.out.println("Enter the time in years: ");
    t = st.nextInt();
    
    System.out.println("Enter the type of coumpond interest: yearly/ half-yearly/ quarterly etc ");
    n = st.nextInt();
    
    a = p*Math.pow((1+r/(n*100)), (n*t));
    ci = a - p;
    System.out.println("The compound Interest is " + ci);
    }
    
}
