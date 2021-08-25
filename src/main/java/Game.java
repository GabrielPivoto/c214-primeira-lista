public class Game {

    private int rank;
    private String name;
    private String platform;
    private int year;
    private String genre;
    private String publisher;
    private double na_sales;
    private double eu_sales;
    private double jp_sales;
    private double other_sales;
    private double global_sales;

    public Game(int rank, String name, String platform, int year, String genre, String publisher, double na_sales, double eu_sales, double jp_sales, double other_sales, double global_sales) {
        this.rank = rank;
        this.name = name;
        this.platform = platform;
        this.year = year;
        this.genre = genre;
        this.publisher = publisher;
        this.na_sales = na_sales;
        this.eu_sales = eu_sales;
        this.jp_sales = jp_sales;
        this.other_sales = other_sales;
        this.global_sales = global_sales;
    }


}
