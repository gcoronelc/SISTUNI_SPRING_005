package pe.eggc.app.service;

import org.springframework.stereotype.Service;

@Service
public class EurekaService extends AbstractDaoSupport{

	public double getsaldoCuenta(String cuenta){
		String sql="SELECT DEC_CUENSALDO FROM CUENTA WHERE CHR_CUENCODIGO = ?";
		Object[]param ={cuenta};
		
		double saldo = jdbcTemplate.queryForObject(sql, param, Double.class);
		return saldo;
		
	}
}
