package com.huang.store.entity.book;



public class SubBookTopic {
    private int topicId;//书单id
    private int bookId;
    private String recommendReason;//推荐理由

    public int getTopicId() {
        return topicId;
    }

    public void setTopicId(int topicId) {
        this.topicId = topicId;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getRecommendReason() {
        return recommendReason;
    }

    public void setRecommendReason(String recommendReason) {
        this.recommendReason = recommendReason;
    }

    @Override
    public String toString() {
        return "SubBookTopic{" +
                "topicId='" + topicId + '\'' +
                ", bookId=" + bookId +
                ", recommendReason='" + recommendReason + '\'' +
                '}';
    }
}
