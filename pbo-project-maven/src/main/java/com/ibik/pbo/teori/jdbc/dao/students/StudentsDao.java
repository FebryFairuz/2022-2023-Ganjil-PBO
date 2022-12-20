package com.ibik.pbo.teori.jdbc.dao.students;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ibik.pbo.teori.jdbc.ConnectionDB;

public class StudentsDao {
	//212310042	SHEPILLA GHALIA DIRJA
	
	private String sqlInsert = "insert into students (npm,firstname, middlename, lastname, email, birthdate, program_id,program_study_id) " + "values (?,?,?,?,?,?,?,?)";
    private String sqlUpdate = "update students set npm=?, firstname=?, middlename=?, lastname=?, email=?, birthdate=? " + "where id = ?";
    private String sqlCariSemua = "select * from students order by npm asc";
    private String sqlCariByID = "select * from students where id = ?";
    private String sqlHapusById = "delete from students where id = ?";
    private String sqlCariAccount = "select * from students where email = ? and npm = ?";

    public void saved(Students students) throws Exception {
        Connection c = new ConnectionDB().connect();
        
        if (students.getId() == null) {
            PreparedStatement psInsert = c.prepareStatement(sqlInsert);
            psInsert.setString(1, students.getNpm());
            psInsert.setString(2, students.getFirstname());
            psInsert.setString(3, students.getMiddlename());
            psInsert.setString(4, students.getLastname());
            psInsert.setString(5, students.getEmail());
            psInsert.setString(6, students.getBirthdate());
            psInsert.setInt(7, 1);
            psInsert.setInt(8, 6);

            psInsert.executeUpdate();
        } else {
            PreparedStatement psUpdate = c.prepareStatement(sqlUpdate);
            psUpdate.setString(1, students.getNpm());
            psUpdate.setString(2, students.getFirstname());
            psUpdate.setString(3, students.getMiddlename());
            psUpdate.setString(4, students.getLastname());
            psUpdate.setString(5, students.getEmail());
            psUpdate.setString(6, students.getBirthdate());
            psUpdate.setInt(7, students.getId());

            psUpdate.executeUpdate();
        }
        c.close();
    }

    public List<Students> findAll() throws Exception {
        List<Students> hasil = new ArrayList<Students>();

        Connection c = new ConnectionDB().connect();
        PreparedStatement psCariSemuaProduk = c.prepareStatement(sqlCariSemua);
        
        ResultSet rs = psCariSemuaProduk.executeQuery();
        while(rs.next()){
            Students students = konversiResultSet(rs);            
            hasil.add(students);
        }
        
        c.close();
        return hasil;
    }
    
    public Students findByID(Integer id) throws Exception{
        if(id == null){
            return null;
        }
        Connection c = new ConnectionDB().connect();
        PreparedStatement psCariById = c.prepareStatement(sqlCariByID);
        psCariById.setInt(1, id);
        ResultSet rs = psCariById.executeQuery();
        if(!rs.next()){
            return null;
        }
        Students students = konversiResultSet(rs);
        c.close();
        return students;
    }

    public void removed(Integer id) throws Exception{
        if(id == null){
            return;
        }        
        Connection c = new ConnectionDB().connect();
        PreparedStatement psHapusById = c.prepareStatement(sqlHapusById);
        psHapusById.setInt(1, id);
        psHapusById.executeUpdate();
        c.close();
    }
    
    public Students findByAccount(String email, String npm) throws Exception{
        if(email == null){
            return null;
        }
        Connection c = new ConnectionDB().connect();
        PreparedStatement psCariByAccount = c.prepareStatement(sqlCariAccount);
        psCariByAccount.setString(1, email);
        psCariByAccount.setString(2, npm);
        ResultSet rs = psCariByAccount.executeQuery();
        if(!rs.next()){
            return null;
        }
        Students students = konversiResultSet(rs);
        c.close();
        return students;
    }

    private Students konversiResultSet(ResultSet rs) throws SQLException{
        Students students = new Students();
        students.setId(rs.getInt("id"));
        students.setNpm(rs.getString("npm"));
        students.setFirstname(rs.getString("firstname"));
        students.setMiddlename(rs.getString("middlename"));
        students.setLastname(rs.getString("lastname"));
        students.setEmail(rs.getString("email"));
        students.setBirthdate(rs.getString("birthdate"));
        return students;
    }
}
