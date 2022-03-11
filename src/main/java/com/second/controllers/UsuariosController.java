package com.second.controllers;



import java.util.ArrayList;
import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.second.dao.CoustomDao;
import com.second.dao.EstadisticasDao;
import com.second.dao.NetworkDao;
import com.second.dao.PersonaInfoDao;
import com.second.dao.UsuarioDao;
import com.second.dao.WalletDao;
import com.second.models.Coustom_info_user;
import com.second.models.Network;
import com.second.models.Personalinfo;
import com.second.models.Wallet;
import com.second.models.estadisticas_wallet;
import com.second.models.usuarios;

import responses.Respuesta;
import responses.RespuestaUsuario;
import security.encoder;
@RestController
@RequestMapping("/usuarios")
@CrossOrigin(origins = "*")
public class UsuariosController {
	// inyeccion de dependencias o dao
	@Autowired
	private UsuarioDao usuarioDao;
	
	@Autowired
	private WalletDao walletDao;
	
	@Autowired
	private PersonaInfoDao personalinfoDao;
	
	@Autowired
	private CoustomDao coustomDao;
	
	@Autowired
	private EstadisticasDao estadisticaDao;
	
	 @Autowired
	 private NetworkDao networkDao;
	
	
	
	// leer usuarios perticion get endponit /usuarios
	@GetMapping("/")
	public RespuestaUsuario getUsuarios() {
		RespuestaUsuario res = new RespuestaUsuario();
		try {
			usuarioDao.findAll();
			List<usuarios> usuario = usuarioDao.findAll();
			  for (int i=0;i<usuario.size();i++) {
				  usuarios usu = usuario.get(i);
				  usu.setUsuario_contraseña("");
			  }
			res.setMsg("consulta exitosa");
			res.setData(usuario);
			res.setStatus(1);
		}catch(Exception E) {
			System.out.print(E);
			res.setMsg("Error");
			res.setData(null);
			res.setStatus(0);
		}
		return res; 
	}

	
	@RequestMapping("/a")
	@CrossOrigin(origins = "*")
	public Respuesta a () {
		Respuesta res = new Respuesta();
		return res;
	}
	// Registrar usuario
	@PostMapping("/create")	
	public RespuestaUsuario registrar(@RequestBody usuarios usuario) {
		RespuestaUsuario res = new RespuestaUsuario(); 
		System.out.print(usuario.getUsuario_username());
		try{
			if(usuario.getUsuario_username() == null || usuario.getUsuario_contraseña() == null) {
				res.setMsg("El usuario no pudo ser registrado.");
				res.setStatus(0);
			}
			else {
				List<usuarios> todosUsuarios = usuarioDao.findAll();
				  for (int i=0;i<todosUsuarios.size();i++) {
					  	usuarios u = todosUsuarios.get(i);
					    if(u.getUsuario_username().equals(usuario.getUsuario_username())) {
					    	//respondiendo en caso de que ya exista el usuario
							res.setMsg("Ya existe un usuario con esta cuenta.");
							res.setStatus(0);
							return res;
					    }
				  }
				Wallet wallet = new Wallet();
				estadisticas_wallet  eWallet = new estadisticas_wallet();
				Personalinfo personalinformation = new Personalinfo();
				Coustom_info_user ciu = new Coustom_info_user();
				//iniciando network
				Network net = new Network();
				// iniciando las estadisticas de la wallet del usuario
				eWallet.setApostado(0);
				eWallet.setPrestado(0);
				eWallet.setRecargado(0);
				eWallet.setRetirado(0);
				estadisticas_wallet ew =  estadisticaDao.save(eWallet);
				// creando la informacion personal.
				personalinformation.setFirst_name("");
				personalinformation.setLast_name("");
				personalinformation.setCode_country(5);
				personalinformation.setEmail("persona@persona.com");
				personalinformation.setCountry("");
				Personalinfo peInfo = personalinfoDao.save(personalinformation);
				// creando la informacion personalizada.
				ciu.setLenguaje("es");
				ciu.setPricing("usd");
				ciu.setTheme("white");
				//creando coustom info
				Coustom_info_user coustominfo =  coustomDao.save(ciu);
				// creando la wallet 
				wallet.setEstadisticas(ew.getId_estadistica_walletl());
				wallet.setEstado("wallet con estadistica");
				wallet.setStarts(0);
				Wallet w = walletDao.save(wallet);
				//creando el usuario
				usuario.setCoustom_info(coustominfo.getId_coustom_info());
				usuario.setWallet(w.getId_wallet());
				usuario.setPersonalInfo(peInfo.getId_personalInfo());
				encoder crypto = new encoder();
				usuario.setUsuario_contraseña(crypto.ecnode(usuario.getUsuario_contraseña()));
				usuario.setFoto_url("https://www.pngmart.com/files/21/Account-User-PNG-Transparent.png");
				usuarios miUsuario = usuarioDao.save(usuario);
				miUsuario.setUsuario_contraseña("");
				List<usuarios> data = new ArrayList<>();
				net.setUsuario_net(miUsuario.getId_usuario());
				networkDao.save(net);
				data.add(miUsuario);
				//creando su network
				net.setUsuario_net(miUsuario.getId_usuario());
				//respondiendo
				res.setMsg("usuario registrado con exito.");
				res.setStatus(1);
				res.setData(data);
			}
		 }catch(Exception e) {
			 res.setMsg("usuario NO se pudó registrar.");
			 res.setStatus(0);
		 }
		return res;
	}
	
	
	//verificar usuario
	@PostMapping("/validar")
	public RespuestaUsuario validar(@RequestBody usuarios usuario) {
		RespuestaUsuario res = new RespuestaUsuario();
		String msg = "usuario o contraseña incorrectos";
		Integer status = 0;
		encoder crypto = new encoder();
		if(usuario.getUsuario_contraseña()== null || usuario.getUsuario_contraseña() == null) {
			return res;
		}
		List<usuarios> todosUsuarios = usuarioDao.findAll();
		List<usuarios> miUsuario = new ArrayList<>();
		  for (int i=0;i<todosUsuarios.size();i++) {     
			  	usuarios u = todosUsuarios.get(i);
			    if(u.getUsuario_username().equals(usuario.getUsuario_username()) && usuario.getUsuario_contraseña().equals(crypto.deecnode(u.getUsuario_contraseña()))) {
			    	miUsuario.add(u);
			    	msg = "exito";
			    	res.setData(miUsuario);
			    	status = 1;
			    }
		      }
		  res.setMsg(msg);
    	  res.setStatus(status);
		return res;
	}
}
