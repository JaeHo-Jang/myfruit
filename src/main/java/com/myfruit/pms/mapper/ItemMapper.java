package com.myfruit.pms.mapper;

import com.myfruit.pms.dto.ItemDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Optional;

@Mapper
public interface ItemMapper {
    //ItemDTO insertItem(ItemDTO itemDTO);
    //int insertItem(ItemDTO itemDTO);
    void insertItem(ItemDTO itemDTO);
    Optional<ItemDTO> getItemById(int id);
    List<ItemDTO> getItems();
    void updateItem(ItemDTO itemDTO);
    void deleteItem(int id);
}
