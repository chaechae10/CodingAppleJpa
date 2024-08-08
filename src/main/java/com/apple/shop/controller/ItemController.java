package com.apple.shop.controller;

import com.apple.shop.domain.Item;
import com.apple.shop.repository.ItemRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@Controller
@RequiredArgsConstructor
public class ItemController {
    private final ItemRepository itemRepository;


    @GetMapping("/list")
    String list(Model model){
        List<Item> result = itemRepository.findAll();
        model.addAttribute("items",result);
        return "list.html";
    }

    @GetMapping("/write")
    String write(){
        return "write.html";
    }

    @PostMapping("/add")
    String addPost(@RequestParam String title, @RequestParam Integer price) {
        Item item = new Item();
        item.setTitle(title);
        item.setPrice(price);
        itemRepository.save(item);//테이블에 하나의 행으로 저장해줄 것.
        return "redirect:/list";
    }

    @GetMapping("/detail/{id}")
    String detail(@PathVariable Long id,Model model) throws Exception{
        throw new Exception();
            /*Optional<Item> reult = itemRepository.findById(id);
            if (reult.isPresent()) {
                model.addAttribute("data", reult.get());
                return "detail.html";
            } else {
                return "redirect:/list";
            }*/
    }
}
