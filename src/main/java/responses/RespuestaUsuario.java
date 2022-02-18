package responses;

import java.util.List;

import com.second.models.usuarios;

public class RespuestaUsuario  extends Respuesta{
	
	
	private List<usuarios> data;

	public List<usuarios> getData() {
		return data;
	}

	public void setData(List<usuarios> data) {
		this.data = data;
	}
	
}
