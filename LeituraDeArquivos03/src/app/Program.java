package app;

import java.io.File;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Coloque a pasta: ");
        String strPath = sc.nextLine();
        // Listando arquivos e pastas de um diretório
        File pacth = new File(strPath);
        File[] folders  = pacth.listFiles(File::isDirectory);
        System.out.println("FOLDERS:");
        for (File folder : folders) {
            System.out.println(folder);
        }

        File [] files = pacth.listFiles(File::isFile);
        System.out.println();
        System.out.println("FILES:");
        for (File file : files) {
            System.out.println(file);



    }
        // Criando um diretório ou uma pasta
        boolean sucesso = new File(strPath + "\\subdir").mkdir();
        System.out.println();
        System.out.println("Diretório criado com sucesso: " + sucesso);
        sc.close();

        //no caminho ele acha os arquivos, as pastas e mostra o nome
        System.out.println("Enter com um caminho: ");
        String strPath2 = sc.nextLine();
        File path2 = new File(strPath2);
        System.out.println("getName: " + path2.getName());
        System.out.println("getParent: " + path2.getParent());
        System.out.println("getPath: " + path2.getPath());

}
;}
