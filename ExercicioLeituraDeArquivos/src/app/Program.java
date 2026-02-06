package app;

import entities.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Product> lista = new ArrayList<>();
        System.out.println("entre como caminho de entrada do arquivo:");
        String sourceFileStr = sc.nextLine();

        File sorceFile = new File(sourceFileStr);
        String caminhoDeOrigem = sorceFile.getParent();
        System.out.println("caminho de origem: " + caminhoDeOrigem);

        // logica para criar pasta / e com Boolean
        boolean sucesso = new File(caminhoDeOrigem + "/out").mkdir();
        System.out.println("pasta criada com sucesso: " + sucesso);

        String targetFileStr = caminhoDeOrigem + "/out/summary.csv";
        try (BufferedReader br = new BufferedReader(new FileReader(sourceFileStr))) {

            String itemCsv = br.readLine();
            while (itemCsv != null){
                // o split separa os campos do csv em valores individuais
                String[] fields = itemCsv.split(",");
                String nome = fields[0];
                double price = Double.parseDouble(fields[1]);
                int quantity = Integer.parseInt(fields[2]);
                lista.add(new Product(nome,price,quantity));


                itemCsv = br.readLine();
            }
            try ( BufferedWriter bw = new BufferedWriter(new FileWriter(targetFileStr))){
                for (Product item:lista){
                    bw.write(item.getName() + "," + String.format("%.2f",item.total()));
                    bw.newLine();
                }
                System.out.println("arquivo criado em: " + targetFileStr);

            }catch (IOException e){
                System.out.println("Error na escrita: " + e.getMessage());

            }
        }catch (IOException e){
            System.out.println("Error na leitura: " + e.getMessage());
        }



        sc.close();


    }

}
