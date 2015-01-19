package arrays2;

public class Metodos {

    public static void visualizar(String[] nome, int[] dorsal) {
        System.out.println("NOME\tDORSAL");
        for (int i = 0; i < nome.length; i++) {
            System.out.println(nome[i] + "\t" + dorsal[i]);
            //System.out.printf("%-12S %-10d", nome[i], dorsal[i]);
        }
    }
}
