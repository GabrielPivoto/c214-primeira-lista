import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class GameReader {


    public List<Game> listarGames(){

        List<Game> games = new ArrayList<>();

        try {
            Reader reader = Files.newBufferedReader(Paths.get("vendas-games.csv"));
            CsvToBean<Game> csvToBean = new CsvToBeanBuilder(reader).withType(Game.class).withIgnoreLeadingWhiteSpace(true).build();
            games = csvToBean.parse();
        }catch (IOException e){
            System.out.println("Deu ruim");
        }
        return games;
    }

}
