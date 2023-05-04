package com.icia.board.dto;

import java.sql.Timestamp;

public class CommentDTO {
    private Long id;
    private String commentWriter;
    private String commentContents;
    private Long boardId;
    private Timestamp commentCreatedDate;
}
