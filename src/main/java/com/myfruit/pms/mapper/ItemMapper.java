package com.myfruit.pms.mapper;

import com.myfruit.pms.dto.ItemDTO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ItemMapper {
    void insertItem(ItemDTO itemDTO);
    ItemDTO getItemById(int id);
}
