package com.uep.wap.service;

import com.uep.wap.model.Photo;
import com.uep.wap.repository.PhotoRepository;
import com.uep.wap.dto.PhotoDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PhotosService {

    @Autowired
    private PhotoRepository photoRepository;

    public void addPhoto(PhotoDTO photoDTO) {
        Photo photo = new Photo();
        photo.setPhotoID(photoDTO.getPhotoID());
        photoRepository.save(photo);
        System.out.println("Single photo added!");
    }

    public void addPhotos(Iterable<PhotoDTO> photos) {
        List<Photo> photoList = new ArrayList<>();
        for (PhotoDTO photoDTO : photos) {
            Photo photo = new Photo();
            photo.setPhotoID(photoDTO.getPhotoID());
            photoList.add(photo);
        }
        photoRepository.saveAll(photoList);
        System.out.println("Multiple photos added!");
    }

    public Iterable<Photo> getAllPhotos() {
        return photoRepository.findAll();
    }

    public void updatePhoto(int photoID, String photoUrl, String photoTags) {

        System.out.println("updatePhoto: " + photoID + "url: " + photoUrl + "tags: " + photoTags);

        photoRepository.updatePhotoPropertiesById(photoID, photoUrl, photoTags);
        System.out.println("Photo updated!");
    }

    public void deletePhoto(int photoId) {
        photoRepository.deleteById(photoId);
    }

    public void deleteAllPhotos() {
        photoRepository.deleteAll();
    }
}
