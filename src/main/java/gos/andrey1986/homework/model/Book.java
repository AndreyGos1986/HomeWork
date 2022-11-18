package gos.andrey1986.homework.model;

import javax.persistence.*;

@Entity
    public class Book {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private long id;
        @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
        @JoinColumn(name = "author_id")
        private Author author;
    }


