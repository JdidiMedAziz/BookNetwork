package com.jdidi.book_network.user;


import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity

public class Tocken {


    @Id
    @GeneratedValue
    private Integer id;
    private String tocken;
    private LocalDateTime createdAt;
    private LocalDateTime expiredAt;
    private LocalDateTime validatedAt;

    @ManyToOne
    @JoinColumn(name="userId",nullable = false)
    private User user;
}
