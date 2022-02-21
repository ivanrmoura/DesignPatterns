package com.lsdi.desingnpattern.structural.composite;

public class CompositeDemo {

    public static void main(String[] args) {
        Department salesDepartament = new SalesDepartment(
                1,"Sales departamente"
        );

        Department financialDepartamente = new FinancialDepartment(
                2, "Finacial departament"
        );

        HeadDepartment headDepartment = new HeadDepartment(
                3, "headDepartament"
        );

        headDepartment.addDepartment(salesDepartament);
        headDepartment.addDepartment(financialDepartamente);

        headDepartment.printDepartmentName();

    }
}
