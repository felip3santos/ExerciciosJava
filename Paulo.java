//- QUESTÃO 01: CONTAGEM SIMPLES
//Mostre os números de 1 até 10 usando for.

package paulo;

public class Paulo {

    public static void main(String[] args) {
        int a=1;
        for (a=1; a<=10; a++){
            System.out.println(a);
        }
    }
}

//- QUESTÃO 02: NÚMEROS PARES
//Mostre os números pares de 1 até 50.

package paulo;

public class Paulo {

    public static void main(String[] args) {
        int a=0;
        for (a=0; a<=100; a=a+2){
            System.out.println(a);
        }
    }
}

//- QUESTÃO 03: TABUADA
//Mostre a tabuada de um número fixo (ex: 7).


package paulo;

public class Paulo {

    public static void main(String[] args) {
        for (int a=1; a<=10; a++) {
            System.out.println(a*9);
        }
    }
}

//- QUESTÃO 04: SOMA DE NÚMEROS
//Some todos os números de 1 até 100 e mostre o //resultado.

package paulo;

public class Paulo {

    public static void main(String[] args) {
        int soma=0;
        for (int a=1; a<=100; a++){
            soma += a;
        }
        System.out.println("soma dos numeros de 1 a 100: " +soma);
    }
}

//- QUESTÃO 05: MAIOR NÚMERO
//Crie duas variáveis e mostre qual é o maior usando //if.

package paulo;
import java.util.Scanner;
public class Paulo {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite um numero: ");
        int a = entrada.nextInt();
        System.out.println("Digite outro numero: ");
        int b = entrada.nextInt();
            if (b>a){
                System.out.println("B e maior que A");
            }
                else {
                        System.out.println("A e maior que B");
            }
    }
}

//- QUESTÃO 06: CLASSIFICAÇÃO DE IDADE
//Crie uma variável idade e classifique:
//- 0 a 12 → Criança
//- 13 a 17 → Adolescente
//- 18 ou mais → Adulto

package paulo;
import java.util.Scanner;

public class Paulo {

    public static void main(String[] args) {
        Scanner blob = new Scanner(System.in);
        System.out.println();
        
        System.out.println("Qual sua idade: ");
        int idade = blob.nextInt();
        if (idade <=12){
            System.out.println("Voce e uma criança!");
        }
        else if (idade <=17){
            System.out.println("Voce e um adolescente!");
        }    
        else if (idade >=18){
            System.out.println("Voce e adulto!");
        }
    }
}

//- QUESTÃO 07: MENU COM SWITCH
//Crie um menu com opções:
//1 - Cadastrar
//2 - Listar
//3 - Sair

package paulo;
import java.util.Scanner;

public class Paulo {

    public static void main(String[] args) {
        Scanner proz = new Scanner(System.in);
        System.out.println("---------------MENU---------------");
        System.out.println("1 - Cadastrar");
        System.out.println("2 - Listar");
        System.out.println("3 - Sair");
        System.out.println("----------------------------------");
        int i = proz.nextInt();

        switch (i) {
          case 1:
            System.out.println("Cadastrar");
            break;
          case 2:
            System.out.println("Listar");
            break;
          case 3:
            System.out.println("Sair");
            break;
        }
    }
}

//- QUESTÃO 08: CONTAGEM REGRESSIVA
//Mostre os números de 10 até 1 usando for.

package paulo;

public class Paulo {

    public static void main(String[] args) {
        int a=1;
        for (a=10; a>0; a--){
            System.out.println(a);
        }

    }
}

//- QUESTÃO 09: MÉDIA DE NOTAS
//Crie duas notas, calcule a média e mostre:
//- Média >= 70 → Aprovado
//- Média >= 50 → Recuperação
//- Média < 50 → Reprovado

package paulo;
import java.util.Scanner;
public class Paulo {

    public static void main(String[] args) {
        Scanner blob = new Scanner(System.in);
        System.out.println("Digite sua primeira nota: ");
        int a = blob.nextInt();
        System.out.println("Digite sua segunda nota: ");
        int b = blob.nextInt();
        int media = a+b/2;
        
        System.out.println("A media das suas notas e: " +media);
        if (media>=70){
            System.out.println("Aprovado!");
        }
        else if (media>=50){
            System.out.println("Recuperacao!");
        }
        else {
            System.out.println("Reprovado!");
        }
    }
}

//- QUESTÃO 10: SISTEMA COM REPETIÇÃO E MENU
//Crie um sistema que repete até o usuário escolher //sair.

Menu:
1 - Mostrar "Olá"
2 - Mostrar "Bem-vindo"
0 - Sair

Use while + switch.

package paulo;
import java.util.Scanner;
public class Paulo {

    public static void main(String[] args) {
        Scanner proz = new Scanner(System.in); 
        int i;
            
        do {System.out.println("---------------MENU---------------");
        System.out.println("1 - Cumprimento");
        System.out.println("2 - Boas vindas");
        System.out.println("0 - Sair");
        System.out.print("Escolha uma opcao: ");
        
        i = proz.nextInt();
         switch (i) {
                case 1:
                    System.out.println("Ola!");
                    break;
                case 2:
                    System.out.println("Bem-vindo!");
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
         } while (i != 0);
         proz.close();
    }
}

//- QUESTÃO 11: SOMA DE PARES
//Mostre a soma de todos os números pares de 1 até //100.
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       
package paulo; 
                                                                                                                                                                                                                                                                        
public class Paulo {
    
    public static void main(String[] args) {
        int soma=0;
        for (int a=0; a<=100; a=a+2){
            soma += a;
        }
        System.out.println("soma dos numeros pares de 1 a 100: " +soma);
    }
} 

//- QUESTÃO 12: CONTADOR DE POSITIVOS E NEGATIVOS
//Percorra os números de -10 até 10 e conte:
//- Quantos são positivos
//- Quantos são negativos

package paulo;

public class Paulo {
    
    public static void main(String[] args) {
        int positivos = 0;
        int negativos = 0;
        for (int a=-10; a<=10; a++){
            if (a > 0){
                positivos++;
            }
            if (a < 0) {
                negativos++;
            }
            }
        System.out.println("Quantidade de positivos: " + positivos);
        System.out.println("Quantidade de negativos: " + negativos);     
    }
}

//- QUESTÃO 13: TABUADAS COMPLETAS//Mostre todas as tabuadas de 1 até 5.

//Exemplo:
//1 x 1 = 1
//...
//5 x 10 = 50

package paulo;

public class Paulo {
    
    public static void main(String[] args) {
            int a=0;
            for (a=1; a<=10; a++){
                System.out.println("Tabuada do "+ a +": ");
                for (int b=1; b<=10; b++){
                    System.out.println(a+" x "+b+" = "+(a*b));
            }
            System.out.println();
            }
    }
}

//- QUESTÃO 14: MÉDIA DE 5 NOTAS
//Declare 5 notas, calcule a média e classifique:
//- >= 70 → Aprovado
//- >= 50 → Recuperação
//- < 50 → Reprovado


package paulo;
import java.util.Scanner;
public class Paulo {

    public static void main(String[] args) {
        Scanner blob = new Scanner(System.in);
        System.out.println("Digite suas 5 notas: ");
        int a = blob.nextInt();
        int b = blob.nextInt();
        int c = blob.nextInt();
        int d = blob.nextInt();
        int e = blob.nextInt();
        int media = a+b+c+d+e/5;
        
        System.out.println("A media das suas notas e: " +media);
        if (media>=70){
            System.out.println("Aprovado!");
        }
        else if (media>=50){
            System.out.println("Recuperacao!");
        }
        else {
            System.out.println("Reprovado!");
        }
    }
}

//- QUESTÃO 15: MENU COM REPETIÇÃO
//Crie um sistema que repete até o usuário escolher //sair.

//Menu:
//1 - Mostrar números de 1 a 10
//2 - Mostrar pares de 1 a 20
//3 - Mostrar tabuada do 3
//0 - Sair

//Use while + switch.

package paulo;
import java.util.Scanner;
public class Paulo {

    public static void main(String[] args) {
        Scanner proz = new Scanner(System.in); 
        int i;
            
        do {
        System.out.println("---------------MENU---------------");
        System.out.println("1 - Numeros de 1 a 10");
        System.out.println("2 - Pares de 2 a 20");
        System.out.println("3 - Tabuada do 3");
        System.out.println("0 - Sair");
        System.out.print("Escolha uma opcao: ");
        
        i = proz.nextInt();
         switch (i) {
                case 1:
                    for (int a=1; a<=10; a++){                   
                    System.out.println(a);
                    }
                    break;
                case 2:
                    for (int b=2; b<=20; b=b+2){
                    System.out.println(b);
                    }
                    break;
                case 3:
                    for (int c=1; c<=10; c++){
                        System.out.println("3 x "+c+" = "+(3*c));
                    }
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
        }
        }
          while (i != 0);
         proz.close();        
    }
}

//- QUESTÃO 16: FATORIAL
//Calcule o fatorial de um número fixo.
//Exemplo: 5! = 5 * 4 * 3 * 2 * 1


package paulo;
import java.util.Scanner;
public class Paulo {

    public static void main(String[] args) {
        Scanner mv = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        int n = mv.nextInt();
        int f = 1;
        for (int a=1; a<=n; a++){
        f*=a;
        }
        
    System.out.println("Fatorial de " + n + " = " + f);
    mv.close();
    }
}

//- QUESTÃO 17: CONTAGEM DE MÚLTIPLOS
//Mostre quantos números entre 1 e 100 são múltiplos //de 3.


package paulo;

public class Paulo {
    
    public static void main(String[] args) {
    int contador = 0;
    for(int i = 1; i <= 100; i++){
        if(i % 3==0){
            contador++;
        }
    }
    System.out.println(contador);
    }
}

//- QUESTÃO 18: MAIOR E MENOR VALOR
//Simule 5 valores e determine:
//- O maior valor
//- O menor valor


package paulo;
import java.util.Scanner;
public class Paulo {
    
    public static void main(String[] args) {
        Scanner pdf = new Scanner(System.in);
        System.out.println("Valor 1: ");
        int a1 = pdf.nextInt();
        System.out.println("Valor 2: ");
        int a2 = pdf.nextInt();
        System.out.println("Valor 3: ");
        int a3 = pdf.nextInt();
        System.out.println("Valor 4: ");
        int a4 = pdf.nextInt();
        System.out.println("Valor 5: ");
        int a5 = pdf.nextInt();
        
        int m = a1;
        if(a2 > m) m = a2;
        if(a3 > m) m = a3;
        if(a4 > m) m = a4;
        if(a5 > m) m = a5;
        
        int n = a1;
        if (a2 < n) n = a2;
        if (a3 < n) n = a3;
        if (a4 < n) n = a4;
        if (a5 < n) n = a5;
        
        System.out.println("maior numero e " +m);
        System.out.println("menor numero e " +n);
       
    }
}

//- QUESTÃO 19: SOMA ATÉ PARAR
//Use while para somar números até encontrar o número //0.
//Ao final, mostre o total acumulado.


package paulo;
import java.util.Scanner;
public class Paulo {
    
    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);

        int numero;
        int soma = 0;

        System.out.println("Digite numeros: ");
        numero = p.nextInt();

        while (numero != 0) {
            soma += numero;
            numero = p.nextInt();
        }

        System.out.println("Total acumulado: " + soma);

        p.close();
    }
}

//- QUESTÃO 20: CALCULADORA
//Crie um menu com switch:
//1 - Somar dois números
//2 - Subtrair
//3 - Multiplicar
//4 - Dividir
//0 - Sair

Use while para repetir o sistema.


package paulo;
import java.util.Scanner;
public class Paulo {

    public static void main(String[] args) {
        Scanner proz = new Scanner(System.in); 
        int i;
            
        do {
        System.out.println("---------------MENU---------------");
        System.out.println("1 - Soma de 2 numeros");
        System.out.println("2 - Subtracao de 2 numeros");
        System.out.println("3 - Multiplicacao de 2 numeros");
        System.out.println("4 - Divisao de 2 numeros");
        System.out.println("0 - Sair");
        System.out.print("Escolha uma opcao: ");
        
        i = proz.nextInt();
         switch (i) {
                case 1:
                    System.out.print("Digite o primeiro numero: ");
                    int a = proz.nextInt();
                    System.out.print("Digite o segundo numero: ");
                    int b = proz.nextInt();
                    System.out.println("Resultado: " + (a + b));
                    break;
                case 2:
                    System.out.print("Digite o primeiro numero: ");
                    int c = proz.nextInt();
                    System.out.print("Digite o segundo numero: ");
                    int d = proz.nextInt();
                    System.out.println("Resultado: " + (c - d));
                    break;
                case 3:
                    System.out.print("Digite o primeiro numero: ");
                    int e = proz.nextInt();
                    System.out.print("Digite o segundo numero: ");
                    int f = proz.nextInt();
                    System.out.println("Resultado: " + (e * f));
                    break;
                case 4:
                    System.out.print("Digite o primeiro numero: ");
                    int g = proz.nextInt();
                    System.out.print("Digite o segundo numero: ");
                    int h = proz.nextInt();
                    System.out.println("Resultado: " + (g / h));
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opcao invalida! Tente novamente.");
        }
        }
          while (i != 0);
         proz.close();        
    }
}