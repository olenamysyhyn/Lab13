package ucu.apps.edu.task2;

public class Database extends БазаДаних{
    public String getUserData(){
        return отриматиДаніКористувача();
    }

    public String getStatisticsData(){
        return отриматиСтатистичніДані();
    }
}
