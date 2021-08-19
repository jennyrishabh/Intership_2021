package com.nia.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.nia.model.login;
import com.nia.model.signup;


@Repository
public class dataClass {
	
	@Autowired
	private JdbcTemplate jb;
	
	public dataClass(DataSource dataSource) {
        jb = new JdbcTemplate(dataSource);
    }
	
	public int insertUser(signup sn , String pwd) {
		String sql = "insert into signup (name , comp_name, buyer_type , state , city , office_landline, phne , emailid , products_manufactured, pwd, website, Gst_number, address) values (?,?,?,?,?,?,?,?,?,?,?,?,?)";
		jb.update(sql, new Object[] {sn.getName() , sn.getComp_name(), sn.getBuyer_type() , sn.getState() , sn.getCity() , sn.getOffice_landline() , sn.getPhne() , sn.getEmailid() , sn.getProducts_manufactured() , pwd , sn.getWebsite() , sn.getGst_number() , sn.getAddress()} ); 

		
		return 1;
		
	}
	
	public login getUser(String email) {
		
		login obj = jb.queryForObject("select emailid,pwd from signup where emailid ='" + email + "'" , new RowMapper<login>() {

			@Override
			public login mapRow(ResultSet rs, int rowNum) throws SQLException {
				login um = new login();
				um.setEmailid(rs.getString("emailid"));
				um.setPwd(rs.getString("pwd"));
				return um;
			}
			
		});
		
		
		return obj;
		
	}
	
	
	
	

}