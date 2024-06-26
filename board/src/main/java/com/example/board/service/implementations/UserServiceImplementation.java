package com.example.board.service.implementations;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.board.dto.request.user.PatchNicknameRequestDto;
import com.example.board.dto.response.ResponseDto;
import com.example.board.dto.response.user.GetUserResponseDto;
import com.example.board.entity.UserEntity;
import com.example.board.repository.UserRepository;
import com.example.board.service.UserService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserServiceImplementation implements UserService {

    private final UserRepository userRepository;
    
    @Override
    public ResponseEntity<? super GetUserResponseDto> getUser(String email) {

        try {
            // 1. User 테이블에서 email에 해당하는 유저 조회
            // SELECT * FROM user WHERE email = :email
            // findByEmail(email)
            // (email -> (조회 결과 인스턴스))
            UserEntity userEntity = userRepository.findByEmail(email); 

            // 2. 조회 결과에 따라 반환 결정
            // 1) false이면 존재하지 않는 유저 응답처리 x (true, false 형태면 효율적이지 않음)
            // 2) null 이면 존재하지 않는 유저 응답처리 
            if (userEntity == null) return ResponseDto.notExistUser();
            
            // 3. 조회 결과 데이터를 성공 응답
            return GetUserResponseDto.success(userEntity);
            
        } catch (Exception exception) {

        // 1-1. 조회 처리 중 데이터베이스 관련 예외가 발생하면 데이터베이스 에러 응답 처리 (try-catch)
            exception.printStackTrace(); //터미널에 어떤 에러가 떳는지 확인하는 쿼리
            return ResponseDto.databaseError();
        }


    }

    @Override
    public ResponseEntity<ResponseDto> PatchNickname(PatchNicknameRequestDto dto) {

        try {

            String nickname = dto.getNickname();
            boolean isExistNickname = userRepository.existsByNickname(nickname);
            if (isExistNickname) return ResponseDto.duplicateNickname();
            
            String email = dto.getEmail();
            UserEntity userEntity = userRepository.findByEmail(email);
            if (userEntity == null) return ResponseDto.notExistUser();

            userEntity.setNickname(nickname);
            userRepository.save(userEntity);

            return ResponseDto.success();

        } catch (Exception exception) {
            
            exception.printStackTrace();
            return ResponseDto.databaseError();

        }
    }
    
    
}