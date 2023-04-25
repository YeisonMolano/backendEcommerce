package com.bitech.ecommerce.controller;

import com.bitech.ecommerce.modells.Producto;
import com.bitech.ecommerce.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = {"http://localhost:4200/" , "http://localhost:8080/"})
@RequestMapping("/producto")
public class ProductoController {
    @Autowired
    private ProductoService productoService;
    @GetMapping("/get-all")
    public Iterable<Producto> productos(){
        return this.productoService.getAll();
    }

    @PostMapping("/new-producto")
    public Producto newProducto(@RequestBody Producto newProducto){
        return this.productoService.newProducto(newProducto);
    }

    @PutMapping(value =  "/{idProducto}")
    public Producto updateProducto(@RequestBody Producto producto){
        return this.productoService.updateProducto(producto);
    }

    @DeleteMapping("/{idProducto}")
    public void deleteProducto(@PathVariable(value = "idProducto") Long idProducto){
        this.productoService.deleteProductoById(idProducto);
    }
}
