import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;

public class TesteGameReader {

    private static GameReader gr;

    @BeforeClass
    public static void init(){
        gr = new GameReader();
    }

    @Test
    public void testeQuantidadeDeJogos(){
        Assert.assertEquals(100,gr.games.size());
    }

    @Test
    public void testeQuantidadeGamesPS4(){
        List<Game> gamesPS4 = gr.listarPorPlataforma("PS4");
        Assert.assertEquals(5,gamesPS4.size());
    }

    @Test
    public void testeQuantidadeGamesSony(){
        List<Game> gamesSony = gr.listarPorPublisher("Sony Computer Entertainment");
        Assert.assertEquals(8,gamesSony.size());
    }

    @Test
    public void testeGamePS4(){
        List<Game> gamesPS4 = gr.listarPorPlataforma("PS4");
        boolean flag = false;
        if(gamesPS4.get(0).getPlatform().equals("PS4"))
            flag = true;
        Assert.assertTrue(flag);
    }

    @Test
    public void testeGameSony(){
        List<Game> gamesPS4 = gr.listarPorPublisher("Sony Computer Entertainment");
        boolean flag = false;
        if(gamesPS4.get(0).getPublisher().equals("Sony Computer Entertainment"))
            flag = true;
        Assert.assertTrue(flag);
    }

    @Test
    public void testaSeJsonFoiCriado(){
        File tempFile = new File("gamesPlataforma.json");
        Assert.assertTrue(tempFile.exists());
    }


}
