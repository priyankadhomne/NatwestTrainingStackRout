package org.example.examples;

public class ConnectionDb {
    String username;
    String password;
    String dbname;

    public ConnectionDb() {
    }

    public ConnectionDb(String username, String password, String dbname) {
        this.username = username;
        this.password = password;
        this.dbname = dbname;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDbname() {
        return dbname;
    }

    public void setDbname(String dbname) {
        this.dbname = dbname;
    }


    public String displayConnectionDetails() {
        return "ConnectionDb{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", dbname='" + dbname + '\'' +
                '}';
    }
}
