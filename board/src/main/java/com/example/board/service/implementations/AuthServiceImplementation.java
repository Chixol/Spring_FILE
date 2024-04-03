package com.example.board.service.implementations;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.board.dto.request.auth.SignUpRequestDto;
import com.example.board.dto.response.ResponseDto;
import com.example.board.entity.UserEntity;
import com.example.board.repository.UserRepository;
import com.example.board.service.AuthService;

@Service
public class AuthServiceImplementation implements AuthService{

    private final 

    @Override
    public ResponseEntity<ResponseDto> signUp(SignUpRequestDto dto) {

            try {

                // 1.입력받은 이메일이 테이블에 존재하는지 조회 email -> (true, false 형태)
                // 1-1. 1에 대한 조회 결과가 true이면 중복된 이메일 응답 처리

                // 2.입력받은 닉네임이 테이블에 존재하는지 조회 nickname -> (true, false 형태)
                // 2-1. 2에 대한 조회 결과가 true이면 중복된 닉네임 응답 처리

                // 3.입력받은 휴대전화 번호가  테이블에 존재하는지 조회 telNumber -> (true, false 형태)
                // 3-1. 1에 대한 조회 결과가 true이면 중복된 휴대전화 번호 응답 처리

                // 4. 유저 레코드 삽입
                // 4-1. 유저 엔터티의 인스턴스 생성 (dto) -> userEntity 인스턴스
                // 4-2. 유저 엔터티 인스턴스 저장

                // 5. 성공 응답 처리

            } catch (Exception exception) {

                // 데이터베이스 작업중에 발생하는 예외 데이터베이스 에러 처리
                exception.printStackTrace();
                return ResponseDto.databaseError();

            }

    }
    
}
