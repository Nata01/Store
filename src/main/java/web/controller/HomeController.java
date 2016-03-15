package web.controller;

import core.dao.ProductDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
    @Autowired
    ProductDao productDao;

    @RequestMapping("")
    public String index(){
        return "home";
    }

    @RequestMapping("/products")
    public String smth(ModelMap model){
        model.addAttribute("productNames", productDao.getAllProductNames());
        return "product-list";
    }

    @RequestMapping(value = "product/create", method = RequestMethod.GET)
    public String createProduct(){
        return "create-product";
    }

    @RequestMapping(value = "product/create", method = RequestMethod.POST)
    public String createProductHandler(ModelMap model, @RequestParam("product") String product){
        model.addAttribute("product", product);
        return "create-product-success";
    }
}
