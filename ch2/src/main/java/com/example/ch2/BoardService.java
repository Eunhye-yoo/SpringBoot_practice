package com.example.ch2;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BoardService {
    private final BoardRepository boardRepository;

    // 전체 게시물 조회
    public List<Board> getList(){
        return boardRepository.findAll();
    }

    // 게시물 저장
    public Board write(Board board){
        return boardRepository.save(board);
    }

    // 게시물 상세보기 (없으면 null 반환)
    public Board read(Long bno){
        return boardRepository.findById(bno).orElse(null);
    }

    // 게시물 수정
    // 클라이언트가 요청한 newBoard를 그대로 save하면 안됨
    // 게시글 수정 폼에는 title/content만 있기때문에 나머지 Board의 필드는 null 또는 초기화
    // -> DB에서 원본 게시글 읽기 -> 바뀐 필드만 수정
    public Board modify(Board newBoard){
        Board board = boardRepository.findById(newBoard.getBno()).orElse(null);
        if(board == null) return null;

        board.setTitle(newBoard.getTitle());
        board.setContent(newBoard.getContent());
        return boardRepository.save(board);
    }

    // 게시물 삭제 (게시글 확인 후 삭제)
    public void remove(Long bno){
        Board board = boardRepository.findById(bno).orElse(null);
        if(board != null){
            boardRepository.deleteById(bno);
        }
    }
}
