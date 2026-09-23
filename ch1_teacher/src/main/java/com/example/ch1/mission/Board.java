package com.example.ch1.mission;

import java.time.LocalDateTime;

public record Board
        (int bno, String title, String wirter, LocalDateTime createdAt, boolean isNotice) {
}
