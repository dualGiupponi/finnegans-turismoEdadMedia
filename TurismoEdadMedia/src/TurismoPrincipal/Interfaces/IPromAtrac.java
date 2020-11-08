package TurismoPrincipal.Interfaces;

import TurismoPrincipal.Enums.ETiposActividades;

public interface IPromAtrac {
	public Boolean esDisponible();

	public Integer costo();

	public Double tiempo();

	public ETiposActividades tipo();
}
