package com.bitech.ecommerce.controller;

import com.bitech.ecommerce.modells.Pedido;
import com.bitech.ecommerce.service.PedidoService;
import com.bitech.ecommerce.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = {"http://localhost:4200/" , "http://localhost:8080/"})
@RequestMapping("/pedido")
public class PedidoController {
    @Autowired
    private PedidoService pedidoService;
    @Autowired
    private ProductoService productoService;

    @GetMapping("/get-all")
    public Iterable<Pedido> pedidos(){
        return this.pedidoService.getAll();
    }

    @PostMapping("/new-pedido")
    public Pedido newPedido(@RequestBody Pedido newPedido){
        this.productoService.compraRealizada(newPedido.getCantidad(), newPedido.getProducto().getIdProducto());
        return this.pedidoService.newPedido(newPedido);
    }

    @PutMapping("/{idPedido}")
    public Pedido updatePedido(@RequestBody Pedido pedido){
        return this.pedidoService.updatePedido(pedido);
    }

    @DeleteMapping("/{idPoducto}")
    public void deletePedido(@PathVariable("idProducto") Long idPedido){
        this.pedidoService.deletePedidoById(idPedido);
    }
}
