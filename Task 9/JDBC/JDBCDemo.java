import java.sql.*;

public class JDBCDemo {

    public static void main(String[] args)  {
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/employee?user=root&password=dkkd");

            Statement statement = connection.createStatement();
            statement.execute("""
                create table employee.emplData(empcode int unique not null, empname varchar(50), empage int, salary int);
                """);
            //query 1
            statement.execute(""" 
                insert into employee.emplData(empcode,empname,empage,salary) values(101,"Jenny",25,10000),(102,"Jacky",30,20000),(103,"Joe",20,40000),(104,"John",40,80000),(105,"Shameer",25,90000);
                """);
            //query 2

            ResultSet resultSet= statement.executeQuery("select * from employee.emplData;");

            while (resultSet.next()){
                //printing table
                System.out.println(resultSet.getInt(1)+" "+resultSet.getString(2)+" "+resultSet.getInt(3)
                        +" "+resultSet.getInt(4)
                );
            }

            connection.close();
            statement.close();
            resultSet.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }


    }
}