package com.imooc.sell.service;

import com.imooc.sell.error.BusinessException;
import com.imooc.sell.service.model.ItemModel;

import java.util.List;

/**
 * @author Jeremy
 * @date 2020/2/14 23:44
 */
public interface ItemService {

    //创建商品
    ItemModel createItem(ItemModel itemModel) throws BusinessException;

    //商品列表浏览
    List<ItemModel> listItem();

    //商品详情浏览
    ItemModel getItemById(Integer id);
}
