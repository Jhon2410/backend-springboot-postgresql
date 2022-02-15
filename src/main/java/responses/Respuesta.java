package responses;

import java.util.List;

import com.second.models.usuarioModel;

public class Respuesta {

	private String msg;
	private List<usuarioModel> data;
	private int status;
	public List<usuarioModel> getData() {
		return data;
	}
	public void setData(List<usuarioModel> data) {
		this.data = data;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	
}
