
    import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import sample.model.Datasource;

    public class Main extends modal {

        @Override
        public void start(Stage primaryStage) throws Exception{
            Parent root = FXMLLoader.load(getClass().getResource("main.fxml"));
            primaryStage.setTitle("Music Database");
            primaryStage.setScene(new Scene(root, 800, 600));
            primaryStage.show();
        }

        @Override
        public void init() throws Exception {
            super.init();
            if(!Datasource.getInstance().open()) {
                System.out.println("FATAL ERROR: Couldn't connect to database");
                Platform.exit();
            }
        }

        @Override
        public void stop() throws Exception {
            super.stop();
            Datasource.getInstance().close();
        }

        public static void main(String[] args) {
            launch(args);
        }
    }




//    public static final String DB_NAME = "testjava.db";
//    public static final String CONNECTION_STRING = "jdbc:sqlite:/home/aalok/Desktop/Projects/Java/TestDB/" + DB_NAME;
//
//    public static final String TABLE_CONTACTS = "contacts";
//
//    public static final String COLUMN_NAME = "name";
//    public static final String COLUMN_PHONE = "phone";
//    public static final String COLUMN_EMAIL = "email";
//
//    public static void main(String[] args) {
//
//        try {
//            Connection conn = DriverManager.getConnection(CONNECTION_STRING);
//            Statement statement = conn.createStatement();
//
//            statement.execute("DROP TABLE IF EXISTS " + TABLE_CONTACTS);
//
//            statement.execute("CREATE TABLE IF NOT EXISTS " + TABLE_CONTACTS +
//                    " (" + COLUMN_NAME + " text, " +
//                    COLUMN_PHONE + " integer, " +
//                    COLUMN_EMAIL + " text" +
//                    ")");
//
//            insertContact(statement,"Tim", 6545678, "tim@email.com");
//            insertContact(statement,"Joe", 45632, "joe@anywhere.com");
//            insertContact(statement,"Jane", 4829484, "jane@somewhere.com");
//            insertContact(statement,"Fido", 9038, "dog@email.com");
//
//            statement.execute("UPDATE " + TABLE_CONTACTS + " SET " +
//                    COLUMN_PHONE + "=5566789" +
//                    " WHERE " + COLUMN_NAME + "='Jane'");
//
//            statement.execute("DELETE FROM " +TABLE_CONTACTS +
//                    " WHERE " + COLUMN_NAME + "='Joe'");
//
//            ResultSet results = statement.executeQuery("SELECT * FROM " + TABLE_CONTACTS);
//            while(results.next()) {
//                System.out.println(results.getString(COLUMN_NAME) + " " +
//                        results.getInt(COLUMN_PHONE) + " " +
//                        results.getString(COLUMN_EMAIL));
//            }
//
//            results.close();
//
//            statement.close();
//            conn.close();
//
////            Connection conn = DriverManager.getConnection("jdbc:sqlite:D:\\databases\\testjava.db");
////            Class.forName("org.sql.JDBC");
//
//        } catch (SQLException e) {
//            System.out.println("Something went wrong: " + e.getMessage());
//            e.printStackTrace();
//        }
//    }
//
//    private static void insertContact(Statement statement, String name, int phone, String email) throws SQLException {
//        statement.execute("INSERT INTO " + TABLE_CONTACTS +
//                " (" + COLUMN_NAME + ", " +
//                COLUMN_PHONE + ", " +
//                COLUMN_EMAIL +
//                " ) " +
//                "VALUES('" + name + "', " + phone + ", '" + email + "')");
//    }
