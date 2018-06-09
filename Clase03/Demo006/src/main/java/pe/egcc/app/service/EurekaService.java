package pe.egcc.app.service;

import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.stereotype.Service;

import pe.egcc.app.dto.ClienteDto;

@Service
public class EurekaService extends AbstractDaoSupport {

	public double getSaldoCuenta(String cuenta) {

		Double saldo = 0.0;
		try {
			String sql = "SELECT DEC_CUENSALDO FROM CUENTA WHERE CHR_CUENCODIGO = ?";
			Object[] param = { cuenta };
			saldo = jdbcTemplate.queryForObject(sql, param, Double.class);
		} catch (EmptyResultDataAccessException e) {
		}
		return saldo;
		
	}
	
	
	public ClienteDto getCliente( String idCliente ){
		ClienteDto rec = null;
		try {
			String sql = "SELECT "
					+ "CHR_CLIECODIGO codigo, "
					+ "VCH_CLIEPATERNO paterno,"
					+ "VCH_CLIEMATERNO materno, "
					+ "VCH_CLIENOMBRE nombre, "
					+ "CHR_CLIEDNI dni, "
					+ "VCH_CLIECIUDAD ciudad, "
					+ "VCH_CLIEDIRECCION direccion, "
					+ "VCH_CLIETELEFONO telefono, "
					+ "VCH_CLIEEMAIL email "
					+ "FROM CLIENTE "
					+ "WHERE CHR_CLIECODIGO = ?";
			rec = jdbcTemplate.queryForObject(sql, 
					new BeanPropertyRowMapper<ClienteDto>(ClienteDto.class), 
					idCliente);
		} catch (Exception e) {
			rec = null;
		}
		return rec;
	}

	
}
