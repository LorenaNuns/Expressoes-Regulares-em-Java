import java.util.Scanner;

public class codigos {

  public static void main(String args[]) {

    Scanner ler = new Scanner(System.in);
    String nome;
    System.out.print("Qual a cadeia: ");
    nome = ler.next();
    String[] nome_vetor = new String[5];
    String[] cadeias = new String[5];
    int i = 0;

    // separando a string em caracteres e colocando cada letra em uma posição do
    // vetor
    String[] nomeComSplit = nome.split("");
    for (String s : nomeComSplit) {
      nome_vetor[i] = s;
      i++;
      System.out.println(s);
    }

    // montando as cadeias
    // esse if faz a 1º cadeia ser 0
    if (nome_vetor[0].equals("0") && !nome_vetor[1].equals("*") && nome_vetor[2].equals("*")) {
      cadeias[0] = nome_vetor[0];
    } else if (nome_vetor[0].equals("0") && nome_vetor[1].equals("1")) {
      cadeias[0] = nome_vetor[0] + nome_vetor[1];
    } else if (nome_vetor[0].equals("(") && !nome_vetor[1].equals(")") && !nome_vetor[2].equals(")")
        && nome_vetor[3].equals(")")) {
      cadeias[0] = nome_vetor[1] + nome_vetor[2];
    }

    // aqui é a montagem das outras cadeias (01, 011), utilizei uma string aux para
    // n alterar o nome_vetor
    int w = 1;
    String aux = cadeias[0];
    if (nome_vetor[0].equals("(") && nome_vetor[3].equals(")")) {
      do {
        cadeias[w] = aux + cadeias[0];
        aux = cadeias[w];
        w++;
      } while (w <= 4);

    } else {
      do {
        cadeias[w] = aux + nome_vetor[1];
        aux = cadeias[w];
        w++;
      } while (w <= 4);
    }

    // mostra as cadeias na tela
    for (int x = 0; x <= 5; x++) {
      System.out.println("Cadeia " + x + ": " + cadeias[x]);
    }

  }

}