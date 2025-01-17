package com.myfruit.pms.Controller;

import com.myfruit.pms.dto.ItemDTO;
import com.myfruit.pms.mapper.ItemMapper;
import com.myfruit.pms.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/items")
public class ItemController {

    @Autowired
    private ItemMapper itemMapper;

    @Autowired
    ItemService itemService;

    @GetMapping("/create")
    public String create () {
        return "/shop/create-item";
    }


    @PostMapping
    @ResponseBody
    public void createItem(@RequestBody ItemDTO itemDTO) {
        System.out.println(itemDTO.getItem());
        itemService.createItem(itemDTO);
    }

    @GetMapping("/{id}")
//    @ResponseBody
    public String getItem(@PathVariable("id") int id, Model model) {
        try {
            ItemDTO itemDTO = itemService.getItem(id);
            model.addAttribute("item", itemDTO);
        } catch (IllegalStateException e) {
            model.addAttribute("message", e.getMessage());
            return "/error/404";
        }
        return "shop/detail";
    }


    @GetMapping
    public String getItems(Model model) {
        List<ItemDTO> items = itemService.getItems();
        model.addAttribute("items", items);

        return "shop/list";
    }

    // 생성 페이지 GET /items/create
    // 생성 POST /items
    // 상세보기 GET /items/{id}
    // 수정 POST /items/{id}
    // 삭제 GET /items/{id}/delete


    // 생성 페이지 GET /items/create
    // 생성 POST /items
    // 상세보기 GET /items/{id}
    // 수정 PUT /items/{id}
    // 삭제 DELETE /items/{id}

}
