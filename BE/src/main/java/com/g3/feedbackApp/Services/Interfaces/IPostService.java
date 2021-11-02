package com.g3.feedbackApp.Services.Interfaces;

import com.g3.feedbackApp.Models.PostModel;
import com.g3.feedbackApp.Models.VersionModel;

import java.util.List;

public interface IPostService {

    Boolean createPost(PostModel postModel, String filePath, List<Integer> reviewersIds);
    PostModel getPostWithId(int postId);
    VersionModel getVersionWithId(int versionId);
    List<VersionModel> getVersionsForPost(int postId);
    List<Integer> getReviewersIdsForPost(int postId);

}
