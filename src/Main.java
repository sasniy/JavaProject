
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.statistics.HistogramDataset;

import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.*;


public class Main {
    public static void main(String[] args){
        String path = "Показатель счастья по странам 2016.csv";
        CsvParser.LoadCountries(path);
        try{
            Class.forName("org.sqlite.JDBC");
            Connection con = DriverManager.getConnection("jdbc:sqlite:countries.db");
            Statement statement = con.createStatement();
            String table_1 = "CREATE TABLE country (countryName VARCHAR(15) PRIMARY KEY, regionName VARCHAR(30))";
            String table_2 = "CREATE TABLE countryInfo(countryName VARCHAR(15) PRIMARY KEY, " +
                    "happinessRank INTEGER," +
                    "happinessScore DOUBLE," +
                    "LCI DOUBLE," +
                    "UCI DOUBLE," +
                    "Economy DOUBLE," +
                    "Family DOUBLE," +
                    "Health DOUBLE," +
                    "Freedom DOUBLE," +
                    "Trust DOUBLE," +
                    "Generosity DOUBLE," +
                    "Dystopia_Residual," +
                    "FOREIGN KEY (countryName) REFERENCES country(countryName))";
            //statement.execute(table_1);
            //statement.execute(table_2);
            //CsvParser.InsertCountry();
            //CsvParser.InsertCountryInfo();

            //CsvParser.SeeDataSet();
            //CsvParser.GenerositySelect();
            //CsvParser.FindCountryWithAvgGenerosity();

        }

        catch (Exception e){
            e.printStackTrace();
        }


    }

}
