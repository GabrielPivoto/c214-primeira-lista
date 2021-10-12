import java.util.List;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        GameReader gr = new GameReader();
        GeradorJson geradorJson = new GeradorJson();

        System.out.println("Qual plataforma deseja buscar?");
        String plataforma = sc.nextLine();
        System.out.println("Qual publisher deseja buscar?");
        String publisher = sc.nextLine();

        List<Game> gamesPlataforma = gr.listarPorPlataforma(plataforma);
        List<Game> gamesPublisher = gr.listarPorPublisher(publisher);

        geradorJson.gerarJson(gamesPlataforma, "gamesPlataforma.json");
        geradorJson.gerarJson(gamesPublisher, "gamesPublisher.json");

        System.out.println("Jogos da plataforma " + plataforma + ":");
        for(int i = 0; i < gamesPlataforma.size(); i++)
            System.out.println(gamesPlataforma.get(i).getName());

        System.out.println(" ");

        System.out.println("Jogos do publisher " + publisher + ":");
        for(int i = 0; i < gamesPublisher.size(); i++)
            System.out.println(gamesPublisher.get(i).getName());


    }

}
