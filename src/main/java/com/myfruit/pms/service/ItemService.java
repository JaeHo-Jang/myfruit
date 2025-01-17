package com.myfruit.pms.service;

import com.myfruit.pms.dto.ItemDTO;
import com.myfruit.pms.mapper.ItemMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ItemService {

    @Autowired
    private ItemMapper itemMapper;

    public void createItem(ItemDTO itemDTO) {
        itemMapper.insertItem(itemDTO);
    }

    public ItemDTO getItem(int id) {
        // NullException
        return itemMapper.getItemById(id).orElseThrow(
                () -> new IllegalStateException("파일을 찾을 수 없습니다.")
        );
    }

    public List<ItemDTO> getItems() {
        return itemMapper.getItems();
    }

    public void modify(ItemDTO itemDTO) {
        itemMapper.updateItem(itemDTO);
    }

    public void remove(int id) {
        itemMapper.deleteItem(id);
    }
}

// 자바에서 함수는
// 접근제어자 리턴타입 메소드이름(){}