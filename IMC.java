import java.util.Scanner;

public class IMC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("""
                    ___      _         _         _                   _       ___ __  __  ___
                  / __|__ _| |__ _  _| |__ _ __| |___ _ _ __ _   __| |___  |_ _|  \\/  |/ __|
                 | (__/ _` | / _| || | / _` / _` / _ \\ '_/ _` | / _` / -_)  | || |\\/| | (__
                  \\___\\__,_|_\\__|\\_,_|_\\__,_\\__,_\\___/_| \\__,_| \\__,_\\___| |___|_|  |_|\\___|
                """);

        System.out.println("""
                =============================================
                          TABELA DE CLASSIFICAÇÃO
                =============================================
                Classificação       Masculino       Feminino
                ---------------------------------------------
                Obesidade Mórbida   > 40            > 39
                Obesidade Moderada  30 - 39,9       29 - 38,9
                Obesidade Leve      25 - 29,9       24 - 28,9
                Normal              20 - 24,9       19 - 23,9
                Abaixo do Normal    < 20            < 19
                =============================================
                """);

        System.out.print("Insira seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Insira seu gênero (M/F/N): ");
        char genero = scanner.next().charAt(0);

        System.out.print("Insira sua altura em metros: ");
        double altura = scanner.nextDouble();

        System.out.print("Insira seu peso em kg: ");
        double peso = scanner.nextDouble();

        double imc = peso / (altura * altura);
        String classificacao = "";

        switch (genero) {
            case 'M':
            case 'm':
                if (imc >= 40) {
                    classificacao = "Obesidade Mórbida";
                } else if (imc >= 30) {
                    classificacao = "Obesidade Moderada";
                } else if (imc >= 25) {
                    classificacao = "Obesidade Leve";
                } else if (imc >= 20) {
                    classificacao = "Normal";
                } else {
                    classificacao = "Abaixo do Normal";
                }

            case 'F':
            case 'f':
            case 'N':
            case 'n':
                if (imc >= 39) {
                    classificacao = "Obesidade Mórbida";
                } else if (imc >= 29) {
                    classificacao = "Obesidade Moderada";
                } else if (imc >= 24) {
                    classificacao = "Obesidade Leve";
                } else if (imc >= 19) {
                    classificacao = "Normal";
                } else {
                    classificacao = "Abaixo do Normal";
                }
        }

        System.out.println(
                "================= RESULTADO =================\n" +
                        "Nome: " + nome + "    Gênero: " + genero + "\n" +
                        "IMC: " + String.format("%.2f", imc) + "\n" +
                        "Classificação: " + classificacao + "\n" +
                        "============================================");
        scanner.close();
    }
}