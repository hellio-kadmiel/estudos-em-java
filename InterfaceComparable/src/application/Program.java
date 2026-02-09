package application;

import entities.Employee;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        String path = "C:\\Users\\kadmi\\OneDrive\\Área de Trabalho\\Git_Estudo\\in.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String employeeCsv = br.readLine();

            while (employeeCsv != null) {
                String[] fields = employeeCsv.split(",");

                // Verificar se tem pelo menos 2 campos
                if (fields.length >= 2) {
                    String name = fields[0];
                    double salary = Double.parseDouble(fields[1]);
                    list.add(new Employee(name, salary));
                } else {
                    System.out.println("Linha inválida: " + employeeCsv);
                }

                employeeCsv = br.readLine();
            }

            Collections.sort(list);

            for (Employee emp : list) {
                System.out.println(emp.getName() + ", " + String.format("%.2f", emp.getSalary()));
            }

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Error parsing number: " + e.getMessage());
        }
    }
}