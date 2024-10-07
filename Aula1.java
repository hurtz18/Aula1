public class SalarioFuncionario {
    public static void main(String[] args) {
        double valorHora = 15.00;
        int horasTrabalhadas = 40;

        double salario = valorHora * horasTrabalhadas;

        System.out.printf("Salário do funcionário: R$ %.2f%n", salario);
    }
}
/////////////////////////////////////////////



import java.util.Scanner;

public class ComparacaoVariaveis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int num1 = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        int num
////////////////////////////////////////////\



 import java.util.Scanner;
        public class MediaAluno {
            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);

                System.out.print("Digite a primeira nota: ");
                double nota1 = scanner.nextDouble();

                System.out.print("Digite a segunda nota: ");
                double nota2 = scanner.nextDouble();

                System.out.print("Digite a terceira nota: ");
                double nota3 = scanner.nextDouble();

                double media = (nota1 + nota2 + nota3) / 3;

                System.out.println("Média do aluno: " + media);

                if (media >= 70) {
                    System.out.println("Aluno aprovado!");
                } else
///////////////////////////////////////////////



 import java.util.Scanner;
                public class FolhaPagamento {
                    public static void main(String[] args) {
                        Scanner scanner = new Scanner(System.in);

                        System.out.print("Digite o valor do salário bruto: ");
                        double salarioBruto = scanner.nextDouble();
                        double descontoIR = 0;

                        if (salarioBruto <= 900) {
                            System.out.println("Isento de imposto de renda.");
                        } else if (salarioBruto <= 1500) {
                            descontoIR = salarioBruto * 0.05;
                            System.out.println("Desconto de 5%: R$ " + descontoIR);
                        } else if (salarioBruto <= 2500) {
                            descontoIR = salarioBruto * 0.10;
                            System.out.println("Desconto de 10%: R$ " + descontoIR);
                        } else {
                            descontoIR = salarioBruto * 0.20;
                            System.out.println("Desconto de 20%: R$ " + descontoIR);
                        }

                        double salarioLiquido = salarioBruto - descontoIR;
                        System.out.println("Salário líquido: R$ " + salarioLiquido);

                        scanner.close();
                    }
                }

