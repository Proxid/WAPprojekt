package com.uep.wap.repository;

import com.uep.wap.model.Photo;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

public interface PhotoRepository extends PagingAndSortingRepository<Photo, Integer> {
    @Modifying
    @Query("UPDATE Photo p SET p.photoUrl = :photoUrl, p.photoTags = :photoTags WHERE p.photoID = :photoID")
    void updatePhotoPropertiesById(@Param("photoID") int photoID, @Param("photoUrl") String photoUrl, @Param("photoTags") String photoTags);
}
