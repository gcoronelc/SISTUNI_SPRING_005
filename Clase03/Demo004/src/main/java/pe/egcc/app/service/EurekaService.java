package pe.egcc.app.service;

import java.util.Map;

import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

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
	
	
	public Map<String, Object> getCliente( String idCliente ){
		Map<String, Object> rec = null;
		try {
			String sql = "SELECT CHR_CLIECODIGO, VCH_CLIEPATERNO,"
					+ "VCH_CLIEMATERNO, VCH_CLIENOMBRE, CHR_CLIEDNI, "
					+ "VCH_CLIECIUDAD, VCH_CLIEDIRECCION, VCH_CLIETELEFONO, "
					+ "VCH_CLIEEMAIL FROM CLIENTE "
					+ "WHERE CHR_CLIECODIGO = ?";
			rec = jdbcTemplate.queryForMap(sql, idCliente);
		} catch (Exception e) {
			rec = null;
		}
		return rec;
	}

}
