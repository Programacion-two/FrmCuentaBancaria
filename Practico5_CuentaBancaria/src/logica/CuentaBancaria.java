package logica;

public class CuentaBancaria {
	private String user;
	private String pass;
	private double saldo;
	
	
	public CuentaBancaria() {
		user="utu";
		pass="123";
		saldo=500;
	}


	public CuentaBancaria(String user, String pass, double saldo) {
		super();
		this.user = user;
		this.pass = pass;
		this.saldo = saldo;
	}


	public String getUser() {
		return user;
	}


	public void setUser(String user) {
		this.user = user;
	}


	public String getPass() {
		return pass;
	}


	public void setPass(String pass) {
		this.pass = pass;
	}


	public double getSaldo() {
		return saldo;
	}


	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}


	@Override
	public String toString() {
		return "CuentaBancaria [user=" + user + ", saldo=" + saldo + "]";
	}
	
	
		
	public boolean validar(String user, String pass) {
		if(this.user.equals(user) && this.pass.equals(pass)) {
			return true;
		}else {
			return false;
		}
		
	}
	
	public void depositar(double dinero) {
		if(dinero < 0) {
			saldo=saldo;
		}else {
			saldo=dinero;
		}
	}
	
	public double retirar(double dinero) {
		if(dinero < 0 || dinero > saldo) {
			return saldo=saldo;
		}else {
			return saldo=dinero;
		}
	}
	
	
}


