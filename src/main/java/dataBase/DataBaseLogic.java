package dataBase;

import model.Player;
import validation.DataIn;

import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.Connection;

public class DataBaseLogic {
    Player player = new Player();
    DataIn data= new DataIn();
    String nickname;
    double points;

    public void setConnectionToDB(){
        dataPlayer();
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/game_data","root","password");
            Statement stmt = connection.createStatement();
            String query = "INSERT INTO player_data (IdAlumno,Nombre,Points) values('1','"+nickname+"','"+points+"')";
            stmt.executeUpdate(query);
        }catch(Exception e){
            System.err.println("Error!!!");
        }
    }


    public void dataPlayer(){
        player=data.makePlayer();
        this.nickname = player.getName();
        this.points = player.getPoints();
    }
}
