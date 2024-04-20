package br.com.lista_atividade;

import java.io.*;

public class Byte100 {

    public static void main(String[] args) {
        String filePath = "arquivo.bin";
        int bytesToRead = 100;

        try (FileInputStream in = new FileInputStream(filePath)) {
            byte[] buffer = new byte[bytesToRead];
            int bytesRead = in.read(buffer);

            if (bytesRead == -1) {
                System.err.println("O arquivo está vazio.");
                return;
            }

            System.out.printf("Primeiros %d bytes do arquivo %s:%n", bytesToRead, filePath);
            System.out.write(buffer, 0, bytesRead);
            System.out.println();

        } catch (IOException e) {
            System.err.println("Erro ao ler o arquivo: " + e.getMessage());
        }
    }
}
