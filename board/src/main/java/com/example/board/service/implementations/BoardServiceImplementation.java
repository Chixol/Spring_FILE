package com.example.board.service.implementations;

import java.util.*;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.board.dto.response.ResponseCode;
import com.example.board.dto.response.ResponseDto;
import com.example.board.dto.response.ResponseMessage;
import com.example.board.dto.response.board.GetLatestListResponseDto;
import com.example.board.dto.response.board.item.BoardListItem;
import com.example.board.repository.BoardRepository;
import com.example.board.service.BoardService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class BoardServiceImplementation implements BoardService {
    private final BoardRepository boardRepository;

    @Override
    public ResponseEntity<? super GetLatestListResponseDto> getLatestList() {
        try {
            // 1. 데이터베이스에서 최신순으로 데이터를 조회
            
        } catch (Exception exception) {
            return ResponseDto.databaseError();
            // DTO 작업 안했으면 아래같이 작업해야함
            // ResponseDto body = new ResponseDto(ResponseCode.DATABASE_ERROR, ResponseMessage.DATABASE_ERROR);
            // return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(body);
        }

        // 2. 조회 결과를 BoardListItem의 리스트로 변경
        List<BoardListItem> latestList = new ArrayList<>();

        // 3. 변경후 DTO로 성공 데이터를 Controller에 반환
        return GetLatestListResponseDto.success(latestList);
        // DTO 작업 안했으면 아래같이 작업해야함
        // GetLatestListResponseDto body = new GetLatestListResponseDto (latestList);
        // return ResponseEntity.status(HttpStatus.OK).body(body);
    }
}
