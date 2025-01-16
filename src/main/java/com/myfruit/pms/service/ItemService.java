package com.myfruit.pms.service;

import com.myfruit.pms.dto.ItemDTO;
import com.myfruit.pms.mapper.ItemMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemService {

    @Autowired
    private ItemMapper itemMapper;

    public ItemDTO getItem(int id) {
        return itemMapper.getItemById(id);
    }
}

// 자바에서 함수는
// 접근제어자 리턴타입 메소드이름(){}