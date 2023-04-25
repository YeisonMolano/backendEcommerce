package com.bitech.ecommerce.controller;

import com.bitech.ecommerce.modells.Pedido;
import com.bitech.ecommerce.service.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = {"http://localhost:4200/" , "http://localhost:8080/"})
@RequestMapping("/pedido")
public class PedidoController {
    @Autowired
    private PedidoService pedidoService;

    @GetMapping("/get-all")
    public Iterable<Pedido> pedidos(){
        return this.pedidoService.getAll();
    }

    @PostMapping("/new-pedido")
    public Pedido newPedido(@RequestBody Pedido newPedido){
        return this.pedidoService.newPedido(newPedido);
    }

    @PutMapping("/{idPedido}")
    public Pedido updatePedido(@RequestBody Pedido pedido){
        return this.pedidoService.updatePedido(pedido);
    }

    @PostMapping("/{idPoducto}")
    public void deletePedido(@PathVariable("idProducto") Long idPedido){
        this.pedidoService.deletePedidoById(idPedido);
    }
}
