package com.myfruit.pms.Controller;

import com.myfruit.pms.dto.ItemDTO;
import com.myfruit.pms.mapper.ItemMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/items")
public class ItemController {

    @Autowired
    private ItemMapper itemMapper;

    @GetMapping("/create")
    public String create () {
        return "/shop/create-item";
    }

    @PostMapping
    @ResponseBody
    public void createItem(@RequestBody ItemDTO itemDTO) {
        System.out.println(itemDTO.getItem());
        itemMapper.insertItem(itemDTO);
    }
}
