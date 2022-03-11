package responses;

import java.util.List;

import com.second.models.Friends;

public class RespuestaAmigos extends Respuesta {
	private List<Friends> data;
	public List<Friends> getData() {
		return data;
	}
	public void setData(List<Friends> data) {
		this.data = data;
	}
}
