import java.util.List;

public class Principal {

    public static void main(String[] args) {

        GameReader gr = new GameReader();

        List<Game> gamesPS4 = gr.listarPorPlataforma("PS4");
        List<Game> gamesSony = gr.listarPorPublisher("Sony Computer Entertainment");

        for(int i = 0; i < gamesPS4.size(); i++){
            System.out.println(gamesPS4.get(i).getName());
        }
        System.out.println("");
        for(int i = 0; i < gamesSony.size(); i++){
            System.out.println(gamesSony.get(i).getName());
        }

    }

}
