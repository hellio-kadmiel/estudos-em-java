package app;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Program {
    public static void main(String[] args) {




        String[] linhas = new String[]{"Primeira linha", "Segunda linha", "Terceira linha"};

         String pacth  = "H:\\teste.txt ";

         try (BufferedWriter bw = new BufferedWriter(new FileWriter(pacth, true))){
             for (String linha : linhas){
                 bw.write(linha);
                 bw.newLine();
             }
         }
         catch (IOException e){
                System.out.println("Erro ao gravar arquivo: " + pacth);
         }


    }




}




