package com.demo;
import java.sql.*;
import java.util.List;
import java.util.ArrayList;
public class AllienDao {
	  private String url = "jdbc:mysql://localhost:3306/college";
	  private String usrname = "root";
	  private String password = "";
      public List<Allien> getAllien(String i){
    	  List<Allien> a = new ArrayList<>();
    	  try{
    		Class.forName("com.mysql.jdbc.Driver");  
    		Connection con = DriverManager.getConnection(url,usrname,password);   
    	    String sql = "select * from Alllien ";
    	    PreparedStatement st = con.prepareStatement(sql);
    	    ResultSet rs = st.executeQuery();
            while(rs.next()){
               Allien a1 = new Allien();
               String j = rs.getInt(1) + "";
               if(j.equals(i) || rs.getString(2).equals(i) || rs.getString(3).equals(i)){
        	   a1.setId(rs.getInt("id"));
        	   a1.setName(rs.getString("name"));
        	   a1.setTech(rs.getString("tech"));
        	   a.add(a1);}
          }
    	  }
    	  catch(Exception e){}
    	  return a;
      } 
}
