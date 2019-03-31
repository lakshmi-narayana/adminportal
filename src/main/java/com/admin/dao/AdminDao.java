package com.admin.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.admin.dto.ConfigurationDto;

public class AdminDao {

	JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	// Save the configuration Details
	
	public int save(ConfigurationDto configDto) {
		String query = "";
		return jdbcTemplate.update(query);
	}
	
	// Delete the Configuration
	
	public int delete(int id) {
		String query = "";
		return jdbcTemplate.update(query);
	}
	
	//List Of configuration
	public List<ConfigurationDto> getConfigList(){
		return jdbcTemplate.query("select * from admin", new RowMapper<ConfigurationDto>() {

			@Override
			public ConfigurationDto mapRow(ResultSet rs, int rowNum) throws SQLException {
				
				ConfigurationDto cdto = new ConfigurationDto();
				cdto.setCloudProviderName(rs.getString(1));
				cdto.setApiGateway(rs.getString(2));
				cdto.setServiceDiscovery(rs.getString(3));
				cdto.setDashBoard(rs.getString(4));
				cdto.setMonitoring(rs.getString(5));
				return cdto;
			}
			
		});
		
	}
}
