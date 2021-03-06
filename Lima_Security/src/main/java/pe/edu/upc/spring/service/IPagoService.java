package pe.edu.upc.spring.service;

import java.util.List;
import java.util.Optional;

import pe.edu.upc.spring.model.Pago;

public interface IPagoService {
	public boolean insertar(Pago pago);
	public void eliminar(int idPago);
	public Optional<Pago> listarId(int idPago);
	public Optional<Pago> buscarId(int idPago);
	List<Pago> listar();
	

}
