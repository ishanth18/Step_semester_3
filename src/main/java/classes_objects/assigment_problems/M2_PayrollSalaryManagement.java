package classes_objects.class_problems;
public class M2_PayrollSalaryManagement {
    static class PayrollAccount {
        private double basicSalary; private double bonus;
        public PayrollAccount(double basicSalary){if(basicSalary<0){System.out.println("Warning: negative salary rejected");this.basicSalary=0;}else this.basicSalary=basicSalary;}
        public void creditBonus(double amount){if(amount<=0)System.out.println("Invalid bonus amount");else{bonus+=amount;System.out.println("Bonus credited: Rs "+amount);}}
        public void deductTax(double percent){if(percent<0||percent>100){System.out.println("Invalid tax percentage");return;}basicSalary-=basicSalary*percent/100;System.out.println("Tax deducted: "+percent+"%");}
        public double getNetSalary(){return basicSalary+bonus;}
    }
    public static void main(String[] args){PayrollAccount p=new PayrollAccount(50000);p.creditBonus(5000);p.deductTax(10);System.out.println("Net salary: Rs "+p.getNetSalary());}
}