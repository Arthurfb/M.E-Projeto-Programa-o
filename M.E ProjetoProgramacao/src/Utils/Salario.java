/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utils;

/**
 *
 * @author Arthurfb
 */
public class Salario {

    private double salarioBruto, salarioLiquido, inss, irrf;

    public void calcularSalario() {
        getSalarioLiquido();
    }

    public double getSalarioBruto() {
        return salarioBruto;
    }

    public void setSalarioBruto(double salarioBruto) {
        this.salarioBruto = salarioBruto;
    }

    public double getSalarioLiquido() {
        return salarioLiquido - (this.inss + this.irrf);
    }

    public void setSalarioLiquido(double salarioLiquido) {
        this.salarioLiquido = salarioLiquido;
    }

    public double getInss() {
        return inss;
    }

    public void setInss(double inss) {
        this.inss = inss;
    }

    public double getIrrf() {
        return irrf;
    }

    public void setIrrf(double irrf) {
        this.irrf = irrf;
    }

    public double calculoIrrf() {
        if (salarioBruto < 1903.99) {
            irrf = 0;
        } else if (salarioBruto >= 1903.99 && salarioBruto <= 2826.65) {
            irrf = (float) ((salarioBruto * 7.5) / 100);
        } else if (salarioBruto >= 2826.66 && salarioBruto <= 3751.05) {
            irrf = (float) ((salarioBruto * 15) / 100);
        } else if (salarioBruto >= 3751.06 && salarioBruto <= 4664.68) {
            irrf = (float) ((salarioBruto * 22.5) / 100);
        } else if (salarioBruto > 4664.68) {
            irrf = (float) ((salarioBruto * 27.5) / 100);
        }
        return irrf;
    }

    public double calculoInss() {
        if (salarioBruto <= 1693.72) {
            inss = ((salarioBruto * 8) / 100);
        } else if (salarioBruto > 1693.72 && salarioBruto <= 2822.90) {
            inss = ((salarioBruto * 9) / 100);
        } else if (salarioBruto >= 2822.91 && salarioBruto <= 5645.80) {
            inss = ((salarioBruto * 11 / 100));
        } else if (salarioBruto > 5645.80) {
            inss = (float) 621.03;
        }
        return inss;
    }
}
