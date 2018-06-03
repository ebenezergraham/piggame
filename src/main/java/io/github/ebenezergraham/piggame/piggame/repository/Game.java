package io.github.ebenezergraham.piggame.piggame.repository;

import javax.persistence.*;

@Entity
public class Game {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(nullable = false, unique = true)
    private String title;

    @Column(nullable = true)
    private int duration;

    @Column(nullable = false)
    private String player1;

    @Column(nullable = false)
    private String player2;

    @Column(nullable = false)
    private int player1Score;

    @Column(nullable = false)
    private int player2Score;
}
