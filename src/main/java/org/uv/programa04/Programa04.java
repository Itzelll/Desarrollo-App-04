/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package org.uv.programa04;

/**
 *
 * @author Itzel
 */
public class Programa04 {

    public static void main(String[] args) {
        DAOEmpleado dAOEmpleado = new DAOEmpleado();
        Empleado emp = new Empleado();
        emp.setClave(9);
        emp.setNombre("Itzel");
        emp.setDireccion("Padelma");
        emp.setTelefono("27119");
        
        dAOEmpleado.create(emp);
    }
}
