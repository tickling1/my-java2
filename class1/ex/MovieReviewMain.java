package class1.ex;

public class MovieReviewMain {

    public static void main(String[] args) {

        MovieReview movieReview1 = new MovieReview();
        movieReview1.title = "타이타닉";
        movieReview1.review = "감동적인 영화";

        MovieReview movieReview2 = new MovieReview();
        movieReview2.title = "어바웃 타임";
        movieReview2.review = "시간 가는줄 모르는 영화";

        MovieReview[] movieReviews = {movieReview1, movieReview2};

        for (int i = 0; i < movieReviews.length; i++){
            System.out.println("영화 제목: " + movieReviews[i].title + "  영화 리뷰: " + movieReviews[i].review);
        }
        for (int i = 0; i < movieReviews.length; i++){
            MovieReview m = movieReviews[i];
            System.out.println("영화 제목: " + m.title + "  영화 리뷰: " + m.review);
        }
        for(MovieReview m : movieReviews){
            System.out.println("영화 제목: " + m.title + " | 영화 리뷰: " + m.review);
        }
    }
}
