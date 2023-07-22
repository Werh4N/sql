
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Random;
import java.util.jar.Attributes.Name;

public class insert_sql {
    public static void main(String[] args) {
        // 驱动程序名
        String driver = "com.mysql.cj.jdbc.Driver";

        // URL指向要访问的数据库名9million
        String url = "jdbc:mysql://127.0.0.1:3306/9million";

        // MySQL配置时的用户名
        String user = "root";

        // MySQL配置时的密码
        String password = "123456";

        try {
            // 加载驱动程序
            Class.forName(driver);

            // 连续数据库
            Connection conn = DriverManager.getConnection(url, user, password);

            if (!conn.isClosed())
                System.out.println("Succeeded connecting to the Database!");

            // statement用来执行SQL语句
            Statement statement = conn.createStatement();

            // 要执行的SQL语句
            for (int i= 0; i <= 9000000; i ++){
                String rdname = randomString(8);
                int id = i;
                System.out.println(rdname);

//丢了引号会出错，找不到collumn“ID”或者“rdname”int型的可以不用加，但是string类型的必须加。有空研究下底层实现
                String sqll = "insert into testdata (id,name) values ('"+id+"','"+rdname+"')";


                statement.execute(sqll);
            }
            conn.close();

        } catch (ClassNotFoundException e) {

            System.out.println("Sorry,can`t find the Driver!");
            e.printStackTrace();

        } catch (SQLException e) {

            e.printStackTrace();

        } catch (Exception e) {

            e.printStackTrace();

        }

    }

    /**
     * 产生随机字符串
     * */
    private static Random randGen = null;
    private static char[] letters = null;
    public static final String randomString(int length) {
        if (length < 1) {
            return null;
        }
        if (randGen == null) {
            randGen = new Random();
//        numbersAndLetters = ("0123456789abcdefghijklmnopqrstuvwxyz" +
//        "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ").toCharArray();
            letters = ("abcdefghijklmnopqrstuvwxyz").toCharArray();
            //numbersAndLetters = ("0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ").toCharArray();
        }
        char [] randBuffer = new char[length];
        for (int i=0; i<randBuffer.length; i++) {
            randBuffer[i] = letters[randGen.nextInt(25)];
            //randBuffer[i] = numbersAndLetters[randGen.nextInt(35)];
        }
        return new String(randBuffer);
    }

}