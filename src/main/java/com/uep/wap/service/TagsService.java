package com.uep.wap.service;

import com.uep.wap.model.Tag;
import com.uep.wap.repository.TagRepository;
import com.uep.wap.dto.TagDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TagsService {

    @Autowired
    private TagRepository tagRepository;

    public void addTag(TagDTO tagDTO) {
        Tag tag = new Tag();
        tag.setTagID(tagDTO.getTagID());
        tagRepository.save(tag);
        System.out.println("Single tag added!");
    }

    public void addTags(Iterable<TagDTO> tags) {
        List<Tag> tagList = new ArrayList<>();
        for (TagDTO tagDTO : tags) {
            Tag tag = new Tag();
            tag.setTagID(tagDTO.getTagID());
            tagList.add(tag);
        }
        tagRepository.saveAll(tagList);
        System.out.println("Multiple tags added!");
    }

    public Iterable<Tag> getAllTags() {
        return tagRepository.findAll();
    }

    public void deleteTag(int tagId) {
        tagRepository.deleteById(tagId);
    }

    public void deleteAllTags() {
        tagRepository.deleteAll();
    }
}
