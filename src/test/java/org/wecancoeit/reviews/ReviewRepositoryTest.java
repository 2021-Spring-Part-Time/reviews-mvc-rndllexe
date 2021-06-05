package org.wecancoeit.reviews;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Collection;


public class ReviewRepositoryTest {

    private Review pabloHoney = new Review(1L, "Pablo Honey", "lorem ipsum", 1993, 1, "");
    private Review theBends = new Review(2L, "the Bends", "lorem ipsum", 1995, 2, "");
    private ReviewRepository underTest = new ReviewRepository(pabloHoney);

/*    @Test
    public void shouldFindPabloHoney() {
        underTest = new ReviewRepository(pabloHoney);
        Review foundReview = underTest.findOne(1L);
        assertEquals(pabloHoney, foundReview);
    }*/

    @Test
    public void shouldFindPabloHoneyAndTheBends() {
        underTest = new ReviewRepository(pabloHoney, theBends);
        Collection<Review> foundReviews = underTest.findAll();
        assertThat(foundReviews).contains(pabloHoney, theBends);
    }
}
