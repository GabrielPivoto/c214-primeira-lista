import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class GameReader {

    List<Game> games = new ArrayList<>();

    public GameReader(){
        listarGames();
    }

    public void listarGames(){

        try {
            Reader reader = Files.newBufferedReader(Paths.get("vendas-games.csv"));
            CsvToBean<Game> csvToBean = new CsvToBeanBuilder(reader).withType(Game.class).withIgnoreLeadingWhiteSpace(true).build();
            games = csvToBean.parse();
        }catch (IOException e){
            System.out.println("Deu ruim");
        }

    }

    public List<Game> listarPorPlataforma(String plataforma){

        List<Game> gamesByPlatform = new ArrayList<>();

        for(int i = 0; i < games.size(); i++)
            if(games.get(i).getPlatform().equals(plataforma))
                gamesByPlatform.add(games.get(i));

        return gamesByPlatform;

    }

    public List<Game> listarPorPublisher(String publisher){

        List<Game> gamesByPublisher = new ArrayList<>();

        for(int i = 0; i < games.size(); i++)
            if(games.get(i).getPlatform().equals(publisher))
                gamesByPublisher.add(games.get(i));

        return gamesByPublisher;

    }

}
