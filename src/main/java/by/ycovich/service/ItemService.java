package by.ycovich.service;

import by.ycovich.model.Item;
import by.ycovich.model.Person;
import by.ycovich.repository.ItemsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = true)
public class ItemService {
    private final ItemsRepository itemsRepository;

    @Autowired
    public ItemService(ItemsRepository itemsRepository) {
        this.itemsRepository = itemsRepository;
    }

    public List<Item> findByItemName(String itemName){
        return itemsRepository.findByName(itemName);
    }

    public List<Item> findByOwner(Person owner){
        return itemsRepository.findByOwner(owner);
    }




}
