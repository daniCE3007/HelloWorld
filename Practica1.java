/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica1;
import javax.swing.JOptionPane;

//Practica 1
/* Escriba un programa que lea el nombre del trabajador y su salario semanal,
con esta información calcule su salario mensual sin deducciones (salario bruto),
el monto de las deducciones (que corresponden a un 9.34%) y el salario
después de aplicadas las deducciones (salario neto), finalmente debe mostrar los datos al usuario de la
siguiente manera.
 */

/**
 *
 * @author kramirez
 */
public class Practica1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //User variables
        String name = JOptionPane.showInputDialog("Digite su nombre: ");
        float salary = Float.parseFloat(JOptionPane.showInputDialog("Digite su salario semanal: "));
        
        //Calculations
        float grosssalary = salary * 4;
        float deductions = grosssalary * 0.0934f;
        float netsalary = grosssalary - deductions;

        //Show results
        JOptionPane.showMessageDialog(null, "Nombre del trabajador: " + name + "\nSalario semanal: " + salary + 
        "\nSalario mensual bruto: " + grosssalary + "\nDeducciones: " + deductions + "\nSalario mensual neto: " + netsalary);

    }
    
}
