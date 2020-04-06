public Class FuncionesUsuario{
	public int CalculoDeImpuestos(Usuario user){
		int aPagar = 0;
		if( (user.getEdad() > 17 && user.getEdad() < 31) || user.getEdad() >65 ){
			aPagar = 2000;
		}else{
			if(user.getEdad() <66){
				aPagar = 7000;
			}
		}
		int conDescuento = aPagar - aPagar*0.03*user.getCantidadHijos()	;
		if(aPagar/2 > conDescuento){
			return aPagar/2;	
		}else{
			return conDescuento;
		}
	}

	public boolean CobroDeSueldo(Usuario user, int ingreso){
		user.setSaldo(user.getSaldo() + ingreso);
	}
}