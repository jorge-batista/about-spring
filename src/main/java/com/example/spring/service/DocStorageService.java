package com.example.spring.service;

import com.example.spring.model.Doc;
import com.example.spring.repository.DocRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Optional;

@Service
public class DocStorageService {

    @Autowired
    private DocRepository docRepository;

    public Doc saveFile(MultipartFile file) {
        String docName = file.getOriginalFilename();
        try {
            Doc doc = new Doc(docName, file.getContentType(), file.getBytes());
            return docRepository.save(doc);
        } catch (Exception e) {
            System.out.println("Error message = " + e.getMessage());
            e.printStackTrace();
        }
        return null;
    }

    public Optional<Doc> getFile(Integer fileId) {
        return docRepository.findById(fileId);
    }

    public List<Doc> getFiles() {
        return docRepository.findAll();
    }

}
