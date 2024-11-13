package org.xproce.problem;

public class Book {

    private Integer id;
    private String title;
    private String author;

    private Book(Integer id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
    }

    private Book(Builder builder) {
        this.id = builder.id;
        this.title = builder.title;
        this.author = builder.author;
    }
//Book( Builder )
    //Book.builder()  ---> Builder
        // =>  Builder.id() ---> Builder
            // => Builder.title(" ") ---> Builder
                // => Builder.author(" ") ---> Builder
                    // Builder.build()  ---> Book

    public static Builder builder(Integer id, String name) {
        return new Builder();
    }

    public static class Builder {
        private Integer id;
        private String title;
        private String author;


        public Builder id(Integer id) {
            this.id = id;
            return this;
        }

        public Builder title(String title) {
            this.title = title;
            return this;
        }

        public Builder author(String author) {
            this.author = author;
            return this;
        }


        public Book build(){
            return new Book(this);
        }

    }

}
