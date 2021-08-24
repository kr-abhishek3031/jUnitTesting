package Aug23.dao;

import java.sql.Connection;

public class Manager {
    private Connection conn;
    private DaoImplementation imp1;

    public Connection getConn(){
        return this.conn;
    }
    public void setConn(){
        this.conn = ConnectionFactory.getPGConnection();
    }
    public DaoImplementation getImp1(){
        return this.imp1;
    }
    /*
    public DaoImplementation  setImp1(){
        DaoImplementation d1 = new DaoImplementation();
        return d1;
    }*/
    public Manager(Connection cnn, DaoImplementation d1){
        this.conn = cnn;
        this.imp1 = d1;
    }

/*    public int addUser(User user) {
        return imp1.addUser(user, this.conn);
    }*/




}
