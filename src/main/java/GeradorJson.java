import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class GeradorJson {

    Gson gson = new GsonBuilder().setPrettyPrinting().create();
    List<Game> games;

    public void gerarJson(List<Game> games, String nomeArquivo){
        this.games = games;
        String json = gson.toJson(games);
        FileWriter writer;
        try {
            writer = new FileWriter(nomeArquivo);
            writer.write(json);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
