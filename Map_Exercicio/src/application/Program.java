package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Map<String, Integer> votos = new LinkedHashMap<>();

        System.out.println("Local onde está o arquivo: ");
        String path = sc.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(path)))  {

            String line = br.readLine();
            while (line != null){
                String[] fields = line.split(",");
                String candidato = fields[0];
                int contagem = Integer.parseInt(fields[1]);

                if (votos.containsKey(candidato)){
                    int votosAtualizados = votos.get(candidato) + contagem;
                    votos.put(candidato, votosAtualizados);
                } else {
                    votos.put(candidato, contagem);
                }

                line = br.readLine();
            }
            for (String key : votos.keySet()){
                System.out.println("Candidatos ");
                System.out.println(key + ": " + votos.get(key));
            }

        }catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }


        sc.close();
    }
}
