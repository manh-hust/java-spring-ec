package com.ecommerce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ecommerce.dto.ProductDTO;
import com.ecommerce.service.ProductService;

import lombok.RequiredArgsConstructor;

@Controller
@RequestMapping("/products")
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class ProductController {

    private final ProductService productService;

    @GetMapping("/{id}")
    public String showProductDetail(@PathVariable long id, Model model) {
        ProductDTO product = productService.get(id);
        model.addAttribute("product", product);
        return "user/product/show";
    }
}
