package jp.co.kiramex.dbSample.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseManager {
    //データベース接続と結果取得のための変数
    private static Connection con;

    /*
     * データベース接続を行うメソッド
     */
    public static Connection getConnecttion() throws SQLException, ClassNotFoundException{
        //1．ドライバのクラスをJava上で読み込む
        Class.forName("com.mysql.cj.jdbc.Driver");
        //2.DBと接続する
        con = DriverManager.getConnection(
                "jdbc:mysql://localhost/world?cseSSL=false&allowPublicKeyRetrieval=true",
                "root",
                "aa117117Daaa117117Da"
        );
        //"password"の部分は、ご自身で

        return con;
    }

    /*
     * データベース接続を閉じるメソッド
     */
    public static void close() {
        //7.接続を閉じる
        if(con != null) {
            try {
                con.close();
            }catch(SQLException e) {
                e.printStackTrace();
            }
        }
    }
}