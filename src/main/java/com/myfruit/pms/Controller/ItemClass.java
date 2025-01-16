package com.myfruit.pms.Controller;

import com.myfruit.pms.dto.ItemDTO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/items")
public class ItemClass {

    @GetMapping("/create")
    public String create () {
        return "/shop/create-item";
    }

    @PostMapping
    public void createItem(@RequestBody ItemDTO itemDTO) {
        System.out.println(itemDTO.getItem());
    }
}
