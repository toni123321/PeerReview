package com.g3.feedbackApp.Models.Converters;

import com.g3.feedbackApp.Models.DTOS.PostDTO;
import com.g3.feedbackApp.Models.PostModel;
import com.g3.feedbackApp.Models.VersionModel;

import java.util.List;

public class PostConverter {

    public PostModel convertPostDTOToPostModel(PostDTO postDTO){
        return new PostModel(postDTO.getPostId(), postDTO.getIdOP(), postDTO.getTitle(), postDTO.getCategory(), postDTO.getDescription(), postDTO.getPostDate(), postDTO.getResolveDate());
    }

    public PostDTO convertPostModelToPostDTO(PostModel postModel, List<VersionModel> versionModelList, List<Integer> reviewersIds){
        PostDTO dtoToReturn =  new PostDTO(postModel.getPostId(), postModel.getIdOP(), postModel.getTitle(), postModel.getCategory(), postModel.getDescription(), postModel.getPostDate(), postModel.getResolveDate());
        dtoToReturn.setVersions(versionModelList);
        dtoToReturn.setReviewersIds(reviewersIds);
        return dtoToReturn;
    }
}
