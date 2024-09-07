package com.web.Controllers;

import com.web.Model.Producto;
import com.web.Model.ProductoDto;
import com.web.Service.ProductoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/productos")
public class ProductoController {

    @Autowired
    private ProductoRepository repo;

    @GetMapping({"","/listar"})
    public String listar_productos(Model model) {
        List<Producto> pro = repo.findAll(Sort.by(Sort.Direction.DESC, "id"));
        model.addAttribute("var_pro",pro);
        return "productos/index";
    }
    
    @GetMapping("/crear")
    public String crear_productos(Model model) {
        ProductoDto productodto = new ProductoDto();
        model.addAttribute("var_prodto",productodto);
        return "productos/CrearProducto";
    }
    
}
