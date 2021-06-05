package org.wecancoeit.reviews;


import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;


@Repository
public class ReviewRepository {

    Map<Long, Review> reviewsList = new HashMap<>();


    public ReviewRepository() {
        Review pabloHoney = new Review(1L, "Pablo Honey", "content placement whatever", 1993, 4, "/images/pablo_honey.jpg");
        Review theBends = new Review(2L, "the Bends", "content placement whatever", 1995, 5, "/images/the_bends.jpg");
        Review okComputer = new Review(3L, "Ok Computer", "content placement whatever", 1997, 2, "/images/ok_computer");
        Review kidA = new Review(4L, "Kid A", "content placement whatever", 2000, 7, "/images/kid_a.jpg");
        Review amnesiac = new Review(5L, "Amnesiac", "content placement whatever", 2001, 9, "/images/amnesiac.jpg");
        Review hailToTheThief = new Review(6L, "Hail to the Thief", "content placement whatever", 2003, 8, "/images/hail_to_the_thief.jpg");
        Review inRainbows = new Review(7L, "In Rainbows", "content placement whatever", 2007, 1, "/images/in_rainbows.jpg");
        Review theKingOfLimbs = new Review(8L, "the King of Limbs", "content placement whatever", 2011, 3, "/images/the_king_of_limbs.jpg");
        Review aMoonShapedPool = new Review(9L, "A Moon Shaped Pool", "content placement whatever", 2016, 6, "/images/a_moon_shaped_pool.jpg");

        reviewsList.put(pabloHoney.getId(), pabloHoney);
        reviewsList.put(theBends.getId(), theBends);
        reviewsList.put(okComputer.getId(), okComputer);
        reviewsList.put(kidA.getId(), kidA);
        reviewsList.put(amnesiac.getId(), amnesiac);
        reviewsList.put(hailToTheThief.getId(), hailToTheThief);
        reviewsList.put(inRainbows.getId(), inRainbows);
        reviewsList.put(theKingOfLimbs.getId(), theKingOfLimbs);
        reviewsList.put(aMoonShapedPool.getId(), aMoonShapedPool);
    }

    public ReviewRepository(Review ...reviewsToAdd) {
        for(Review review: reviewsToAdd) {
            reviewsList.put(review.getId(), review);
        }
    }

    public Review findOne(long id) {
        return reviewsList.get(id);
    }

    public Collection<Review> findAll() {
        return reviewsList.values();
    }
}
