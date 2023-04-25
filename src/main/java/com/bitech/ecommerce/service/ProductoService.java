package com.bitech.ecommerce.service;

import com.bitech.ecommerce.modells.Producto;

import java.util.Optional;

public interface ProductoService {
    Producto newProducto(Producto newProducto);
    Optional<Producto> ifExist(Long idProducto);
    void deleteProductoById(Long idProducto);
    Producto updateProducto(Producto producto);
    Iterable<Producto> getAll();
}
