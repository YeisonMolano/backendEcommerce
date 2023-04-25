package com.bitech.ecommerce.controller;

import com.bitech.ecommerce.modells.Producto;
import com.bitech.ecommerce.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @PutMapping("/{idProducto}")
    public Producto updateProducto(@RequestBody Producto producto){
        return this.productoService.updateProducto(producto);
    }

    @PostMapping("/{idPoducto}")
    public void deleteProducto(@PathVariable("idProducto") Long idProducto){
        this.productoService.deleteProductoById(idProducto);
    }
}
