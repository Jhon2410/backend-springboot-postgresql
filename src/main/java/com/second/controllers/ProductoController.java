package com.second.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/producto")
@CrossOrigin(origins = "*")
public class ProductoController {
/*
	@Autowired
	private ProductoDao productoDao;
	@GetMapping("/producto")
	public List<ProductoModel> getProductos() {
		return productoDao.findAll();
	}
	@PostMapping("/producto")
	public List<ProductoModel> SaveProduct (@RequestBody ProductoModel producto) {		
	    productoDao.save(producto);
	    return productoDao.findAll();
	}
	@PutMapping("/producto")
	public List<ProductoModel> PutProduct (@RequestBody ProductoModel producto) {		
	    productoDao.save(producto);
	    return productoDao.findAll();	
	}
	@DeleteMapping("/producto")
	public List<ProductoModel> DeleteProduct (@RequestBody ProductoModel producto) {		
	    productoDao.deleteById(producto.getId());
	    return productoDao.findAll();	
	}
	/*
	@PostMapping("/producto/p")
	public String SaveProductos ()  {
		//productoDao.save(producto);
		return "producto";
	}
	*/
	@RequestMapping("/")
	public String index() {
		return "Hola estamos en productos";
	}
}
