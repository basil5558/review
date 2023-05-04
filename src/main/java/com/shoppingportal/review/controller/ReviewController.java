package com.shoppingportal.review.controller;

 

import java.util.List;

 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

 

import com.shoppingportal.review.model.Review;
import com.shoppingportal.review.service.ReviewService;

 

 


@RestController
public class ReviewController {

        private static final String DELETE_MESSAGE = "Deleted Successfully";

        @Autowired 
        private ReviewService ReviewService;

        // Save operation
        @PostMapping("/Reviews")
        public Review saveReview(@Validated @RequestBody Review Review)
        {
            return ReviewService.saveReview(Review);
        }

        // Read operation
        @GetMapping("/Reviews")
        public List<Review> fetchReviewList(Pageable page)
        {
            return ReviewService.fetchReviewList(page);
        }

        // Read operation
        @GetMapping("/Reviews/{id}")
        public Review fetchReviewById(@PathVariable("id") long ReviewId)
        {
            return ReviewService.getReviewById(ReviewId);
        }

       // Read operation
        @GetMapping("/Reviews/user/{username}")
        public List<Review> findAllReviewUsersNative(@PathVariable("username") String username) {

 

            return ReviewService.findAllReviewUsersNative(username);
        }

 

        // Read operation
        @GetMapping("/Reviews/product/{productId}")
        public List<Review> findAllReviewNative(@PathVariable("productId") String productId) {

            return ReviewService.findAllReviewNative(productId);
        }

 

      
        // Update operation
        @PatchMapping("/Reviews/{id}")
        public Review updateReview(@RequestBody Review Review,@PathVariable("id") long ReviewId)
        {
            return ReviewService.updateReview(Review, ReviewId);
        }

        // Delete operation
        @DeleteMapping("/Reviews/{id}")
        public String deleteReviewById(@PathVariable("id") long ReviewId)
        {
            ReviewService.deleteReviewById(ReviewId);
            return DELETE_MESSAGE;
        }
    }
