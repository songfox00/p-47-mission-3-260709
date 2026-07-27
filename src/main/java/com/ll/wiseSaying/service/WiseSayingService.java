package com.ll.wiseSaying.service;

import com.ll.global.AppContext;
import com.ll.wiseSaying.entity.WiseSaying;
import com.ll.wiseSaying.repository.WiseSayingRepository;

import java.util.List;

public class WiseSayingService {
    String cmd = "";
    WiseSayingRepository wiseSayingRepository = AppContext.wiseSayingRepository;

    public WiseSaying findById(int id){
        return wiseSayingRepository.findById(id);
    }

    public List<WiseSaying> findAllIdDesc(){
        return wiseSayingRepository.findAllIdDesc();
    }

    public WiseSaying write(String content, String author){
        WiseSaying w1=new WiseSaying(author, content);
        WiseSaying savedWiseSaying = wiseSayingRepository.save(w1);

        return savedWiseSaying;
    }

    public void modify(WiseSaying w1, String content, String author){
        w1.setContent(content);
        w1.setAuthor(author);

        wiseSayingRepository.save(w1);
    }

    public boolean delete(int id){
        return wiseSayingRepository.delete(id);
    }

}
