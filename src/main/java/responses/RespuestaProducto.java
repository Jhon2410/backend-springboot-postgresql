package responses;

import java.util.List;


import com.second.models.store_publicacion;

public class RespuestaProducto  extends Respuesta{
	private List<store_publicacion> data;
	public List<store_publicacion> getData() {
		return data;
	}
	public void setData(List<store_publicacion> data) {
		this.data = data;
	}
}
